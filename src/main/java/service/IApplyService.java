package service;

import bean.College;
import bean.Profession;
import bean.Student;

import java.util.List;

public interface IApplyService {
    public List<Profession> getAllProfession();
    public List<College> getAllCollege();
    public String getProOrderByNum(int proNum);
    public String getIdentityCard(int id);
    public Student getStudentByPhone(String phone);
    public void updateStudent(Student student);
    public void uploadFile(Student student);
    public String getImageById(int id);
    public String exitImage(int id);
    public void uploadState(Student student);
    public Integer getStudentState(int id);
}
