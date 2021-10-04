package com.keyin;

public class Employee {
    private int id;
    private String fn;
    private String ln;
    private int salary;

    Employee(int id, String fn, String ln, int salary){
        this.id=id;
        this.fn=fn;
        this.ln=ln;
        this.salary=salary;
    }

    public int getID(){
       return this.id; 
    }

    public String getFirstName(){
        return this.fn;
    }

    public String getLastName(){
        return this.ln;
    }

    public String getName(){
        return(
            this.fn+" "+this.ln
        );
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return(
            this.salary*12
        );
    }

    public int raiseSalary(int percent) {
        percent = this.salary*percent;
        this.salary = this.salary+percent;
        return(
            this.salary
        );
    }

    public String toString(){
        return(
            "Employee[id="+getID()+",name="+getName()+",salary="+getSalary()+"]"
        );
    }
}
