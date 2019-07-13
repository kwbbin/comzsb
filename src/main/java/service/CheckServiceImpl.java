package service;

import bean.Student;
import dao.CheckDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckServiceImpl implements ICheckService {

    @Autowired
    CheckDao dao;

    @Override
    public List<Student> getStudentByCheck(int num) {
        return dao.getStudentByCheck(num);
    }

    @Override
    public void updateStudentCheck(Student student) {
        dao.updateStudentCheck(student);
    }
}
