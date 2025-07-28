package com.ee;

import com.badlogic.gdx.Game;

public class MainGame extends Game {
    @Override
    public void create() {
        setScreen(new PacmanGame()); // Start with Pac-Man screen
    }
}
