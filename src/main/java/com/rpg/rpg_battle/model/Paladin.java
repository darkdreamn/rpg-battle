package com.rpg.rpg_battle.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Paladin extends Characters {
    @Override
    public int usePhysicalAttack() {
        int bonus = 0;
        String mensagem = "Ataque de espada";

        if (healthPoints < 7) {
            bonus = 1;
            mensagem += " +1 (Frenesi!)";
        }
        System.out.println(mensagem);
        return physicalAttack + bonus;
    }
    @Override
    public int useMagicPower() {
        magicPoints = 0;
        int power = RANDOM_GENERATOR.nextInt(3);
        System.out.println("Espada da Aurora! + " + power);
        return magicAttack + power;
    }
}
