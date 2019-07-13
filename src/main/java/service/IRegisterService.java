package service;

import bean.Admin;
import bean.Question;
import bean.Student;

import java.util.List;
import java.util.Map;

public interface IRegisterService {
    public List<Question> getAllQuestion();
    public void stuRegister(Student student);
    public String getMaxWbh();
    public boolean isExistByPhone(String phone);
    public boolean adminIsExistByPhone(String tphone);
    public boolean isExistByPhoneAndPass(Student student);
    public boolean adminIsExistByPhoneAndPass(Admin admin);
    public Student getStudentByPhoneAndPass(Student student);
    public Admin getAdminByPhoneAndPass(Admin admin);
    public  String getStudentName(int id);
    public String getStudentImage(int id);
    public List<Question> getQuestionByUserPhone(String phone);
    public String equilQuestionOne(Map map);
    public String equilQuestionTwo(Map map);
    public void reSetPassword(Map map);
    public String getIdCardNum(String phone);
}
