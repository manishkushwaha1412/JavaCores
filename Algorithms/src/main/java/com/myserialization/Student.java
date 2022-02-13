package com.myserialization;

import java.io.Serializable;

public class Student implements Serializable, Cloneable {

    private static final long serialVersionUID = 6529685098267757690L;

    private String name;
    private String email;
    private Long id;
    private Double fee;
    private Integer ticketNo;
    private transient String account;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public Student(String name, String email, Long id, Double fee, Integer ticketNo, String account) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.fee = fee;
        this.ticketNo = ticketNo;
        this.account = account;
    }

    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Integer getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(Integer ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", fee=" + fee +
                ", ticketNo=" + ticketNo +
                ", account='" + account + '\'' +
                '}';
    }
}
