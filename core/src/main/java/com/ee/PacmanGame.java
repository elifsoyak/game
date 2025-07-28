package com.ee;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class PacmanGame extends ScreenAdapter {
    private Stage stage;
    private Player player;
    private Pellet[][] pellets;
    private int pelletsLeft;

    private static final int TILE_SIZE = 32;
    private static final int MAP_WIDTH = 10;
    private static final int MAP_HEIGHT = 10;

    @Override
    public void show() {
        stage = new Stage(new StretchViewport(MAP_WIDTH * TILE_SIZE, MAP_HEIGHT * TILE_SIZE));
        Gdx.input.setInputProcessor(stage);

        // Create player
        player = new Player(5 * TILE_SIZE, 5 * TILE_SIZE);
        stage.addActor(player);

        // Create pellets
        pellets = new Pellet[MAP_WIDTH][MAP_HEIGHT];
        for (int x = 0; x < MAP_WIDTH; x++) {
            for (int y = 0; y < MAP_HEIGHT; y++) {
                pellets[x][y] = new Pellet(x * TILE_SIZE, y * TILE_SIZE);
                stage.addActor(pellets[x][y]);
                pelletsLeft = MAP_HEIGHT * MAP_WIDTH;
            }
        }
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act(delta);

        // Check pellet collisions
        for (int x = 0; x < MAP_WIDTH; x++) {
            for (int y = 0; y < MAP_HEIGHT; y++) {
                Pellet pellet = pellets[x][y];
                if (pellet != null && player.getBounds().overlaps(pellet.getBounds())) {
                    pellet.remove();
                    pellets[x][y] = null;
                    pelletsLeft--;

                    // if (pelletsLeft == 0) {
                    //     // disable all elements of pacman, and move to a story mode where the user can click 
                    // }
                }
            }
        }

        stage.draw();
    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
