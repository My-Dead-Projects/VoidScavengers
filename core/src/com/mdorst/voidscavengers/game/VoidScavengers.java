package com.mdorst.voidscavengers.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mdorst.voidscavengers.view.screen.GameScreen;

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
