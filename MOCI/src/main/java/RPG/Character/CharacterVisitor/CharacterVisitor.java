package main.java.RPG.Character.CharacterVisitor;

import main.java.RPG.Character.Healer;
import main.java.RPG.Character.Warrior;
import main.java.RPG.Character.Wizard;

public interface CharacterVisitor {
    void visit(Healer healer);
    void visit(Warrior warrior);
    void visit(Wizard wizard);
}
