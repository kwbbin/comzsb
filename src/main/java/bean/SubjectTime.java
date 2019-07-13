package bean;

import java.util.Date;

public class SubjectTime {
    int subjectId;
    Date subjectTime;

    public SubjectTime(int subjectId, Date subjectTime) {
        this.subjectId = subjectId;
        this.subjectTime = subjectTime;
    }

    public SubjectTime() {
    }



    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public Date getSubjectTime() {
        return subjectTime;
    }

    public void setSubjectTime(Date subjectTime) {
        this.subjectTime = subjectTime;
    }

    @Override
    public String toString() {
        return "SubjectTime{" +
                "subjectId=" + subjectId +
                ", subjectTime=" + subjectTime +
                '}';
    }
}
