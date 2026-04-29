package com.rpg.rpg_battle.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Characters {
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
