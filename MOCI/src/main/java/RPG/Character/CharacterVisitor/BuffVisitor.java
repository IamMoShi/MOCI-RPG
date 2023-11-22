package main.java.RPG.Character.CharacterVisitor;

import main.java.RPG.Character.Healer;
import main.java.RPG.Character.Warrior;
import main.java.RPG.Character.Wizard;

public class BuffVisitor implements CharacterVisitor {

    @Override
    public void visitHealer(Healer healer) {
        healer.setWisdom(healer.getWisdom() + 1);
    }

    @Override
    public void visitWarrior(Warrior warrior) {
        warrior.setStrength(warrior.getStrength() + 1);
    }

    @Override
    public void visitWizard(Wizard wizard) {
        wizard.setIntelligence(wizard.getIntelligence() + 1);
    }

}
