package dao;

import bean.Admin;
import bean.Question;
import bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StuSecurityDao {
//    所在院校，报考院校，毕业专业，报考专业
//    public List<StuSecurity> getAllQuestion();
    public List<Question> getAllQuestion();
    public void stuRegister(Student student);
    public int getMaxWbh();
    public int isExistByPhone(String phone);
    public int adminIsExistByPhone(String tphone);
    public int isExistByPhoneAndPass(Student student);
    public int adminIsExistByPhoneAndPass(Admin admin);
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
