package garnocktoolkit.lucarnosky.physics;

import java.awt.Point;

public class Vector2d {

	/**
	 * Attempt to have a full working custom Vector System
	 * @author Matteo Lucarno
	 * @version 1.0.0
	 */
	
	/**Vector Axis*/
	public double x,y;
	
	public Vector2d (){
		x = 0;
		y = 0;
	}
	
	public Vector2d (double x, double y){
		setCoord(x, y);
	}
	
	public Vector2d (Point origin){
		setCoord(origin.x,origin.y);
	}
	
	public void setCoord(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Point getCoord(){
		return new Point((int)x,(int) y);
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	/**
	*	This function provide a vector addition
	*	@param vectorToAdd the vector2d to add at the current vector
	*/
	public void addToVector2d(Vector2d vectorToAdd){
		x += vectorToAdd.x;
		y += vectorToAdd.y;
	}
	
	/**
	 * This function provide the intensity of the vector
	 * @return the intensity of the vector2D
	 */
	public double getIntensity(){
		return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	/**
	 * This function returns the direction of the vector
	 * It should be read in degree 
	 * 
	 * @return the direction in degree
	 */
	public double getDirection(){
		return Math.tan(x/y);
	}
	
	
}

