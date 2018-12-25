package com.cse.tansik.DTO;

import java.util.Date;

public class Prequistes {
    private Subject[] subjects;
    private int id;
    private Date start, end;

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setStart(Date start) {

        this.start = (Date) start.clone();
    }

    public Date getStart() {
        return start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getEnd() {
        return end;
    }
}
