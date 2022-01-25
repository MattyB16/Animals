package com.TSImatthewAnimal;

public class Koi extends Fish{


    //Attributes
    private String gender;

    //Constructors

    public Koi(){

    }

    public Koi(String gender, int age,String name){

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
