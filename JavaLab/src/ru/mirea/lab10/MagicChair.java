package ru.mirea.lab10;

public class MagicChair implements Chair{

    @Override
    public String toString() {
        return "mAgIc ChAir.";
    }

    void doMagic(){
        System.out.println("I am out of mana...");
    }
}
