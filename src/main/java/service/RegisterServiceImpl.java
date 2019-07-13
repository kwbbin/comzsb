package service;

import bean.Admin;
import bean.Question;
import bean.Student;
import dao.StuSecurityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RegisterServiceImpl implements IRegisterService{
    @Autowired
    StuSecurityDao dao;

    public List<Question> getAllQuestion() {
        return dao.getAllQuestion();
    }

    public void stuRegister(Student student) {
        dao.stuRegister(student);
    }

    public String getMaxWbh() {
        int wbh=dao.getMaxWbh();
        wbh++;
        return wbh+"";
    }

    public boolean isExistByPhone(String phone) {
        int num=dao.isExistByPhone(phone);
        if(num>=1){
            return true;
        }else{
            return false;
        }

    }

    public boolean adminIsExistByPhone(String tphone) {
        int num=dao.adminIsExistByPhone(tphone);
        if(num>=1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isExistByPhoneAndPass(Student student) {
        int num=dao.isExistByPhoneAndPass(student);
        if(num>=1){
            return true;
        }else{
            return false;
        }
    }

    public boolean adminIsExistByPhoneAndPass(Admin admin) {
        int num=dao.adminIsExistByPhoneAndPass(admin);
        if(num>=1){
            return true;
        }else{
            return false;
        }
    }

    public Student getStudentByPhoneAndPass(Student student) {
        return dao.getStudentByPhoneAndPass(student);
    }

    public Admin getAdminByPhoneAndPass(Admin admin) {
        return dao.getAdminByPhoneAndPass(admin);
    }

    @Override
    public String getStudentName(int id) {
        return dao.getStudentName(id);
    }

    @Override
    public String getStudentImage(int id) {
        return dao.getStudentImage(id);
    }

    @Override
    public List<Question> getQuestionByUserPhone(String phone) {
        return dao.getQuestionByUserPhone(phone);
    }


    @Override
    public String equilQuestionOne(Map map) {
        return dao.equilQuestionOne(map);
    }

    @Override
    public String equilQuestionTwo(Map map) {
        return dao.equilQuestionTwo(map);
    }

    public Boolean equilQuestion(Map map1,Map map2){
        String one=dao.equilQuestionOne(map1);
        String two=dao.equilQuestionTwo(map2);

        if("1".equals(one)&&"1".equals(two)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void reSetPassword(Map map) {
        String idCardNum=dao.getIdCardNum((String)map.get("phone"));
        map.put("identityCard",idCardNum);
        dao.reSetPassword(map);
    }

    @Override
    public String getIdCardNum(String phone) {
        return null;
    }
}
