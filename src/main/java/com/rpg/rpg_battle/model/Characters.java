package com.rpg.rpg_battle.model;

import com.rpg.rpg_battle.model.enums.Side;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Random;

@Getter
@Setter
@SuperBuilder
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

    private Side side;

    public abstract int usePhysicalAttack();
}
