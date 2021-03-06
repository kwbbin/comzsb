package service;

import bean.Admin;
import bean.AdminFunction;

import java.util.List;

public interface IAdminManageService {

    public List<Admin> getAllAdmin();
    public void deleteAdmin(int id);
    public void addAdmin(Admin admin);
    public void deleteAdminFunctionAllId(int id);
    public void addAdminFunction(AdminFunction af);
    public List<AdminFunction> getFunctionByAdminId(int id);
}
