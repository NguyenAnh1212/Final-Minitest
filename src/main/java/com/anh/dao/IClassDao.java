package com.anh.dao;

import com.anh.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface IClassDao {
    public void insertClass( Class classes) throws SQLException;

    public Student selectClass(int id);

    public List<Student> selectAllClass();

    public boolean deleteClass(int id) throws SQLException;

    public boolean updateClass(Student student) throws SQLException;
}
