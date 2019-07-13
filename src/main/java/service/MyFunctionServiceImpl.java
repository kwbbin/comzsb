package service;

import bean.MyFunction;
import dao.MyFunctionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyFunctionServiceImpl implements IMyFunction{
    @Autowired
    MyFunctionDao dao;

    public List<MyFunction> myFunction(int id) {
        return dao.myFunction(id);
    }

    @Override
    public Integer getSubjectNum() {
        return dao.getSubjectNum();
    }

    @Override
    public Integer getProfessionNum() {
        return dao.getProfessionNum();
    }

    @Override
    public Integer getStudentRegisterNum() {
        return dao.getStudentRegisterNum();
    }

    @Override
    public Integer getStudentJoinNum() {
        return dao.getStudentJoinNum();
    }

    @Override
    public Integer getCheckNum0() {
        return dao.getCheckNum0();
    }

    @Override
    public Integer getCheckNum3() {
        return dao.getCheckNum3();
    }

    @Override
    public Integer getStudentSuccessNum() {
        return dao.getStudentSuccessNum();
    }
}
