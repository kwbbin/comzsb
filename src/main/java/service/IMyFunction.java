package service;


import bean.MyFunction;

import java.util.List;

public interface IMyFunction {
    public List<MyFunction> myFunction(int id);
    public Integer getSubjectNum();
    public Integer getProfessionNum();
    public Integer getStudentRegisterNum();
    public Integer getStudentJoinNum();
    public Integer getCheckNum0();
    public Integer getCheckNum3();
    public Integer getStudentSuccessNum();
}
