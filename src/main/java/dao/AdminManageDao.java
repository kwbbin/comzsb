package dao;

import bean.Admin;
import bean.AdminFunction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminManageDao {
    public List<Admin> getAllAdmin();
    public void deleteAdmin(int id);
    public void addAdmin(Admin admin);
    public void deleteAdminFunctionAllId(int id);
    public void addAdminFunction(AdminFunction af);
    public List<AdminFunction> getFunctionByAdminId(int id);
}
