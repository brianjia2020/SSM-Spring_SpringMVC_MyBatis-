package com.atguigu.spring5;

public class Book {
    private String bname;
    private String bauthor;

    public void setBname(String bname) {
        this.bname = bname;
    }

//    public Book(String bname) {
//        this.bname = bname;
//    }



    public static void main(String[] args) {
        Book book = new Book();
        book.setBname("123");
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testDemo(){
        System.out.println("demo....bname: "+bname+"  ,bauthor: "+bauthor);
    }
}
