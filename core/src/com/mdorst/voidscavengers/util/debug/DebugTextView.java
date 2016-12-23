package com.mdorst.voidscavengers.util.debug;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mdorst.voidscavengers.util.reference.Ref;
import com.mdorst.voidscavengers.view.text.DefaultFont;
import com.mdorst.voidscavengers.view.text.Font;

import java.util.ArrayList;
import java.util.List;

/**
 * This class allows us to provide debug text on-screen.
 * <p/>
 * When constructed, you provide the number of lines of text that can be displayed.
 * Each of these lines can be updated independently.
 */
public class DebugTextView {

    // The sprite batch the debug text will be drawn to
    private SpriteBatch batch;
    // The object which allows us to write text to the sprite batch
    private Font font;
    // Stores the current debug text line by line
    private List<String> debugLines;

    /**
     * Constructor
     *
     * @param number_of_lines The number of lines that will be displayed in this text view
     *                        (empty lines are allowed)
     */
    public DebugTextView(int number_of_lines) {
        batch = new SpriteBatch();
        // Use the default font
        // See view.text.DefaultFont
        font = new DefaultFont();
        // Initialize debugLines to the right size, containing empty strings
        debugLines = new ArrayList<String>(number_of_lines);
        for (int i = 0; i < number_of_lines; i++) {
            debugLines.add("");
        }
    }

    /**
     * Sets the text of the given line to the string provided
     * <p/>
     * Lines are numbered top to bottom (line 0 is at the top)
     *
     * @param line The index of the line to be changed
     * @param text The text to be displayed on that line
     */
    public void setLine(int line, String text) {
        debugLines.set(line, text);
    }

    /**
     * Draws the text view in its current state to the screen
     * <p/>
     * Should be performed once for every frame
     */
    public void draw() {
        // Begin drawing to the sprite batch
        batch.begin();
        for (int i = 0; i < debugLines.size(); i++) {
            // The X, Y coordinates have to be manually specified for each line
            font.draw(batch, debugLines.get(i), Ref.debug_text.x_location,
                      Ref.debug_text.y_location - i * Ref.debug_text.line_spacing);
        }
        // We're done drawing to the sprite batch
        batch.end();
    }

    public void dispose() {
        batch.dispose();
        font.dispose();
    }
}
