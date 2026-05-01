package com.rpg.rpg_battle.model;

public class BattleEngine {
    Characters[] characters = new Characters[4];

    public void initializeCharacters() {
        characters[0] = Dragon.builder()
                .name("Dragon")
                .active(true)
                .healthPoints(60)
                .magicPoints(4)
                .magicDefense(2)
                .magicAttack(4)
                .physicalDefense(3)
                .physicalAttack(5)
                .build();

        characters[1] = Knight.builder()
                .name("Knight")
                .active(false)
                .healthPoints(19)
                .magicPoints(0)
                .magicDefense(0)
                .magicAttack(0)
                .physicalDefense(4)
                .physicalAttack(5)
                .build();

        characters[2] = Paladin.builder()
                .name("Paladin")
                .active(false)
                .healthPoints(19)
                .magicPoints(2)
                .magicDefense(2)
                .magicAttack(3)
                .physicalDefense(3)
                .physicalAttack(4)
                .build();

        characters[3] = Mage.builder()
                .name("Mage")
                .active(false)
                .healthPoints(24)
                .magicPoints(2)
                .magicDefense(3)
                .magicAttack(4)
                .physicalDefense(1)
                .physicalAttack(1)
                .build();

        System.out.println("-- Personagens carregados --");
    }

    public void selectContestants() {}
    public void startBattle() {}
    public void displayStatus() {}
}
