package com.cse.tansiq.backing;

//import drsayed.UploadFile;

import javax.annotation.Generated;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean(name = "backing_addStudent")
@ViewScoped
@Generated(value = "1addStudent.jsf", comments = "oracle-jdev-comment:managed-bean-jsp-link")
public class AddStudentClass {
 
    private UploadedFile file;
     
        public UploadedFile getFile() {
            return file;
        }
     
        public void setFile(UploadedFile file) {
            this.file = file;
        }
         
        public void upload() {
            if(file != null) {
                FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
                FacesContext.getCurrentInstance().addMessage(null, message);
            }
        }
         
        public void handleFileUpload(FileUploadEvent event) {
            FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
      private int x ;

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

    
    
    //    private Part file ;
//    public void save() {
//        try (InputStream input = file.getInputStream()) {
//            Files.copy(input, new File(uploads, filename).toPath());
//        }
//        catch (IOException e) {
//            // Show faces message?
//        }
//    };
//
//    public void setFile(Part file) {
//        this.file = file;
//    }
//
//    public Part getFile() {
//        return file;
//    }


}
