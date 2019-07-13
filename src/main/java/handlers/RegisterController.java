package handlers;

import bean.Admin;
import bean.Question;
import bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.RegisterServiceImpl;
import utils.CaptchaUtil;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RegisterController {
    @Autowired
    RegisterServiceImpl service;

    @RequestMapping("getAllQuestion.do")
    @ResponseBody
    public List<Question> getAllQuestion(){
       return service.getAllQuestion();
    }


//    注册
    @RequestMapping("register.do")
    @ResponseBody
    public void Register(HttpServletRequest request, HttpServletResponse response, String phone, String password, String name, String identityCard, String email, int question1, String ansQuestionOne, int question2, String ansQuestionTwo) throws IOException {

        int questionOne = (question1);
        int questionTwo = (question2);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        if (service.isExistByPhone(phone)||service.adminIsExistByPhone(phone)) {
            out.print("<script language=\"javascript\">alert('保存失败！该手机号已经被注册');</script>");
        }

        if (!service.isExistByPhone(phone)&&!service.adminIsExistByPhone(phone)) {
            String wbh = service.getMaxWbh();
            Student student = new Student(name, password, identityCard, phone, email, wbh, questionOne, ansQuestionOne, questionTwo, ansQuestionTwo);


            service.stuRegister(student);


            if (service.isExistByPhone(phone)) {
//                System.out.println("学生信息已保存");

                out.print("<script language=\"javascript\">alert('保存成功！');window.location.href='denglu.jsp';</script>");
            } else {
                out.print("<script language=\"javascript\">alert('保存失败！');</script>");
            }
        }



    }

//    通过手机号查用户
    @RequestMapping("getStudentByPhone.do")
    @ResponseBody
    public boolean getStudentByPhone(String phone){
        return service.isExistByPhone(phone);
    }

    @RequestMapping("getQuestionByUserId.do")
    @ResponseBody
    public List<Question> getQuestionByUserId(HttpServletRequest request,String phone){

        if(phone!=""){
            return service.getQuestionByUserPhone(phone);
        }else{
            return null;
        }
    }

//
@RequestMapping("equilQuestion.do")
@ResponseBody
public String equilQuestion(HttpServletRequest request,String phone,String myAnswer1,String myAnswer2){
    Map map1= new HashMap<String,String>();
    Map map2= new HashMap<String,String>();
    map1.put("phone",phone);
    map1.put("ansQuestion",myAnswer1);

    map2.put("phone",phone);
    map2.put("ansQuestion",myAnswer2);

    Boolean one=service.equilQuestion(map1,map2);
    if(one==true){
        service.reSetPassword(map2);
        return "true";
    }else{
        return "false";
    }

}

    /***
     * 登录功能，
     * 包括cookie登录(拦截器)
     * 以及密码验证
     *
     */
    @RequestMapping("/Login.do")
    public String doLoginFindSession(String yzm,String phone,String password,HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        Student stu;
        Admin admin;
        String randomString= (String) request.getSession().getAttribute("randomString");

        if(request.getSession().getAttribute("student")==null&&request.getSession().getAttribute("admin")==null){
            admin=service.getAdminByPhoneAndPass(new Admin(phone,password));
            stu=service.getStudentByPhoneAndPass(new Student(phone,password));
            if(admin!=null){
                if ((randomString + "").equals(yzm)) {
                    request.getSession().setAttribute("admin", admin);
                    Cookie cookie1 = new Cookie("loginAdminPhone", phone);
                    cookie1.setMaxAge(24 * 3600);
                    response.addCookie(cookie1);
                    Cookie cookie2 = new Cookie("loginAdminPassword", password);
                    cookie2.setMaxAge(24 * 3600);
                    response.addCookie(cookie2);
                    return "AdminDesk.do";
                }else{
                    out.print("<script language=\"javascript\">alert('验证码错误！');window.location.href='denglu.jsp';</script>");
                    out.flush();
                    out.close();
                }

            }else if(stu!=null){
                    if ((randomString + "").equals(yzm)) {
                        request.getSession().setAttribute("student", stu);
//                        System.out.println(request.getSession().getAttribute("student"));
                        Cookie cookie1 = new Cookie("loginStudentPhone", phone);
                        cookie1.setMaxAge(24 * 3600);
                        response.addCookie(cookie1);
                        Cookie cookie2 = new Cookie("loginStudentPassword", password);
                        cookie2.setMaxAge(24 * 3600);
                        response.addCookie(cookie2);
                        return "desk.do";
                    } else {
                        out.print("<script language=\"javascript\">alert('验证码错误！');window.location.href='denglu.jsp';</script>");
                        out.flush();
                        out.close();
                    }
            }
        }else if(request.getSession().getAttribute("student")!=null){
            return "desk.do";
        }else{
            return "AdminDesk.do";
        }
        return "";


    }

    @RequestMapping("/desk.do")
    public String desk(){
        return "student/index.jsp";
    }

    @RequestMapping("/AdminDesk.do")
    public String AdminDesk(){
        return "index.jsp";
    }

    /***
     * 注销功能，
     * 包括cookie删除
     * 以及session user删除
     *
     */
    @RequestMapping("/LoginOut.do")
    public String doLoginOut(String id,String page,HttpServletRequest request, HttpServletResponse response){
        Cookie newCookie1=new Cookie("loginStudentPhone",null); //假如要删除名称为username的Cookie
        Cookie newCookie2=new Cookie("loginStudentPassword",null);
        Cookie newCookie3=new Cookie("loginAdminPhone",null);
        Cookie newCookie4=new Cookie("loginAdminPassword",null);
        newCookie1.setMaxAge(0); //立即删除型
        newCookie1.setPath("/"); //项目所有目录均有效，这句很关键，否则不敢保证删除
        newCookie2.setMaxAge(0); //立即删除型
        newCookie2.setPath("/"); //项目所有目录均有效，这句很关键，否则不敢保证删除
        newCookie3.setMaxAge(0); //立即删除型
        newCookie3.setPath("/"); //项目所有目录均有效，这句很关键，否则不敢保证删除
        newCookie4.setMaxAge(0); //立即删除型
        newCookie4.setPath("/"); //项目所有目录均有效，这句很关键，否则不敢保证删除
        response.addCookie(newCookie1); //重新写入，将覆盖之前的
        response.addCookie(newCookie2); //重新写入，将覆盖之前的
        response.addCookie(newCookie3); //重新写入，将覆盖之前的
        response.addCookie(newCookie4); //重新写入，将覆盖之前的
        request.getSession().removeAttribute("student");
        request.getSession().removeAttribute("admin");

        return "denglu.jsp";
    }


    /**
     * 生成登录验证码
     *
     * */
    @ResponseBody
    @RequestMapping(value = "verificationCode.do", method = RequestMethod.GET)
    public void doCreateVerificationCode(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        CaptchaUtil.outputCaptcha(request, response);

    }


//    测试
    @RequestMapping("test.do")
    @ResponseBody
    public Student test(HttpServletRequest request){
        return (Student) request.getSession().getAttribute("student");
    }

    @RequestMapping("getStudentName.do")
    @ResponseBody
    public String getStudentName(HttpServletRequest request){
        Student student= (Student) request.getSession().getAttribute("student");
        String name=service.getStudentName(student.getId());
        return name;
    }
    @RequestMapping("student/getStudentName.do")
    @ResponseBody
    public String getStudentName2(HttpServletRequest request){
        Student student= (Student) request.getSession().getAttribute("student");
        String name=service.getStudentName(student.getId());
        return name;
    }

    @RequestMapping("student/getStudentImage.do")
    @ResponseBody
    public String getStudentImage(HttpServletRequest request){
        Student student= (Student) request.getSession().getAttribute("student");
        if(student!=null){
            String image=service.getStudentImage(student.getId());
            return image;
        }else{
            return "";
        }

    }

}
