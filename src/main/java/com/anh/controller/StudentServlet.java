package com.anh.controller;

import com.anh.dao.ClassDao;
import com.anh.dao.StudentDao;
import com.anh.model.ClassProgram;
import com.anh.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

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
        String action = request.getParameter("action");
        if (action == null){
            action = "";}
        switch (action){
            case "createClass":
                showNewForm(request, response);
                break;
            case "edit":

                break;
            case "delete":

                break;
            case "find":

                break;
            default:
                listClass(request, response);
                break;
        }

    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher rd = request.getRequestDispatcher("createClass.jsp");
        try {
            rd.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void listClass(HttpServletRequest request, HttpServletResponse response) {
        // lấy danh sách class
        // gán vào biến qua attribute
        // Điều hướng đến file listClass.jsp
        List<ClassProgram> classProgramList = classDao.selectAllClass();
        request.setAttribute("classes", classProgramList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listClass.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";}
        switch (action){
            case "createClass":
                insertClass(request, response);
                break;
            case "edit":

                break;
            case "find":

                break;
        }
    }

    private void insertClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");

        ClassProgram newClass = new ClassProgram(name, description);
        try {
            classDao.insertClass(newClass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        RequestDispatcher rd = request.getRequestDispatcher("createClass.jsp");
        rd.forward(request, response);

    }
}
