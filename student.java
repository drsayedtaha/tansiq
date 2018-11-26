package com.cse.tansik.BAL;

import com.cse.tansik.DTO.Message;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.Student;
import com.cse.tansik.DTO.User;
import com.cse.tansik.DAL

import java.util.List;

public class StudentBAOimpl implements StudentBAO {
    public StudentBAOimpl() {

        super();
    }

    @Override
    public boolean addRequest(List<Request> requests) {
        /* student requests for departments and choose at each block
        one of the departments shown in the list 


         */ sendRequest() {
        
        try {
            /* if something is invalid it's handled with this method
            * Any statments that may go wrong during
            * the process

        */
        } 
        }
        catch(ExampleException e) {
        /* catches the exception
         here will be written our error handling code
          This block will only execute if any exception 
          * occurs in the try block
          */  
        }
        catch (Exception e) {
         /* generic Exception handler, which means it can handle
          * all the exceptions that weren't handled by the previous 
          * catch block. 
          */

        }
        studentDAO.add(request);
        //if there isn't any exceptions
        return true;
        /*
          *   student's request will be completed and sended to database

          *   until confirmation message is shown
          *   displayed with the deadline and the day of the result
          */
        else 
            /* exceptions were handled but still there were
            some error with the request, typo for example or anything that can be handled 
            by the student and a try again message will be shown.
            */
        return false; 
        }

        @Override
    public boolean sendMessage(String text, Student admin) {
        /* here the student sends a message to admin to
        * report a problem for example, or inquire about something
        */
        return false;
    }

    @Override
    public Message getMessage() {
        // the admin gets the message
        return null;
    }

    @Override
    public User login(String name, String password) {
    /* if the password and username entered weren't matched
    then the student will be asked to try
    again and Invalid Log-in message will be displayed
    */
    return null;
}
else{ 
/* if the student's log-in was valid and
         clear to the database then his 
         information will be shown on the next page with the
         ability to change, correct anything only if the deadline
         didn't pass
         */  
    
    return true;
}
}
