package com.mdorst.voidscavengers.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mdorst.voidscavengers.view.screen.GameScreen;

/**
 * This is the entry point for the game, and serves as the switching station for the various screens.
 * <p/>
 * The game itself is controlled by the GameScreen class.
 * Any other screens in the game, such as menus, will have their own screen classes.
 * This class will be responsible for switching between those screens.
 */
public class VoidScavengers extends Game {
    public SpriteBatch batch;

    @Override
    public void create() {
        batch = new SpriteBatch();
        setScreen(new GameScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    public void dispose() {
        batch.dispose();
    }
}
