package com.rpg.rpg_battle.model;

import com.rpg.rpg_battle.model.enums.Side;

import java.util.*;

public class BattleEngine {
    public static final Scanner scanner = new Scanner(System.in);
    private Characters[] characters;

    public void initializeCharacters() {
        this.characters = new Characters[4];
        characters[0] = Dragon.builder()
                .name("Dragon")
                .active(true)
                .healthPoints(60)
                .magicPoints(4)
                .magicDefense(2)
                .magicAttack(4)
                .physicalDefense(3)
                .physicalAttack(5)
                .side(Side.ENEMY)
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
                .side(Side.HERO)
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
                .side(Side.HERO)
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
                .side(Side.HERO)
                .build();

        System.out.println("-- Personagens carregados --");
    }

    public void selectContestants() {
        int selected = 0;

        do {
            System.out.println("PERSONAGENS");
            System.out.println(selected == 0 ? "Escolha o primeiro: " : "Escolha o segundo: ");
            for (int i = 1; i < characters.length; i++) {
                String status = characters[i].isActive() ? "[X]" : "[" + i + "]";
                System.out.println(status + " " + characters[i].getName());
            }
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value >= 1 && value < characters.length) {
                    if (!characters[value].isActive()) {
                        characters[value].setActive(true);
                        selected++;
                    } else {
                        System.out.println("Personagem já selecionado! Escolha outro.");
                    }
                } else {
                    System.out.println("Opção inválida. Digite um número entre 1 e " + (characters.length - 1));
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números.");
            }
        } while (selected < 2);
        System.out.println("Combate pronto! Pressione [ENTER] para começar");
        scanner.nextLine();

    }

    public void startBattle() {
        List<Characters> active = new ArrayList<>();
        for (Characters c : characters) {
            if (c.isActive()) {
                active.add(c);
            }
        }
        Collections.shuffle(active);
        Queue<Characters> queueOfTurns = new LinkedList<>(active);

        while (checkEndCombat(queueOfTurns)) {

            displayStatus(active.getFirst());
        }

    }

    public boolean checkEndCombat(Queue<Characters> queueOfTurns) {
        boolean heroesActive = queueOfTurns.stream().anyMatch(p -> p.getSide() == Side.HERO);
        boolean enemyActive = queueOfTurns.stream().anyMatch(p -> p.getSide() == Side.ENEMY);
        return (heroesActive && enemyActive);
    }

    public void displayStatus(Characters currentAttacker) {
        for (Characters c : characters) {
            if (c.isActive()) {
                String turnMarker = (c == currentAttacker ? "[*] " : "[ ]");
                System.out.println(c.getName() + " Turno: " + turnMarker);
                System.out.printf("HP: %d | MP: %d | AT.M: %d | AT.F: %d | DEF.M: %d | DEF.F: %d%n",
                        c.getHealthPoints(), c.getMagicPoints(), c.getMagicAttack(),
                        c.getPhysicalAttack(), c.getMagicDefense(), c.getPhysicalDefense());
                System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            }
        }
    }
}
