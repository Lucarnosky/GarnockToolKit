package garnocktoolkit.lucarnosky.physics;

import java.awt.Point;

public class Vector2d {

	/**
	 * Attempt to have a full working custom Vector System
	 * @author Matteo Lucarno
	 * @version 1.0.1
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
	*	@param Vector2d vectorToAdd the vector2d to add at the current vector
	*/
	public void addToVector2d(Vector2d vectorToAdd){
		x += vectorToAdd.x;
		y += vectorToAdd.y;
	}
	
	/**
	 * This function provide the intensity of the vector
	 * @return double the intensity of the vector2D
	 */
	public double getIntensity(){
		return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	/**
	 * This function returns the direction of the vector
	 * It should be read in degree 
	 * 
	 * @return double the direction in degree
	 */
	public double getDirection(){
		return Math.tan(x/y);
	}
	
	/**
	 * This function provide the pointing way of the vector2D
	 * It just help to realize how to rapresent the vector on a cartesian plane
	 * i.e.
	 * 			|
	 * 	(-1,+1)	|	(+1,+1)
	 * 			|
	 * ---------------------
	 * 			|
	 * 	(-1,-1)	|	(+1,-1)
	 * 			|
	 * @return Point the x and y direction should read just the sign of the couple
	 */
	public Point getPointingDirection(){
		double px, py;
		if(x < 0){
			px = -1;
		}else if (x > 0){
			px = 1;
		}else{
			px = 0;
		}
		if(y < 0){
			py = -1;
		}else if (y > 0){
			py = 1;
		}else{
			py = 0;
		}
		return new Point((int)px,(int)py);
	}
	
	
}

