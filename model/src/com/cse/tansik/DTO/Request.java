package com.cse.tansik.DTO;

public class Request {
    public Request() {
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

    @Override
    public boolean equals(Object o) {
        Request request2 = (Request) (o);

        if (this.id == request2.id && this.dep.equals(request2.dep))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.id + " " + this.order + " " + this.dep.toString();
    }

    public void setDep(Department dep) {
        // copying info
    }

    public Department getDep() {
        return dep;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
