package com.atguigu.spring5.Bean;

public class Employee {
    private String ename;
    private String gender;
    private Department department;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                '}';
    }


    public Department getDepartment() {
        return department;
    }
}
