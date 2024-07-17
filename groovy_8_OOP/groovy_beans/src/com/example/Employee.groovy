package com.example

import groovy.transform.ToString
/*

This is the Groovy equivalent of EmployeeBean.

Go to Build-> Compile Employee.groovy and inspect the decompiled class
*/
@ToString
class Employee implements Serializable{

    String first
    String last
    String email

    String fullName

    void setFullName(String fullName) {
        this.fullName = fullName
        println 'my own setter'
    }


}
