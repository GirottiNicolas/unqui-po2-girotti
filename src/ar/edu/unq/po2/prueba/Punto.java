package ar.edu.unq.po2.prueba;

import java.util.ArrayList;
import java.util.List;

public class Punto {
	
	private float x;
	private float y;
	List<Integer> numeros = new ArrayList<Integer>();
	
	public Punto(float x, float y) {
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
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public boolean tieneElNumero(Integer numero) {
		return numeros.contains(numero);
		
	}
	
	
}