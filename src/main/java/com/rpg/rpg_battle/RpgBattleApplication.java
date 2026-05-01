package com.rpg.rpg_battle;

import com.rpg.rpg_battle.model.BattleEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpgBattleApplication {

	public static void main(String[] args) {
        BattleEngine engine = new BattleEngine();

        engine.initializeCharacters();
	}

}
