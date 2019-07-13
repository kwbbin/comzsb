package service;

import bean.College;
import bean.Profession;
import bean.Student;
import dao.ApplyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyServiceImpl implements IApplyService {
    @Autowired
    ApplyDao dao;

    public List<Profession> getAllProfession() {
        return dao.getAllProfession();
    }

    public List<College> getAllCollege() {
        return dao.getAllCollege();
    }


    @Override
    public String getImageById(int id) {
        return dao.getImageById(id);
    }

    @Override
    public String exitImage(int id) {
        return dao.exitImage(id);
    }

    @Override
    public void uploadFile(Student student) {
        dao.uploadFile(student);
    }

    public void updateStudent(Student student) {
        dao.updateStudent(student);
    }

    @Override
    public Student getStudentByPhone(String phone) {
        return dao.getStudentByPhone(phone);
    }

    @Override
    public String getIdentityCard(int id) {
        return dao.getIdentityCard(id);
    }

    public String getProOrderByNum(int proNum){
        return dao.getProOrderByNum(proNum);
    };

    @Override
    public void uploadState(Student student) {
        dao.uploadState(student);
    }

    @Override
    public Integer getStudentState(int id) {
        return dao.getStudentState(id);
    }
}
