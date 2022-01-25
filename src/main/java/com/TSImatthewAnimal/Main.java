package com.TSImatthewAnimal;

public class Main {

    public static void main(String[] args){

        System.out.println("Here we have 6 Animals these are Koala, Human, Seagull, Eagle, Clown Fish and Koi Fish");

        Koala koala = new Koala("Male", 12, "Bob");
        Human human = new Human("Male", 22, "Matthew");
        Seagull seagull = new Seagull("Female",34,"Guss");
        Eagle eagle = new Eagle("Male",7,"Bald");
        ClownFish clownFish = new ClownFish("Both",3,"Nemo");
        Koi koi = new Koi("Male",43,"Kraig");


        System.out.println(koala.getName() + " " + koala.getAge() + " " +koala.getGender());
        System.out.println(human.getName() + " " + human.getAge() + " " +human.getGender());
        System.out.println(seagull.getName() + " " + seagull.getAge() + " " +seagull.getGender());
        System.out.println(eagle.getName() + " " + eagle.getAge() + " " +eagle.getGender());
        System.out.println(clownFish.getName() + " " + clownFish.getAge() + " " +clownFish.getGender());
        System.out.println(koi.getName() + " " + koi.getAge() + " " +koi.getGender());

        seagull.flight();

    }
}
