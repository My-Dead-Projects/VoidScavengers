package com.mdorst.voidscavengers.view.text;

import com.mdorst.voidscavengers.util.reference.Ref;

/**
 * Represents the default font (OpenSans Regular)
 */
public class DefaultFont extends Font {

    /**
     * Create the default font (OpenSans Regular) at the default size (16 pixels)
     */
    public DefaultFont() {
        // Call the constructor of the superclass `Font`
        // passing the path to `OpenSans-Regular.tff`
        super(Ref.font.path_to.open_sans("Regular"));
    }

    /**
     * Create the default font (OpenSans Regular) at the specified size.
     * @param size The specified font size
     */
    public DefaultFont(int size) {
        // Call the default constructor
        this();
        // Then set the font size
        setSize(size);
    }
}
