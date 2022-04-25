package com.lab.person;

import com.lab.exceptions.MotherIsInactiveException;
import com.lab.interfaces.ActionOfMother;
import com.lab.interfaces.Describable;

import java.util.Objects;

public class Mother extends PersonAbstract implements Describable, ActionOfMother {
    private Baby baby;

    public Mother(String name) {
        super(name);
    }


    public Mother(String name, Baby baby) {
        super(name);
        this.baby = baby;
    }


    @Override
    public boolean isRush() {
        return true;
    }

    @Override
    public boolean isHug() {
        return true;
    }

    @Override
    public boolean isCry() {
        return true;
    }

    @Override
    public boolean isLaugh() {
        return true;
    }

    public void active() throws MotherIsInactiveException {
        if (!(isCry() && isLaugh() && isHug() && isRush())) {
            throw new MotherIsInactiveException("Мама неактивна");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mother mother = (Mother) o;
        return baby.equals(mother.baby) && Objects.equals(getName(), mother.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(baby, getName());
    }

    @Override
    public String describe() {
        String sentence = "";
        if (isCry() && isLaugh() && isHug() && isRush()) {
            sentence = toString() + " кинулась к " + baby.toString() + "," + " обняла, " + "плакала, " + "смеялась. ";
        }
        return sentence;
    }


}



