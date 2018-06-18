package com.zhaoyh.model;

public class Student {
    private long id;
    private int num;
    private  String name;
    private int phone;
    public void Student(){}
    public Student(String name,long id,int num,int phone){
        this.id=id;
        this.name=name ;
        this.num=num;
        this.phone=phone;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public long setId()
    {
        return this.id;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone){
        this.phone=phone;
    }
}
