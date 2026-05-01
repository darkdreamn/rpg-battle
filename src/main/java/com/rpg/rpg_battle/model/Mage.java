package com.rpg.rpg_battle.model;

import com.rpg.rpg_battle.model.interfaces.MagicUser;
import lombok.experimental.SuperBuilder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Mage extends Characters implements MagicUser {
    @Override
    public int usePhysicalAttack() {
        System.out.println("Golpe de Cajado");
        return physicalAttack;
    }
    @Override
    public int useMagicPower() {
        System.out.println("Raio Poderoso!");
        return magicAttack;
    }
    public void useMagicCure(String target) {
        System.out.println("Cura Mágica +4 para" + target);
        magicPoints = 0;
    }
}
