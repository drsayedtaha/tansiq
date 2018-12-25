package view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.cse.tansik.BAL.AdminAerBAOImp;
import com.cse.tansik.DTO.Admin;
import com.cse.tansik.DTO.EduYear;

@ManagedBean(name = "adminaer")
@RequestScoped
public class AdminAer {
    public AdminAer() {
    }
    public final Integer Role = 1 ;
    private String userName , firstName , lastName , secondName , email , password , department , faculty , university ;
    private Integer UserID , year , DepartmentId ;
    AdminAerBAOImp adminbao = new AdminAerBAOImp();
    Admin admin = new Admin();
    EduYear eduLevel = new EduYear();
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUserID(Integer UserID) {
        this.UserID = UserID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }


    public void setDepartmentId(Integer DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    public Integer getDepartmentId() {
        return DepartmentId;
    }


    public Admin getAdmin() {
        this.admin.setId(this.UserID);
        this.admin.setUserName(this.userName);
        this.admin.setPassword(this.password);
        this.admin.setEmail(this.email);
        this.admin.setFirstName(this.firstName);
        this.admin.setSecondName(this.secondName);
        this.admin.setLastName(this.lastName);
        this.admin.setRole(this.Role);
        
        this.eduLevel.setFaculty(this.faculty);
        this.eduLevel.setDepartment(this.department);
        this.eduLevel.setDepartmentId(this.DepartmentId);
        this.eduLevel.setYear(this.year);
        this.eduLevel.setUniversity(this.university);
        
        this.admin.setEduyear(eduLevel);
        return admin;
    }    
        
    

    

    public Integer save (){
        return adminbao.save(getAdmin());  
    }
    public boolean delete (){
        return adminbao.delete(getUserID()) ;
    }
    
}
