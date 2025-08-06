package com.ee;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class MainChar extends BaseActor{
    public Animation happy;
    public Animation sad;


    public MainChar(float x, float y, Stage s) {
        super(x, y, s);
        
        happy = loadTexture("TODO");
        
    }
}
