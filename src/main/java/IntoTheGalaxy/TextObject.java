package IntoTheGalaxy;

import nl.han.ica.oopg.objects.GameObject;
import processing.core.PConstants;
import processing.core.PGraphics;

/**
 * Creates a text object, with the text, fontSize and color (grayscale) and the x and y in the center. 
 * Text can be changed after the object is made.
 */
public class TextObject extends GameObject{
	private String text;
	private int fontSize;
	int color;
	
	public TextObject(String text, int fontSize, int color) {
		super();
		this.text = text;
		this.fontSize = fontSize;
		this.color = color;
	}
	
	/**
	 * Sets the value of the text attribute.
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	/**
	 * Currently does nothing.
	 */
	@Override
	public void update() {
	}
	
	/**
	 * Overrides GameObject.draw() to draw text object.
	 */
	@Override
	public void draw(PGraphics g) {
		g.fill(color);
		g.textAlign(PConstants.CENTER, PConstants.CENTER);
		g.textSize(fontSize);
		g.text(text, getX(), getY());
	}

}
