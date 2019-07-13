package handlers;

import bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.IBaseinformation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class AdminBasicController {
    @Autowired
    IBaseinformation service;



    @RequestMapping("getAllCollege.do")
    @ResponseBody
    public List<College> getAllCollege(){
        return service.getAllCollege();
    }

    @RequestMapping("formOne.do")
    public void addCollege(int myCollege, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        service.updateCollege(myCollege);
        out.print("<script language=\"javascript\">alert('保存成功！');window.location.href='basic.html';</script>");
    }


    @RequestMapping("formTwo.do")
    public void addYear(String year, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        service.updateYear(year);
        out.print("<script language=\"javascript\">alert('保存成功！');window.location.href='basic.html';</script>");
    }


    @RequestMapping("formThree.do")
    public void addTimes(HttpServletResponse response, String registerBegin,String registerEnd, String joinBegin,String joinEnd, String checkBegin,String checkEnd, String dowloadBegin,String dowloadEnd, String gradeBegin,String gradeEnd, String projoinBegin,String projoinEnd) throws IOException, ParseException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

        Date regB=null;
        Date regE=null;
        Date joiB=null;
        Date joiE=null;
        Date cheB=null;
        Date cheE=null;
        Date dowB=null;
        Date dowE=null;
        Date graB=null;
        Date graE=null;
        Date proB=null;
        Date proE=null;

        if(registerBegin!=null&&registerBegin!=""){
            regB=df.parse(registerBegin);
        }
        if(registerEnd!=null&&registerEnd!=""){
            regE=df.parse(registerEnd);
        }
        if(joinBegin!=null&&joinBegin!=""){
            joiB=df.parse(joinBegin);
        }
        if(joinEnd!=null&&joinEnd!=""){
            joiE=df.parse(joinEnd);
        }
        if(checkBegin!=null&&checkBegin!=""){
            cheB=df.parse(checkBegin);
        }
        if(checkEnd!=null&&checkEnd!=""){
            cheE=df.parse(checkEnd);
        }
        if(dowloadBegin!=null&&dowloadBegin!=""){
            dowB=df.parse(dowloadBegin);
        }
        if(dowloadEnd!=null&&dowloadEnd!=""){
            dowE=df.parse(dowloadEnd);
        }
        if(gradeBegin!=null&&gradeBegin!=""){
            graB=df.parse(gradeBegin);
        }
        if(gradeEnd!=null&&gradeEnd!=""){
            graE=df.parse(gradeEnd);
        }
        if(projoinBegin!=null&&projoinBegin!=""){
            proB=df.parse(projoinBegin);
        }
        if(projoinEnd!=null&&projoinEnd!=""){
            proE=df.parse(projoinEnd);
        }

        Baseinformation bf=new Baseinformation(regB,regE, joiB, joiE, cheB,cheE, dowB,dowE,graB, graE,proB,proE);
        System.out.println(bf);
        service.updateTimes(bf);
        out.print("<script language=\"javascript\">alert('保存成功！');window.location.href='basic.html';</script>");
    }

    @RequestMapping("getSubjectById.do")
    @ResponseBody
    public SubjectBasic getSubjectById(HttpServletRequest request){

        if(request.getParameter("id")!=null){
            int id=Integer.parseInt(request.getParameter("id"));
            return service.getSubjectById(id);
        }
        return null;
    }

    @RequestMapping("getAllSubject.do")
    @ResponseBody
    public List<SubjectBasic> getAllSubject(){
        return service.getAllSubject();
    }

    @RequestMapping("getAllProfession.do")
    @ResponseBody
    public List<Profession> getAllProfession(){
        return service.getAllProfession();
    }


    @RequestMapping("getBaseinformation.do")
    @ResponseBody
    public Baseinformation getBaseinformation(){
        return service.getBaseinformation();
    };

    @RequestMapping("student/getBaseinformation.do")
    @ResponseBody
    public Baseinformation getStudentBaseinformation(){
        return service.getBaseinformation();
    };

    @RequestMapping("getSubjectTime.do")
    @ResponseBody
    public List<SubjectTime> getSubjectTime(){
        return service.getSubjectTime();
    };

    @RequestMapping("updateSubjectTime.do")
    @ResponseBody
    public void updateSubjectTime(HttpServletResponse response,String oneTime, String twoTime, String threeTime, String foreTime) throws ParseException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

        Date one=null;
        Date two=null;
        Date three=null;
        Date fore=null;

        if(oneTime!=null&&oneTime!=""){
            one=df.parse(oneTime);
        }

        if(twoTime!=null&&twoTime!=""){
            two=df.parse(twoTime);
        }

        if(threeTime!=null&&threeTime!=""){
            three=df.parse(threeTime);
        }

        if(foreTime!=null&&foreTime!=""){
            fore=df.parse(foreTime);
        }

        SubjectTime st1=new SubjectTime(1, one);
        service.updateSubjectTime(st1);
        SubjectTime st2=new SubjectTime(2, two);
        service.updateSubjectTime(st2);
        SubjectTime st3=new SubjectTime(3, three);
        service.updateSubjectTime(st3);
        SubjectTime st4=new SubjectTime(4, fore);
        service.updateSubjectTime(st4);

        out.print("<script language=\"javascript\">alert('保存成功！');window.location.href='basic.html';</script>");


    };


    @RequestMapping("deleteSubject.do")
    @ResponseBody
    public String deleteSubject(HttpServletResponse response,HttpServletRequest request,String id){
        if(!service.selectExitInProfession(Integer.parseInt(id))){
            service.deleteSubjectById(Integer.parseInt(id));
            return "true";
        }else{
            return "false";
        }

    }


    @RequestMapping("deleteCollege.do")
    @ResponseBody
    public String deleteCollege(HttpServletResponse response,HttpServletRequest request,String id){
        if(!service.selectExitInCollege(Integer.parseInt(id))){
            service.deleteCollegeById(Integer.parseInt(id));
            return "true";
        }else{
            return "false";
        }
    }


    @RequestMapping("addSubject.do")
    @ResponseBody
    public SubjectBasic addSubject(HttpServletResponse response,HttpServletRequest request,String subjectName,String subjectNum) throws IOException {
        SubjectBasic subject=new SubjectBasic(subjectNum,subjectName);
        service.addSubject(subject);
        return subject;
    }

    @RequestMapping("addCollege.do")
    @ResponseBody
    public College addCollege(HttpServletResponse response, HttpServletRequest request, String collegeName) {

        College college=new College(collegeName);
        service.addCollege(college);
        return college;
    }

    @RequestMapping("addProfession.do")
    @ResponseBody
    public Profession addProfession( String professionCode,String professionName,String professionNowNum,String xz,String subjectOne,String subjectTwo,String subjectThree,String subjectfour) {
        Profession profession=new Profession(professionName, professionCode, Integer.parseInt(xz), Integer.parseInt(subjectOne),Integer.parseInt(subjectTwo), Integer.parseInt(subjectThree), Integer.parseInt(subjectfour));
        service.addProfession(profession);
        return profession;
    }

    @RequestMapping("updateSubject.do")
    @ResponseBody
    public String updateSubject(String id,String subjectNum,String subjectName) {
        SubjectBasic subject=new SubjectBasic(Integer.parseInt(id),subjectNum,subjectName);
        System.out.println(subject);
        service.updateSubject(subject);
        return "true";
    }



    @RequestMapping("getCollegeById.do")
    @ResponseBody
    public College getCollegeById(HttpServletRequest request){

        if(request.getParameter("id")!=null){
            int id=Integer.parseInt(request.getParameter("id"));
            return service.getCollegeById(id);
        }
        return null;
    }


    @RequestMapping("updateCollege.do")
    @ResponseBody
    public String updateCollege(String collegeId,String collegeName) {
        College college=new College(Integer.parseInt(collegeId),collegeName);
        service.updateCollege2(college);
        return "true";
    }

    @RequestMapping("getProfessionById.do")
    @ResponseBody
    public Profession getProfessionById(HttpServletRequest request){
        if(request.getParameter("id")!=null){
            int id=Integer.parseInt(request.getParameter("id"));
            return service.getProfessionById(id);
        }
        return null;
    }

    @RequestMapping("updateProfession.do")
    @ResponseBody
    public String updateProfession(String proNum,String proOrder,String xz,String proName,String subjectone,String subjecttwo,String subjectthree,String subjectfore) {
        int num=0;
        int xz_=0;
        int one=0;
        int two=0;
        int three=0;
        int four=0;

        if(proNum!=null&&proNum!=""){
            num=Integer.parseInt(proNum);
        }
        if(xz!=null&&xz!=""){
            xz_=Integer.parseInt(xz);
        }
        if(subjectone!=null&&subjectone!=""){
            one=Integer.parseInt(subjectone);
        }
        if(subjecttwo!=null&&subjecttwo!=""){
            two=Integer.parseInt(subjecttwo);
        }
        if(subjectthree!=null&&subjectthree!=""){
            three=Integer.parseInt(subjectthree);
        }
        if(subjectfore!=null&&subjectfore!=""){
            four=Integer.parseInt(subjectfore);
        }

        Profession profession=new Profession(num, proName,proOrder, xz_, one,two,three, four);
        service.updateProfession(profession);
        return "true";
    }


}
