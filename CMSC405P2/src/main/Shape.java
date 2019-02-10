package main;

import com.jogamp.opengl.GL2;

public abstract class Shape {
	protected double[] color;
	
	public abstract void draw(GL2 gl2);
	
	public void setColor(double[] color) {
		this.color = color;
	}
}
