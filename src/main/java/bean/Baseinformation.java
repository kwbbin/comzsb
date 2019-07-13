package bean;

import java.util.Date;

public class Baseinformation {
    int baseInfoId;
    int collegeId;
    String year;
    Date registerBegin;
    Date registerEnd;
    Date joinBegin;
    Date joinEnd;
    Date checkBegin;
    Date checkEnd;
    Date dowloadBegin;
    Date dowloadEnd;
    Date gradeBegin;
    Date gradeEnd;
    Date projoinBegin;
    Date projoinEnd;

    public Baseinformation() {
    }

    public Baseinformation(Date registerBegin, Date registerEnd, Date joinBegin, Date joinEnd, Date checkBegin, Date checkEnd, Date dowloadBegin, Date dowloadEnd, Date gradeBegin, Date gradeEnd, Date projoinBegin, Date projoinEnd) {
        this.registerBegin = registerBegin;
        this.registerEnd = registerEnd;
        this.joinBegin = joinBegin;
        this.joinEnd = joinEnd;
        this.checkBegin = checkBegin;
        this.checkEnd = checkEnd;
        this.dowloadBegin = dowloadBegin;
        this.dowloadEnd = dowloadEnd;
        this.gradeBegin = gradeBegin;
        this.gradeEnd = gradeEnd;
        this.projoinBegin = projoinBegin;
        this.projoinEnd = projoinEnd;
    }

    public int getBaseInfoId() {
        return baseInfoId;
    }

    public void setBaseInfoId(int baseInfoId) {
        this.baseInfoId = baseInfoId;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Date getRegisterBegin() {
        return registerBegin;
    }

    public void setRegisterBegin(Date registerBegin) {
        this.registerBegin = registerBegin;
    }

    public Date getRegisterEnd() {
        return registerEnd;
    }

    public void setRegisterEnd(Date registerEnd) {
        this.registerEnd = registerEnd;
    }

    public Date getJoinBegin() {
        return joinBegin;
    }

    public void setJoinBegin(Date joinBegin) {
        this.joinBegin = joinBegin;
    }

    public Date getJoinEnd() {
        return joinEnd;
    }

    public void setJoinEnd(Date joinEnd) {
        this.joinEnd = joinEnd;
    }

    public Date getCheckBegin() {
        return checkBegin;
    }

    public void setCheckBegin(Date checkBegin) {
        this.checkBegin = checkBegin;
    }

    public Date getCheckEnd() {
        return checkEnd;
    }

    public void setCheckEnd(Date checkEnd) {
        this.checkEnd = checkEnd;
    }

    public Date getDowloadBegin() {
        return dowloadBegin;
    }

    public void setDowloadBegin(Date dowloadBegin) {
        this.dowloadBegin = dowloadBegin;
    }

    public Date getDowloadEnd() {
        return dowloadEnd;
    }

    public void setDowloadEnd(Date dowloadEnd) {
        this.dowloadEnd = dowloadEnd;
    }

    public Date getGradeBegin() {
        return gradeBegin;
    }

    public void setGradeBegin(Date gradeBegin) {
        this.gradeBegin = gradeBegin;
    }

    public Date getGradeEnd() {
        return gradeEnd;
    }

    public void setGradeEnd(Date gradeEnd) {
        this.gradeEnd = gradeEnd;
    }

    public Date getProjoinBegin() {
        return projoinBegin;
    }

    public void setProjoinBegin(Date projoinBegin) {
        this.projoinBegin = projoinBegin;
    }

    public Date getProjoinEnd() {
        return projoinEnd;
    }

    public void setProjoinEnd(Date projoinEnd) {
        this.projoinEnd = projoinEnd;
    }

    @Override
    public String
    toString() {
        return "Baseinformation{" +
                "baseInfoId=" + baseInfoId +
                ", collegeId=" + collegeId +
                ", year='" + year + '\'' +
                ", registerBegin=" + registerBegin +
                ", registerEnd=" + registerEnd +
                ", joinBegin=" + joinBegin +
                ", joinEnd=" + joinEnd +
                ", checkBegin=" + checkBegin +
                ", checkEnd=" + checkEnd +
                ", dowloadBegin=" + dowloadBegin +
                ", dowloadEnd=" + dowloadEnd +
                ", gradeBegin=" + gradeBegin +
                ", gradeEnd=" + gradeEnd +
                ", projoinBegin=" + projoinBegin +
                ", projoinEnd=" + projoinEnd +
                '}';
    }
}
