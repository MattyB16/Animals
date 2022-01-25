package com.TSImatthewAnimal;

public class ClownFish extends Fish{

    //Attributes
    private String gender;

    //Constructors

    public ClownFish(){

    }

    public ClownFish(String gender, int age,String name){

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
