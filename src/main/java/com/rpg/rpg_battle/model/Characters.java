package com.rpg.rpg_battle.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Random;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Characters {
    protected static final Random RANDOM_GENERATOR = new Random();

    @Setter(AccessLevel.NONE)
    protected String name;

    protected boolean active;
    protected int healthPoints;
    protected int magicPoints;
    protected int magicDefense;
    protected int magicAttack;
    protected int physicalDefense;
    protected int physicalAttack;

    public abstract int usePhysicalAttack();
    public abstract int useMagicPower();
}
