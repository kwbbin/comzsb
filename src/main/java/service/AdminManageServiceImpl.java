package service;

import bean.Admin;
import bean.AdminFunction;
import dao.AdminManageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminManageServiceImpl implements IAdminManageService {
    @Autowired
    AdminManageDao dao;

    @Override
    public List<Admin> getAllAdmin() {
        return dao.getAllAdmin();
    }

    @Override
    public void deleteAdmin(int id) {
        dao.deleteAdmin(id);
    }

    @Override
    public void addAdmin(Admin admin) {
        dao.addAdmin(admin);
    }

    @Override
    public void deleteAdminFunctionAllId(int id) {
        dao.deleteAdminFunctionAllId(id);
    }

    @Override
    public void addAdminFunction(AdminFunction af) {
        dao.addAdminFunction(af);
    }

    @Override
    public List<AdminFunction> getFunctionByAdminId(int id) {
        return dao.getFunctionByAdminId(id);
    }
}
