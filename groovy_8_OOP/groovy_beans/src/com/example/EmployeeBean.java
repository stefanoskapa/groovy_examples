package com.example;

import java.io.Serializable;

/**
 * This is a JavaBean class (for comparison). The JavaBeans convention requires:
 *
 * 1. private fields
 * 2. getters and setters
 * 3. public no-arg constructor
 * 4. class implementing Serializable
 *
 *
 */
public class EmployeeBean implements Serializable {

    private String first;
    private String last;
    private String email;

    public EmployeeBean(){} //strictly not necessary here

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
