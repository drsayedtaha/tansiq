package DTO;
import java.util.HashMap;
import java.util.List;

public abstract class Department {
    private String name;
    private int id;
   
    private int maxCapcity;
    private int minCapcity;

    @Override
    public boolean equals(Object o) {
        Department dep2 = (Department) (o);

        if (this.id == dep2.id && this.name == dep2.name)
            return false;
        return true;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMaxCapcity(int maxCapcity) {
        this.maxCapcity = maxCapcity;
    }

    public int getMaxCapcity() {
        return maxCapcity;
    }

    public void setMinCapcity(int minCapcity) {
        this.minCapcity = minCapcity;
    }

    public int getMinCapcity() {
        return minCapcity;
    }
}