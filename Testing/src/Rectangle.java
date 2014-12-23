import java.awt.Point;


public class Rectangle {
	
	private double width;
	private double length;
	private Point originPoint;
	
	public Rectangle(double w,double l,Point p){
		this.width = w;
		this.length = l;
		this.originPoint = p;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Point getOriginPoint() {
		return originPoint;
	}
	public void setOriginPoint(Point originPoint) {
		this.originPoint = originPoint;
	}
	public boolean isIntersect(Rectangle regObj){
		
		double x1Bgin,x1End,x2Bgin,x2End;
		double y1Bgin,y1End,y2Bgin,y2End;
		x1Bgin = this.getOriginPoint().getX();
		x1End = this.getOriginPoint().getX() + this.getLength();	
		x2Bgin = regObj.getOriginPoint().getX();
		x2End = regObj.getOriginPoint().getX() + regObj.getLength();
		
		y1Bgin = this.getOriginPoint().getY();
		y1End = this.getOriginPoint().getY() + this.getLength();	
		y2Bgin = regObj.getOriginPoint().getY();
		y2End = regObj.getOriginPoint().getY() + regObj.getLength();
		
		boolean xPossible, yPossible,result;
		
		if((x1Bgin >= x2Bgin && x1Bgin <= x2End)  || (x2Bgin >= x1Bgin && x2Bgin <= x1End) ){
			xPossible = true;
		}
		else{
			xPossible = false;
		}
		
		if((y1Bgin >= y2Bgin && y1Bgin <= y2End)  || (y2Bgin >= y1Bgin && y2Bgin <= y1End) ){
			yPossible = true;
		}
		else{
			yPossible = false;
		}
				
		if(xPossible && yPossible){
			result = true;
		}
		else{
			result = false;
		}
		return result;
		
	}
	
	
}
