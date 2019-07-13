package service;

import bean.Student;
import dao.Register2Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterAdminServiceImpl implements IRegisterAdminService{
    @Autowired
    Register2Dao dao;

    @Override
    public List<Student> getAllStudent() {
        return dao.getAllStudent();
    }

    @Override
    public void deleteStudent(int id) {
        dao.deleteStudent(id);
    }

    @Override
    public List<Student> getStudentByName(String str) {
        return dao.getStudentByName(str);
    }

    @Override
    public void setPassword(int id) {
        dao.setPassword(id);
    }

    @Override
    public List<Student> getStudentByName2(String str) {
        return dao.getStudentByName2(str);
    }

    @Override
    public List<Student> getAllStudent2() {
        return dao.getAllStudent2();
    }
}
