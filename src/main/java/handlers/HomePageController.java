package handlers;

import bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.IBaseinformation;
import service.IMyFunction;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HomePageController {
    @Autowired
    IMyFunction fService;

    @Autowired
    IBaseinformation IService;

    @RequestMapping("/index.do")
    public ModelAndView doRegister(HttpServletRequest request, ModelAndView mv) throws Exception {
        mv.setViewName("/denglu.jsp");

        return mv;
    }

    @RequestMapping("")
    public ModelAndView doRegister2(HttpServletRequest request, ModelAndView mv) throws Exception {
        mv.setViewName("/denglu.jsp");

        return mv;
    }

    @RequestMapping("myFunManage.do")
    @ResponseBody
    public List<MyFunction> myFunManage(HttpServletRequest request){
        Admin admin= (Admin) request.getSession().getAttribute("admin");

        if(admin!=null){
            System.out.println(admin);
            return fService.myFunction(admin.getId());
        }

        return null;
    }

    @RequestMapping("student/check.do")
    public ModelAndView StudentCheck(ModelAndView mv,HttpServletRequest request){
        Student student= (Student) request.getSession().getAttribute("student");
        if(student!=null&&student.getState()>2){
            Student2 student2=new Student2(student.getId(), student.getName(), student.getPassword(), student.getSex(), student.getNation(), student.getPolicy(), student.getBorthday(), student.getIdentityCard(), student.getZunkaozheng(), student.getCollegeid(), student.getProfessionid(), student.getToCollegeid(), student.getToprofessionid(), student.getAward(), student.getMerit(), student.getHomeAdress(), student.getPhone(), student.getNowAdress(), student.getEmail(), student.getWbh(), student.getJointime(), student.getChecked(), student.getIsnojoin(), student.getQuestionOne(), student.getAnsQuestionOne(), student.getQuestionTwo(), student.getAnsQuestionTwo(), student.getState(), student.getImage(), student.getPostcode());
            String ProfessionName=IService.getProfessionById(student.getProfessionid()).getProName();
            String toProfessionName=IService.getProfessionById(student.getToprofessionid()).getProName();
            String collegeName=IService.getProfessionById(student.getCollegeid()).getProName();
            String toCollegeName=IService.getProfessionById(student.getToCollegeid()).getProName();
            String toProfessionCode=IService.getProfessionById(student.getToCollegeid()).getProOrder();

            student2.setCollegeName(collegeName);
            student2.setProfessionName(ProfessionName);
            student2.setToCollegeName(toCollegeName);
            student2.setToProfessionName(toProfessionName);
            student2.setToProfessionCode(toProfessionCode);
            mv.addObject("student2",student2);
        }
        mv.setViewName("check.jsp");
        return mv;
    }

    @RequestMapping("getDeskData.do")
    @ResponseBody
    public DeskDate getDeskData(){
        DeskDate desk=new DeskDate();
        desk.setSubjectNum(fService.getSubjectNum());
        desk.setJoinSubjectNum(fService.getProfessionNum());
        desk.setRegisterNum(fService.getStudentRegisterNum());
        desk.setHadjoinNum(fService.getStudentJoinNum());
        desk.setCheck0(fService.getCheckNum0());
        desk.setCheck4(fService.getCheckNum3());
        desk.setHadSuccess(fService.getStudentSuccessNum());
        return desk;
    }

}
