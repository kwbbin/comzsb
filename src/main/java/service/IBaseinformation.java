package service;

import bean.*;

import java.util.List;

public interface IBaseinformation {
    public List<College> getAllCollege();
    public List<SubjectBasic> getAllSubject();
    public List<Profession> getAllProfession();
    public void updateCollege(int id);
    public Baseinformation getBaseinformation();
    public void updateYear(String year);
    public void updateTimes(Baseinformation baseinformation);
    public void updateSubjectTime(SubjectTime subjectTime);
    public List<SubjectTime> getSubjectTime();
    public SubjectBasic getSubjectById(int id);
    public void deleteSubjectById(int id);
    public void deleteCollegeById(int id);
    public void addSubject(SubjectBasic subject);
    public void addCollege(College college);
    public void addProfession(Profession profession);
    public boolean selectExitInProfession(int num);
    public boolean selectExitInCollege(int num);
    public void updateSubject(SubjectBasic subject);
    public College getCollegeById(int id);
    public void updateCollege2(College college);
    public Profession getProfessionById(int id);
    public void updateProfession(Profession profession);
}
