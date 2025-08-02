package com.ee;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

// Player Actor
public class Player extends Actor {
    Texture texture;
    float speed = 200;

        public Player(float x, float y) {
            texture = new Texture("ui/mc-sprite.png");
            setBounds(x, y, 128, 128);
        }

        @Override
        public void act(float delta) {
            if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) moveBy(-speed * delta, 0);
            if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) moveBy(speed * delta, 0);
            if (Gdx.input.isKeyPressed(Input.Keys.UP)) moveBy(0, speed * delta);
            if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) moveBy(0, -speed * delta);
        }

        @Override
        public void draw(Batch batch, float parentAlpha) {
            batch.setColor(Color.WHITE);
            batch.draw(texture, getX(), getY(), getWidth(), getHeight());
        }

        public com.badlogic.gdx.math.Rectangle getBounds() {
            return new com.badlogic.gdx.math.Rectangle(getX(), getY(), getWidth(), getHeight());
        }
    }

