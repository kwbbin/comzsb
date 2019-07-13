package dao;

import bean.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseinformationDao {
    public List<College> getAllCollege();
    public List<SubjectBasic> getAllSubject();
    public List<Profession> getAllProfession();
    public void updateCollege(int id);
    public void updateYear(String year);
    public Baseinformation getBaseinformation();
    public void updateTimes(Baseinformation baseinformation);
    public void updateSubjectTime(SubjectTime subjectTime);
    public List<SubjectTime> getSubjectTime();
    public SubjectBasic getSubjectById(int id);
    public void deleteSubjectById(int id);
    public void deleteCollegeById(int id);
    public void addSubject(SubjectBasic subject);
    public void addCollege(College college);
    public void addProfession(Profession profession);
    public String selectExitInProfessionOne(int num);
    public String selectExitInProfessionTwo(int num);
    public String selectExitInProfessionThree(int num);
    public String selectExitInProfessionFore(int num);
    public String selectExitInCollege(int num);
    public String selectExitInStudent(int num);
    public void updateSubject(SubjectBasic subject);
    public College getCollegeById(int id);
    public void updateCollege2(College college);
    public Profession getProfessionById(int id);
    public void updateProfession(Profession profession);
}
