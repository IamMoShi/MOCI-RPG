package main.java.RPG.Character.CharacterVisitor;

import main.java.RPG.Character.Healer;
import main.java.RPG.Character.Warrior;
import main.java.RPG.Character.Wizard;

public interface CharacterVisitor {
    void visitHealer(Healer healer);
    void visitWarrior(Warrior warrior);
    void visitWizard(Wizard wizard);
}
