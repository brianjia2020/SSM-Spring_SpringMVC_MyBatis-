package com.atguigu.spring5;

public class Order {
    private String oname;
    private String Address;

    public Order(String oname, String address) {
        this.oname = oname;
        Address = address;
    }

    public void orderTest(){
        System.out.println("oname: "+oname+" address: "+Address);
    }
}
