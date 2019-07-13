package handlers;

import bean.Admin;
import bean.AdminFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.IAdminManageService;

import java.util.List;

@Controller
public class AdminManageController {
    @Autowired
    IAdminManageService service;

    @RequestMapping("getAllAdmin.do")
    @ResponseBody
    public List<Admin> getAllAdmin(){
        return service.getAllAdmin();
    }


    @RequestMapping("deleteAdmin.do")
    @ResponseBody
    public String deleteAdminById(String id){

        try {
            service.deleteAdmin(Integer.parseInt(id));
        }catch (Exception e){
            service.deleteAdminFunctionAllId(Integer.parseInt(id));
            service.deleteAdmin(Integer.parseInt(id));
        }


        return "true";
    }

    @RequestMapping("addAdmin.do")
    @ResponseBody
    public Admin deleteAdminById(String tname,String tpassword,String tphone,String temail){
        Admin admin=new Admin(tname, tpassword, tphone, temail);
        service.addAdmin(admin);
        return admin;
    }


    @RequestMapping("updateAdminFunction.do")
    @ResponseBody
    public String updateAdminFunction(String functionId,String id){
        service.deleteAdminFunctionAllId(Integer.parseInt(id));
        String str[] = functionId.split(",");
        for(int i=0;i<str.length;i++){
            AdminFunction af=new AdminFunction(Integer.parseInt(id),Integer.parseInt(str[i]));
            service.addAdminFunction(af);
        }
        return "true";
    }

    @RequestMapping("getFunctionByAdminId.do")
    @ResponseBody
    public List<AdminFunction> getFunctionByAdminId(String id){
        return service.getFunctionByAdminId(Integer.parseInt(id));
    };
}
