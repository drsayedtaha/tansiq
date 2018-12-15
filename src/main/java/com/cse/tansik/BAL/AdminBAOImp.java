package com.cse.tansik.BAL;

import com.cse.tansik.DTO.Department;
import com.cse.tansik.DTO.EduYear;
import com.cse.tansik.DTO.Message;
import com.cse.tansik.DTO.Prequistes;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;
import com.cse.tansik.DTO.User;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class AdminBAOImp implements AdminBAO {
    public AdminBAOImp() {
        super();
    }

    UserBAO userBAO=new UserBAOImpl();
    StudentBAO StudentBAO=new StudentBAOImpl();
    public boolean setRequsetsForStudent(List<Request> requests,
                                         Student student) {
        return false;
    }

    public Request getRequsetsForStudent(Student student) {
        return null;
    }

    public boolean sendMessage(Message message) {
        return false;
    }

    public Message getMessage(Message message) {
        return null;
    }

    public boolean setDate(Date start, Date end) {
        return false;
    }

    public Student getStudent(User user) {
        return null;
    }

    public boolean editStudent(Student student) {
        return false;
    }

    public List<Student> getAllStudents() {
        return Collections.emptyList();
    }

    public boolean editPrequistes(Prequistes preq, Department dep) {
        return false;
    }

    public List<Prequistes> getPrequsites(Department dep) {
        return Collections.emptyList();
    }

    public boolean addDepartments(List<Department> Department) {
        return false;
    }

    public List<Department> getDespartments(EduYear year) {
        return Collections.emptyList();
    }

    public HashMap<Student, String> solveWishes(EduYear eduyear) {
        return null;
    }
}
