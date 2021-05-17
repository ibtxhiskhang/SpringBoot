package com.tts.mywebsite.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Subscriber {
    //sets the 'id' as the primary key
    @Id
    //allows the id to be generated by the underlying database
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String firstName;
    private Integer age;
    private String userName;

    @Column
    //allows the date to be generated by the system
    @CreationTimestamp
    private Date signedUp;

    public Subscriber() {
        //non-argument constructor needed for JPA
    }

    public Subscriber(String firstName, String lastName, String userName, Date signedUp){
        this.firstName = firstName;
        this.age = age;
        this.userName = userName;
        this.signedUp = signedUp;


    }

    public Subscriber(String firstName, Integer age, String userName, Date signedUp) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSignedUp() {
        return signedUp;
    }

    public void setSignedUp(Date signedUp) {
        this.signedUp = signedUp;
    }

    @Override
    public String toString() {
        return "Subscriber [id=" + id + ", firstName=" + firstName + ", age=" + age + ", userName=" + userName
                + ", signedUp=" + signedUp + "]";
    }





}