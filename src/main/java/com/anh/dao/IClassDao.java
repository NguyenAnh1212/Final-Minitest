package com.anh.dao;

import com.anh.model.ClassProgram;
import com.anh.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface IClassDao {
    public void insertClass( ClassProgram classes) throws SQLException;

    public Student selectClass(int id);

    public List<ClassProgram> selectAllClass();

    public boolean deleteClass(int id) throws SQLException;

    public boolean updateClass(ClassProgram classProgram) throws SQLException;
}
