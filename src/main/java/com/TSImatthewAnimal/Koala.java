package com.TSImatthewAnimal;

public class Koala extends Mammal{

    //Attributes
    private String gender;

    //Constructors

    public Koala(){

    }

    public Koala(String gender, int age,String name){

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
