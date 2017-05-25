package com.study.benchmarkorm.model;


import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Person extends RealmObject{

    private String firstName;
    private String secondName;
    private Date birthdayDate;
    private String gender;
    private long phone;

    public Person() {
    }

    public Person(String firstName, String secondName, Date birthdayDate, String gender, long phone) {
    }

    public Person(String s, String s1, Date date, String s2, long l, Library library) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Library getLibrary(){return null;}
}
