package com.lab.begin;

import com.lab.collective.CollectiveAction;
import com.lab.person.Baby;
import com.lab.person.Father;
import com.lab.person.MinorHeroes;
import com.lab.person.Mother;

public class Begin {
    public static void main(String[] args) {
        Baby baby = new Baby("'Малыш'");
        Mother mother = new Mother("'Мама'",baby);

        Mother mother1 = new Mother("'Мама'",baby);
        Father father = new Father("'Папа'", baby);
        Father father1 = new Father("'Папа'", baby);
        MinorHeroes minorHeroes = new MinorHeroes();
        CollectiveAction collectiveAction = new CollectiveAction("'Разные Люди'", mother, father, minorHeroes,baby);

        try {
            baby.dontRemember();
        }catch (Exception e){
            System.out.print(e.getMessage());
        }

        System.out.println(baby.describe());
        System.out.println(collectiveAction.describe());

        try {
            mother.active();
        }catch (Exception e){
            System.out.print(e.getMessage());

        }

        System.out.println(mother.describe());
        System.out.println(father.describe());
//        System.out.println("");
//        System.out.println("");
//        System.out.println(father.equals(father1));
//        System.out.println(mother.equals(mother1));



    }
}
