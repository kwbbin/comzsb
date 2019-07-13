package dao;

import bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Register2Dao {

    public List<Student> getAllStudent();
    public List<Student> getAllStudent2();
    public void deleteStudent(int id);
    public List<Student> getStudentByName(String str);
    public void setPassword(int id);
    public List<Student> getStudentByName2(String str);


}
