package com.example

class Pogo {

    String property

    void setProperty(String name, Object value) {
        this.@"$name" = 'overridden'
    }
}

def pogo = new Pogo()
pogo.property = 'a'

println pogo.property

