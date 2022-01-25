package com.TSImatthewAnimal;

public class Eagle extends Bird {

    //Attributes
    private String gender;

    //Constructors

    public Eagle(){

    }

    public Eagle(String gender, int age,String name){

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
