package com.example.myapp.demo

class ExampleObject{
    String name
    int age

    public ExampleObject(String name, int age){
        this.age = age
        this.name = name
    }

    public ExampleObject(){
        this.age = 3
        this.name = "Jas"
    }

    public int getAge(){
        return this.age
    }
}
