package dao;

import bean.MyFunction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyFunctionDao {
    public List<MyFunction> myFunction(int id);
    public Integer getSubjectNum();
    public Integer getProfessionNum();
    public Integer getStudentRegisterNum();
    public Integer getStudentJoinNum();
    public Integer getCheckNum0();
    public Integer getCheckNum3();
    public Integer getStudentSuccessNum();
}
