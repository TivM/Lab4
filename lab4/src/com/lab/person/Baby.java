package com.lab.person;

import com.lab.exceptions.BabyDontRememberException;
import com.lab.interfaces.ActionsOfBaby;
import com.lab.interfaces.Describable;
import com.lab.interfaces.MinorHeroesNamesEnum;

public class Baby extends PersonAbstract implements ActionsOfBaby, Describable {
    public Baby(String name) {
        super(name);
    }


    @Override
    public String talk(String phrase) {
        return this.getName() + " сказал: '" + phrase + "'.";
    }

    @Override
    public boolean isRemember() {
        return true;
    }


    public void dontRemember() throws BabyDontRememberException{
        if (!(isRemember())){
            throw new BabyDontRememberException("Малыш ничего не вспомнил");
        }
    }

    @Override
    public String describe() {
        String sentence = "";
        if (isRemember()){
            sentence = toString() + " вспомнил просьбу Карлсона, " + talk( "У мамы действительно были 'нервы'");
        }
        return sentence;
    }


}
