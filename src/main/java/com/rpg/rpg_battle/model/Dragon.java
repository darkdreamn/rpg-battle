package com.rpg.rpg_battle.model;

import com.rpg.rpg_battle.model.interfaces.MagicUser;
import lombok.experimental.SuperBuilder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Dragon extends Characters implements MagicUser {
    private int special = 1;

    @Override
    public int usePhysicalAttack() {
        special++;
        System.out.println("Garras Afiadas");
        return physicalAttack;
    }

    @Override
    public int useMagicPower() {
        special++;
        System.out.println("Bola de Fogo");
        return magicAttack;
    }

    public int useSpecialAttack() {
        special = 0;
        System.out.println("Ataque Especial! Grande Destruição");
        return magicAttack + 5;
    }
}
