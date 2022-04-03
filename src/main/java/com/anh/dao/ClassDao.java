package com.anh.dao;

import com.anh.model.ClassProgram;
import com.anh.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClassDao implements IClassDao{
    public static final String URLJDBC = "jdbc:mysql://localhost:3306/quanly_hocsinh";
    public static final String JDBC_USERNAME = "root";
    public static final String JDBC_PASSWORD = "123456";

    // lấy kết nối với CSDL
    protected Connection getConnection(){
        Connection connection = null ;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    URLJDBC,
                    JDBC_USERNAME,
                    JDBC_PASSWORD);
            System.out.println("Ket noi thanh cong");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Ket noi chua thanh cong");
        }
        return connection;
    }

    @Override
    public void insertClass(ClassProgram classProgram) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement pstmt =
                     connection.prepareStatement("INSERT INTO classes (name, description) VALUES (?, ?);")){
            pstmt.setString(1, classProgram.getName());
            pstmt.setString(2, classProgram.getDescription());

            pstmt.executeUpdate();
        }

    }

    @Override
    public Student selectClass(int id) {
        return null;
    }

    @Override
    public List<ClassProgram> selectAllClass() {
        List<ClassProgram> classList = new ArrayList<>();

        try (
                // Lấy kết nối đến CSDL
                Connection connection = getConnection();
                // Chuẩn bị câu lệnh truy vấn
                PreparedStatement preparedStatement = connection.prepareStatement(
                        "select * from classes"
                )
        ) {
            // Lưu dữ liệu, thực thi câu lệnh vào resultSet
            ResultSet resultSet = preparedStatement.executeQuery();
            // Lấy dữ liệu ra
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");

                ClassProgram classProgram = new ClassProgram(id, name, description );
                classList.add(classProgram);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classList;
    }

    @Override
    public boolean deleteClass(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateClass(ClassProgram classProgram) throws SQLException {
        return false;
    }
}
