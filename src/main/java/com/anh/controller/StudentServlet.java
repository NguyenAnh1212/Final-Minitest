package com.anh.controller;

import com.anh.dao.ClassDao;
import com.anh.dao.StudentDao;
import com.anh.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StudentServlet", value = "/StudentServlet")
public class StudentServlet extends HttpServlet {
    private ClassDao classDao;
    private StudentDao studentDao;
    public void init(){
        classDao = new ClassDao();
        studentDao = new StudentDao();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
