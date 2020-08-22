package ru.itsjava.javaCore.hw5;

public class Hyena {

    final String name;
    public int pawsAmount;


    public Hyena(String name, int pawsAmount) {

        this.pawsAmount = pawsAmount;
        this.name = name;
    }

    public void setPawsAmount(int pawsAmount) {
        this.pawsAmount = pawsAmount;
    }

    public String getName() {
        return name;
    }

    public int getPawsAmount() {
        return pawsAmount;
    }

    public void laugh(){
        System.out.print("My name is "+this.name+" I can laugh, Ha-ha!");

        if (this.pawsAmount<4){
            System.out.print(" However, I have only "+this.pawsAmount+" paws.");

        }
        System.out.print(" I live  in the Java Class "+Hyena.class.getName());
        System.out.println();
    }
}
