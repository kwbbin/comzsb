package dao;

import bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckDao {
    public List<Student> getStudentByCheck(int num);
    public void updateStudentCheck(Student student);
}
