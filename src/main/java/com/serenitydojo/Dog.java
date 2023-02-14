package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    private int age;

    public static final String DOG_NOISE = "Woof";

    public static boolean isFed(){
        return true;
    }

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;

    }


    public String getName() {  return name;  }
    public String getFavoriteToy() { return favoriteToy;  }
    public int getAge(){ return age;   }
    public String makeNoise() {
        System.out.println(name + " says " + DOG_NOISE);
        return DOG_NOISE;
    }

    public void feed() {
        System.out.println(name + " is fed " + isFed());
    }

}