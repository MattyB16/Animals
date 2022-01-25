package com.TSImatthewAnimal;

public class Seagull extends Bird implements Flying{

    //Attributes
    private String gender;

    //Constructors

    public Seagull(){

    }

    public Seagull(String gender, int age,String name){

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

    public String takeoff(){

        return "Take off method involves jumping with a large flap.";

    }

    public String flight(){

        return "Flight method is wings flapping to rise and gliding to fall.";

    }
    public String landing(){

        return "Landing method involves holding wings wide to slow decent and landing on feet.";

    }


}