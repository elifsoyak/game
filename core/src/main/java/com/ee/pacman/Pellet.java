package com.ee.pacman;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

// Pellet Actor
    public class Pellet extends Actor {
        Texture texture;

        public Pellet(float x, float y) {
            texture = new Texture("ui/boss-sprite.png");
            setBounds(x, y, 32, 32);
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