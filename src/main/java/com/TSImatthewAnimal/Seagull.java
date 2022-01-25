package com.TSImatthewAnimal;

public class Seagull extends Bird implements Flying{

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