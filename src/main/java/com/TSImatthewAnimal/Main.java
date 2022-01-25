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
        human.setAge(22);
        seagull.setAge(34);
        eagle.setAge(3);
        clownFish.setAge(4);
        koi.setAge(100);

        koala.setName("Pongy");
        human.setName("Matthew");
        seagull.setName("Guss");
        eagle.setName("Bald");
        clownFish.setName("Nemo");
        koi.setName("Kraig");

        System.out.println(koala.getName() + " " + koala.getAge());
        System.out.println(human.getName() + " " + human.getAge());
        System.out.println(seagull.getName() + " " + seagull.getAge());
        System.out.println(eagle.getName() + " " + eagle.getAge());
        System.out.println(clownFish.getName() + " " + clownFish.getAge());
        System.out.println(koi.getName() + " " + koi.getAge());




        seagull.flight();

    }
}
