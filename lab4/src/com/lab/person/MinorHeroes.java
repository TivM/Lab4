package com.lab.person;

import com.lab.interfaces.Describable;
import com.lab.interfaces.MinorHeroesNamesEnum;

public class MinorHeroes implements Describable {
    private final MinorHeroesNamesEnum TYPE1 = MinorHeroesNamesEnum.Бетан;
    private final MinorHeroesNamesEnum TYPE2 = MinorHeroesNamesEnum.Босси;



    @Override
    public String describe() {
       return  TYPE1 + " и " + TYPE2;
    }

}
