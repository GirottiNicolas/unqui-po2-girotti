package tp5;

import java.util.ArrayList;
import java.util.List;

import tp5.interfaces.Consumible;



public class Cliente {
	
	private List<Consumible > consumibles = new ArrayList<Consumible>();
	
	public List<Consumible> getConsumibles(){
		return consumibles;
	}
	
	public void agregarConsumible(Consumible producto) {
		consumibles.add(producto);
	}
}
