package ru.itsjava.javaCore.hw6;

public class Farm {
    public static Cow[] createCows(){
         Cow[] cows = new Cow[5];

        Cow jenny = new Cow("Jenny","Airshir");
        Cow tommy = new Cow("Tommy","Holshtane");
        Cow pony = new Cow("Pony");
        Cow black = new Cow("Black");
        Cow boris = new Cow("Boris");
        pony.setNameBreed("Jersey");
        black.setNameBreed("Orlovskya");
        jenny.setNameBreed("Jersey");
        cows[0]=jenny;
        cows[1]=tommy;
        cows[2]=pony;
        cows[3]=black;
        cows[4]=boris;

return cows;

    }

}
