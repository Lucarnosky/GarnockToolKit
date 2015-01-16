package garnocktoolkit.lucarnosky.physics;

import java.awt.Point;

public class Vector2d {

	//Vector Axis
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
	
}
