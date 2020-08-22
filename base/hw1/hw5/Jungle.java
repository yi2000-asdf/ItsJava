package ru.itsjava.base.hw1.hw5;

public class Jungle {
    public static void main(String args[]){

        Lion mufasa = new Lion ("Mufasa",10,5,40,true);
        Lion shram =    new Lion ("Shram");

        Lion.sayHi(shram);

        shram.setHasmane(true);
        shram.setAge(5);

        Opossum timon = new Opossum("Timon");
        timon.setHeight(10);
        timon.sayHakunaMatata();

        Boar pumba=new Boar("Pumba");
        pumba.setWeight(13);
        pumba.introduce();
        pumba.grunt();





        Hyena jim=new Hyena("Jim",4);
        jim.laugh();

        Hyena banksy=new Hyena("Banksy",4);
        banksy.laugh();

        Hyena tommy=new Hyena("Tommy",3);
        tommy.laugh();


    }
}
