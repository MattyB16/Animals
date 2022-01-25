package com.TSImatthewAnimal;

public class Main {

    public static void main(String[] args){

        System.out.println("Here we have 6 Animals these are Koala, Human, Seagull, Eagle, Clown Fish and Koi Fish");

        Koala koala = new Koala();
        Human human = new Human();
        Seagull seagull = new Seagull();
        Eagle eagle = new Eagle();
        ClownFish clownFish = new ClownFish();
        Koi koi = new Koi();


        koala.setAge(16);
        human.setAge(42);
        seagull.setAge(34);
        eagle.setAge(3);
        clownFish.setAge(4);
        koi.setAge(100);

        System.out.println(koala.getAge());
        System.out.println(human.getAge());
        System.out.println(seagull.getAge());
        System.out.println(eagle.getAge());
        System.out.println(clownFish.getAge());
        System.out.println(koi.getAge());

        koala.setName("Pongy");

        System.out.println(koala.getName());




        seagull.flight();

    }
}
