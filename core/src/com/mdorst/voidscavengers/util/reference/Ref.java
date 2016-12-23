package com.mdorst.voidscavengers.util.reference;

/**
 * This class contains most or all of the constants used throughout this program.
 * <p/>
 * Its soul purpose is to extract away any values that might be tweaked at some future point.
 */
public class Ref {
    public static class application {
        public static final String name = "Void Scavengers";
    }

    public static class window {
        public static final int width = 800;
        public static final int height = 450;
    }

    public static class debug_text {
        public static final int y_location = 430;
        public static final int x_location = 20;
        public static final int line_spacing = 20;
    }

    public static class camera {
        public static final float initial_world_scale = 1 / 5f;
    }

    public static class font {
        public static class path_to {
            public static String open_sans(String typeface) {
                return font_path + "open-sans/OpenSans-" + typeface + ".ttf";
            }
        }

        private static final String font_path = "font/";
    }
}
