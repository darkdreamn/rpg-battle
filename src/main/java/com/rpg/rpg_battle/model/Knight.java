package com.rpg.rpg_battle.model;

import lombok.experimental.SuperBuilder;
import lombok.NoArgsConstructor;

@SuperBuilder
@NoArgsConstructor
public class Knight extends Characters {
    @Override
    public int usePhysicalAttack() {
        System.out.println("Ataque de Lança");
        return physicalAttack;
    }
    public int useSpecialAttack() {
        System.out.println("Contra ataque. O último avanço! +2");
        return physicalAttack + 2;
    }
}
