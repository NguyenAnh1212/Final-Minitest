package com.anh.dao;

import com.anh.model.Student;

import java.sql.SQLException;
import java.util.List;

public class ClassDao implements IClassDao{
    @Override
    public void insertClass(Class classes) throws SQLException {

    }

    @Override
    public Student selectClass(int id) {
        return null;
    }

    @Override
    public List<Student> selectAllClass() {
        return null;
    }

    @Override
    public boolean deleteClass(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateClass(Student student) throws SQLException {
        return false;
    }
}
