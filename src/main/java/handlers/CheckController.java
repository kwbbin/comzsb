package handlers;

import bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CheckServiceImpl;

import java.util.List;

@Controller
public class CheckController {

    @Autowired
    CheckServiceImpl service;

    @RequestMapping("getStudentByCheck0.do")
    @ResponseBody
    public List<Student> getStudentByCheck0(){
        return service.getStudentByCheck(0);
    }

    @RequestMapping("getStudentByCheck1.do")
    @ResponseBody
    public List<Student> getStudentByCheck1(){
        return service.getStudentByCheck(1);
    }

    @RequestMapping("getStudentByCheck2.do")
    @ResponseBody
    public List<Student> getStudentByCheck2(){
        return service.getStudentByCheck(2);
    }


    @RequestMapping("getStudentByCheck3.do")
    @ResponseBody
    public List<Student> getStudentByCheck3(){
        return service.getStudentByCheck(3);
    }

    @RequestMapping("updateStudentCheck.do")
    @ResponseBody
    public String updateStudentCheck(String id,String checked){
        Student student=new Student();
        student.setId(Integer.parseInt(id));
        student.setChecked(checked);
        service.updateStudentCheck(student);
        System.out.println("id="+id+" checked="+checked);
        return "true";
    };
}
