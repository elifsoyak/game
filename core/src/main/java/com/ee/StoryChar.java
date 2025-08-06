package com.ee;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class StoryChar extends BaseActor {
    public Animation happy;
    public Animation sad;
    public Animation shocked;
    
    public StoryChar (String n, float x, float y, Stage stage) {
        super(x, y, stage);
        
        happy = loadTexture("story-" + n + "-happy.png");
        sad = loadTexture("story-" + n + "-sad.png");
        shocked = loadTexture("story-" + n + "-shocked.png");
    }
}
