package handlers;

import bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.RegisterAdminServiceImpl;

import java.util.List;

@Controller
public class RegisterAdminController {
    @Autowired
    RegisterAdminServiceImpl service;

    @RequestMapping("getAllStudent2.do")
    @ResponseBody
    public List<Student> getAllStudent2(){
        return service.getAllStudent2();
    };

    @RequestMapping("getAllStudent.do")
    @ResponseBody
    public List<Student> getAllStudent(){
        return service.getAllStudent();
    };

    @RequestMapping("deleteStudent.do")
    @ResponseBody
    public String deleteStudent(String id){
        service.deleteStudent(Integer.parseInt(id));
        return "true";
    }

    @RequestMapping("getStudentByName.do")
    @ResponseBody
    public List<Student> getStudentById(String str){
        return service.getStudentByName(str);
    }

    @RequestMapping("getStudentByName2.do")
    @ResponseBody
    public List<Student> getStudentById2(String str){
        return service.getStudentByName2(str);
    }

    @RequestMapping("reSetPassword.do")
    @ResponseBody
    public String reSetPassword(String str){
        List<Student> list=service.getStudentByName(str);
        if(list.size()!=1){
            return "false";
        }else{
            Student stu=service.getStudentByName(str).get(0);
            service.setPassword(stu.getId());
            return "true";
        }

    }
}


