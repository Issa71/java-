package com.qa.helloworld;


public class Results {

    int physics;
    int chemistry;
    int Biology;
    int total;
    float percentage;


    public void Marks(int physics, int chemistry, int biology){

        this.physics = physics;
        this.Biology = biology;
        this.chemistry = chemistry;
        total = physics + biology + chemistry;
        System.out.println("Total marks = " + total);
    }

    public void Percentage(int physics, int chemistry, int biology){

        this.physics = physics;
        this.Biology = biology;
        this.chemistry = chemistry;
        double percentage = ((physics + biology + chemistry)/ 450) * 100;
        System.out.println("Percentage = " + percentage + "%");
    }
}