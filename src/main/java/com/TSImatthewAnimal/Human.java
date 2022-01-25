package com.TSImatthewAnimal;

public class Human extends Mammal{

    //Attributes
    private String gender;

    //Constructors

    public Human(){

    }

    public Human(String gender, int age,String name){

        setGender(gender);
        setAge(age);
        setName(name);

    }


    //Methods

    public void setGender(String newGender){

        gender= newGender;

    }

    public String getGender(){

        return gender;
    }

}
