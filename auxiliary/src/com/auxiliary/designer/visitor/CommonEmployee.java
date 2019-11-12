package com.auxiliary.designer.visitor;public class CommonEmployee extends Employee {    private String job;    public CommonEmployee(String name, String age, String responlity, String job) {        super(name, age, responlity);        this.job = job;    }    public String getJob() {        return job;    }    public void setJob(String job) {        this.job = job;    }    @Override    public void accept(IVisitor visitor) {        visitor.visit(this);    }}