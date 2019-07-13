package service;

import bean.*;
import dao.BaseinformationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseinformationServiceImpl implements IBaseinformation{

    @Autowired
    BaseinformationDao dao;


    public List<SubjectBasic> getAllSubject() {
        return dao.getAllSubject();
    }

    public List<College> getAllCollege() {
        return dao.getAllCollege();
    }


    @Override
    public List<Profession> getAllProfession() {
        return dao.getAllProfession();
    }

    @Override
    public void updateCollege(int id) {
        dao.updateCollege(id);
    }

    @Override
    public Baseinformation getBaseinformation() {
        return dao.getBaseinformation();
    }

    @Override
    public void updateYear(String year) {
        dao.updateYear(year);
    }

    @Override
    public void updateTimes(Baseinformation baseinformation) {
        dao.updateTimes(baseinformation);
    }

    @Override
    public void updateSubjectTime(SubjectTime subjectTime) {
        dao.updateSubjectTime(subjectTime);
    }

    @Override
    public SubjectBasic getSubjectById(int id) {
        return dao.getSubjectById(id);
    }

    public List<SubjectTime> getSubjectTime() {
        return dao.getSubjectTime();
    }

    @Override
    public void deleteSubjectById(int id) {
        dao.deleteSubjectById(id);
    }

    @Override
    public void deleteCollegeById(int id) {
        dao.deleteCollegeById(id);
    }

    @Override
    public void addSubject(SubjectBasic subject) {
        dao.addSubject(subject);
    }

    @Override
    public void addCollege(College college) {
        dao.addCollege(college);
    }

    @Override
    public void addProfession(Profession profession) {
        dao.addProfession(profession);
    }


    public boolean selectExitInProfession(int num) {
        String one=dao.selectExitInProfessionOne(num);
        String two=dao.selectExitInProfessionTwo(num);
        String three=dao.selectExitInProfessionThree(num);
        String four=dao.selectExitInProfessionFore(num);

        if(one==null&&two==null&&three==null&&four==null){
            return false;
        }else{
            return true;
        }

    }


    public boolean selectExitInCollege(int num) {
        if("1".equals(dao.selectExitInCollege(num))||"1".equals(dao.selectExitInStudent(num))){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public void updateSubject(SubjectBasic subject) {
        dao.updateSubject(subject);
    }

    @Override
    public College getCollegeById(int id) {
        return dao.getCollegeById(id);
    }


    public void updateCollege2(College college) {
        dao.updateCollege2(college);
    }


    public Profession getProfessionById(int id) {
        return dao.getProfessionById(id);
    }


    public void updateProfession(Profession profession) {
        dao.updateProfession(profession);
    }
}
