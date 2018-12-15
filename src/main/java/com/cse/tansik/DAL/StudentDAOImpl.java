package com.cse.tansik.DAL;

import com.cse.tansik.BAL.StudentBAO;
import com.cse.tansik.BAL.StudentBAOImpl;
import com.cse.tansik.BAL.UserBAO;
import com.cse.tansik.BAL.UserBAOImpl;
import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.Message;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;
import com.cse.tansik.DTO.User;

import java.util.Collections;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    UserDAO userDAO=new UserDAOImpl();


    public Department getDepartment(Student student) {
        return null;
    }
}
