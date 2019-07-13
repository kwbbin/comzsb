package service;


import bean.Student;

import java.util.List;

public interface IRegisterAdminService {
    public List<Student> getAllStudent();
    public List<Student> getAllStudent2();
    public void deleteStudent(int id);
    public List<Student> getStudentByName(String str);
    public List<Student> getStudentByName2(String str);
    public void setPassword(int id);
}
