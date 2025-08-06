package com.ee;

public class Launcher extends BaseGame {
    @Override
    public void create() {
        super.create();
        setScreen(new MenuScreen()); // Start with Pac-Man screen
    }
}
