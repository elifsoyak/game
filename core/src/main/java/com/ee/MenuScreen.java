package com.ee;

import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class MenuScreen extends BaseScreen {

    public MenuScreen () {
        super();
    }

    @Override
    public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'touchCancelled'");
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }

    @Override
    public void initialize() {
        BaseActor background = new BaseActor(0,0, mainStage);
        background.loadTexture(".png");
        background.setSize(1000, 600);

        TextButton startButton = new TextButton("START", BaseGame.textButtonStyle);
        startButton.addListener(event -> {
                if(startButton.isPressed())
                    System.out.println("something"); // Start the game...=[;]
                return false;
            }
        ); 
    }

    @Override
    public void update(float dt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
