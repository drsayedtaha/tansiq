package com.cse.tansik.DTO;

import com.cse.tansik.DTO.Department;


public class requestDTO {
    public requestDTO() {
        super();
    }

    private int id;
    private int order;
    private Department dep;

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }
public void setDep(Department dep) {
        this.dep = dep;
    }
    public Department getDep() {
        return this.dep;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    

    @Override
    public boolean equals(Object o) {
        requestDTO request2 = (requestDTO) (o);

        if (this.id == request2.id && this.dep.equals(request2.dep))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.id + " " + this.order + " " + this.dep.toString();
    }

  
}
