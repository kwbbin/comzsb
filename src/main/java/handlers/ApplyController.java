package handlers;

import bean.College;
import bean.Profession;
import bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import service.ApplyServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ApplyController  {
    @Autowired
    ApplyServiceImpl service;

    @RequestMapping("student/getAllProfession.do")
    @ResponseBody
    public List<Profession> getAllProfession(){
        return service.getAllProfession();
    }

    @RequestMapping("student/getAllCollege.do")
    @ResponseBody
    public  List<College> getAllCollege(){
        return service.getAllCollege();
    }

    @RequestMapping("student/getPhone.do")
    @ResponseBody
    public String getPhone(HttpServletRequest request){
        Student student=(Student) request.getSession().getAttribute("student");
        if(student!=null){
            return student.getPhone();
        }else{
            return "";
        }

    }

    @RequestMapping("student/getProOrder.do")
    @ResponseBody
    public String getProOrder(HttpServletRequest request,int proNum){
        return service.getProOrderByNum(proNum);

    }

    @RequestMapping("student/getIdentityCard.do")
    @ResponseBody
    public String getIdentityCard(HttpServletRequest request){
        Student student=(Student) request.getSession().getAttribute("student");
        return service.getIdentityCard(student.getId());
    }

    @RequestMapping("student/getStudent.do")
    @ResponseBody
    public Student getStudent(HttpServletRequest request){
        Student student=(Student) request.getSession().getAttribute("student");

        String phone=student.getPhone();
        return service.getStudentByPhone(phone);
    }

    @RequestMapping("student/updateStudent.do")
    @ResponseBody
    public void updateStudent(HttpServletResponse response,HttpServletRequest request, String name, String sex, String nation, String policy, String borthday, String zunkaozheng, int collegeid, int professionid, int toCollegeid, int toprofessionid, String award, String merit, String homeAdress, String nowAdress,String postcode) throws ParseException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

        Timestamp jointime = new Timestamp(System.currentTimeMillis());
        Date borthday_=simpleDateFormat.parse(borthday);

        int state=1;
        Student stu=(Student)request.getSession().getAttribute("student");
        Student student=new Student(name, sex, nation,policy, borthday_, zunkaozheng, collegeid,professionid,toCollegeid,toprofessionid,award,merit,homeAdress,nowAdress,jointime,state,postcode);
        student.setId(stu.getId());
        service.updateStudent(student);
        Student s=(Student)request.getSession().getAttribute("student");
        s=service.getStudentByPhone(s.getPhone());
        request.getSession().setAttribute("student",s);
        if(service.getStudentByPhone(stu.getPhone()).getBorthday()!=null){
            out.print("<script language=\"javascript\">alert('保存成功！');window.location.href='apply.html';</script>");
        }else{
            out.print("<script language=\"javascript\">alert('保存失败！');window.location.href='apply.html';</script>");
        }
    }


    @RequestMapping("student/myFile.do")
    @ResponseBody
    public Student myFile(HttpServletRequest request){
        Student student=(Student) request.getSession().getAttribute("student");
        return service.getStudentByPhone(student.getPhone());
    }

    @RequestMapping("student/getStudentState.do")
    @ResponseBody
    public String getStudentState(HttpServletRequest request){
        Student student=(Student)request.getSession().getAttribute("student");
        return service.getStudentState(student.getId())+"";
    }



    @RequestMapping(value="student/uploadFile.do",method= RequestMethod.POST)
    public void uploadFile(MultipartFile myFile, HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        String logo=null;
        if(myFile!=null && !myFile.isEmpty()){
            //上传后的地址，注意("/upload")是表示文件上传后的目标文件夹
            String realPath = request.getServletContext().getRealPath(File.separator + "uploadImges");
            //获取文件名
            String filename = myFile.getOriginalFilename();
            //获取文件后缀名
            String extensionname = filename.substring(filename.lastIndexOf(".") + 1);
            //给上传的文件起别名，有很多种方式
            logo=String.valueOf(System.currentTimeMillis())+"."+extensionname;
            //创建File对象，传入目标路径参数，和新的文件别名
            File dir=new File(realPath,logo);
            if (!dir.exists()){//如果dir代表的文件不存在，则创建它，
                dir.mkdirs();//
            }
            //如果存在则直接执行下面操作
            myFile.transferTo(dir);//将上传的实体文件复制到指定目录uploadImges下
        }
        logo="uploadImges"+File.separator+logo;
        //将文件名赋值给实体类，然后一并存到数据库


        Student student= (Student) request.getSession().getAttribute("student");
        student.setImage(logo);
        student.setState(3);
        request.getSession().setAttribute("student",student);
        service.uploadFile(student);
        service.uploadState(student);
        String image=service.getImageById(student.getId());
        if(!"".equals(image)){
            String str=null;
            str=request.getRequestURL().toString();
            str=str.substring(0,str.length()-21);
            out.print("<script language=\"javascript\">alert('保存成功！');window.location.href='apply2.html';</script>");
            request.getSession().setAttribute("url",str+image);
//            System.out.println(str+image);
            out.flush();
            out.close();

        }else{
            out.print("<script language=\"javascript\">alert('保存失败！');</script>");
            out.flush();
            out.close();
        }
    }


    @RequestMapping("student/exitImage.do")
    @ResponseBody
    public String exitImage(HttpServletRequest request){
        Student stu=(Student)request.getSession().getAttribute("student");
        String image=service.exitImage(stu.getId());
        if("".equals(image)||image==null){
            return null;
        }else{
            return image;
        }

    }

    @RequestMapping("student/getImageUrl.do")
    @ResponseBody
    public String getImageUrl(HttpServletRequest request){
        return (String)request.getSession().getAttribute("url");
    }
//    @RequestMapping("/down")
//    public void down(HttpServletRequest request,HttpServletResponse response) throws Exception{
//
//        String fileName = request.getSession().getServletContext().getRealPath("upload")+"/101.jpg";
//
//        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));
//
//        String filename = "下载文件.jpg";
//
//        filename = URLEncoder.encode(filename,"UTF-8");
//
//        response.addHeader("Content-Disposition", "attachment;filename=" + filename);
//
//        response.setContentType("multipart/form-data");
//
//        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
//        int len = 0;
//        while((len = bis.read()) != -1){
//            out.write(len);
//            out.flush();
//        }
//        out.close();
//    }



}
