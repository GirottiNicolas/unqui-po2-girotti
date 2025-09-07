package ar.edu.unq.po2.tp3;


public class Punto {
	
	private float x;
	private float y;
	
	
	public Punto(float x, float y) {
		super(); // ¿Por que es necesario este super?
		this.setXY(x,y);
	}
	
	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	
	private void setX(float x) {
		this.x = x;
	}
	
	private void setY(float y) {
		this.y = y;
	}
	
	
	
}