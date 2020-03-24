package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite  implements Component{
	public String name;
	
	List<Component> components = new ArrayList<Component>();
	
	public Composite(String name) {
		this.name = name;
	}
	
	public void addComponent(Component com) {
		components.add(com);
	}
	
	public void getName() {
		System.out.println("Name:" +name);
	}
	
	public double getPrice() {
		double price =0;
		
		for (Component comp: components) {
			price = price + comp.getPrice();
		}
		
		getName();
		System.out.println();
		return price;
	}
}
