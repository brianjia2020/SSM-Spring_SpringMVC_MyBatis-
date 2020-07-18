package com.atguigu.spring5.Bean;

public class Department {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

//    public String getDname() {
//        return dname;
//    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
