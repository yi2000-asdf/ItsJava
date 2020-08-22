package ru.itsjava.javaCore.hw6;

public class Home {
    public static void main (String args[]){

        Cow[] cows=Farm.createCows();
        cows[4].setNameBreed("Simmental");

        System.out.println ("This farm has 5 animals");
        for (int i=0; i<cows.length; i++){
            System.out.println("Name: "+cows[i].getName()+" Breed="+cows[i].getNameBreed());
        }



    }
}
