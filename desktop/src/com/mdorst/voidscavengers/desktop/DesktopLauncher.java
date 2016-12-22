package com.mdorst.voidscavengers.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mdorst.voidscavengers.game.VoidScavengers;
import com.mdorst.voidscavengers.util.reference.Ref;
import com.mdorst.voidscavengers.util.application.MenuBar;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = Ref.application.name;
		config.width = Ref.window.width;
		config.height = Ref.window.height;
		MenuBar.setApplicationName(Ref.application.name);
		new LwjglApplication(new VoidScavengers(), config);
	}
}
