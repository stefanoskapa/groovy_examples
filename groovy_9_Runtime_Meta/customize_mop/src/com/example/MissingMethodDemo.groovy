package com.example

class MyEmployee {

    def methodMissing(String name, def args) {
        println "Method missing called: $name"
        println "with args ${args}"
    }
}

def emp = new MyEmployee()
emp.someMethod(1,2,3)

