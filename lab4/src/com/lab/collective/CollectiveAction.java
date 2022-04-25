package com.lab.collective;

import com.lab.interfaces.ActionsOfCollective;
import com.lab.interfaces.Describable;
import com.lab.person.*;

public class CollectiveAction extends PersonAbstract implements ActionsOfCollective,Describable {
    private Mother mother;
    private Father father;
    private MinorHeroes minorHeroes;
    private Baby baby;


    public CollectiveAction(String name) {
        super(name);
    }

    public CollectiveAction(String name,Mother mother, Father father, MinorHeroes minorHeroes, Baby baby) {
        super(name);
        this.father = father;
        this.mother = mother;
        this.baby = baby;
        this.minorHeroes = minorHeroes;
    }

    @Override
    public String toString() {
        return this.getName() + ", ";
    }

    @Override
    public String doing() {
        return " стояли на улице и ждали ";
    }


    @Override
    public String describe() {
        String sentence = "";
        sentence = toString() + mother.getName() + " и " + father.getName() + ", " + minorHeroes.describe() + doing()
                + baby.toString() + ".";

        return sentence;
    }
}
