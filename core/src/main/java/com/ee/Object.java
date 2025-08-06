package com.ee;

import com.badlogic.gdx.graphics.Texture;

public class Object {
    private Texture texture;
    private boolean isInteractable;
    
    private int size;
    private int xPos;
    private int yPos;
    private boolean isSolid = true;

    /*
     * Constructor
     */

    public Object (String textureName, boolean interactable, int s, int x, int y) {
        texture = new Texture(textureName);
        xPos = x;
        yPos = y;
    }

    /*
     * Getters
     */

    public Texture getTexture() {
        return texture;
    }

    public int[] getPosition() {
        int[] coordinates = {xPos, yPos};
        return coordinates;
    }
    
    public boolean getSolidity() {
        return isSolid;
    }

    

    /*
     * Setters
     */

    public void moveTo(int x, int y) {
        xPos = x;
        yPos = y;
    }

}
