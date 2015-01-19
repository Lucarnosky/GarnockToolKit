package garnocktoolkit.lucarnosky.physics;

import java.awt.Point;

public class Vector2d {

	/**
	 * Attempt to have a full working custom Vector System
	 * @author Matteo Lucarno
	 * @version 1.0.3
	 */
	
	/**Vector Axis*/
	public double x,y,xforce,yforce,intesity;
	
	public Vector2d (){
		x = 0;
		y = 0;
		getIntensity();
	}
	
	public Vector2d (double x, double y){
		setOrigin(x, y);
	}
	
	public Vector2d (Point origin){
		setOrigin(origin.x,origin.y);
	}
	
	public Vector2d (Point origin,double intensity){
		setOrigin(origin.x,origin.y);
		this.intesity = intensity;
	}
	
	public Vector2d (Point origin,Point forces){
		setOrigin(origin.x,origin.y);
		
	}
	
	public void setOrigin(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Point getOrigin(){
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
		
		return intesity;
	}
	
	/**
	 * Calculate the intensity of the vector
	 */
	public void calculateIntensity(){
		intesity = Math.sqrt(Math.pow(xforce - x , 2) + Math.pow(yforce - y, 2));
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
	 * ---------|-----------
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
	
	/**
	 * Same as @see getPointingDirection()
	 * but instead returning a point it returns the quadrant where the vector is pointing
	 * i.e.
	 * 			|
	 * 	  2		|	  1
	 * 			|
	 * ---------|-----------
	 * 			|
	 * 	  3		|	  4
	 * 			|
	 * @return int the number of the quadrant as specified in the example, 0 if it's pointing on an axis
	 */
	public int getPointingDirectionToString(){
		int quadrant;
		if(x > 0 && y > 0)
			quadrant = 1;
		else if(x < 0 && y > 0)
			quadrant = 2;
		else if(x < 0 && y < 0)
			quadrant = 3;
		else if(x > 0 && y < 0)
			quadrant = 4;
		else
			quadrant = 0;
		return quadrant;
	}
	
	/**
	 * getAngle 
	 * calculate the angle created between the vector and the X axis
	 * @return double the angle in degree
	 */
	public double getAngle(){
		return Math.toDegrees(Math.atan2(y, x));
	}
	
	/**
	 * getAngleBetween
	 * calculate the angle created between the vector and another vector
	 * @return double the angle in degree
	 */
	public double getAngleBetween(Vector2d vector){
		return Math.toDegrees(Math.atan((vector.yforce-yforce)/(vector.xforce-xforce)));
	}
	
	/**
	 * setIntensity
	 * @param the final intensity of the vector
	 */
	public void setIntensity(double intensity){
		this.intesity = intensity;
	}
	
	/**
	 * setAxisIntensity
	 * @param the intensity of the x component
	 * @param the intensity of the y component
	 */
	public void setAxisIntensity(double xforce, double yforce){
		this.xforce = xforce;
		this.yforce = yforce;
	}
}

