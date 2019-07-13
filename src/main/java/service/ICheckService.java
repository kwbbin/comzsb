package service;

import bean.Student;

import java.util.List;

public interface ICheckService {

    public List<Student> getStudentByCheck(int num);
    public void updateStudentCheck(Student student);
}
