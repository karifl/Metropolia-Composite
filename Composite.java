package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite  implements Component{
	public String name;
	public double price;
	List<Component> components = new ArrayList<Component>();
	
	public Composite(String name, double price) {
		this.name = name;
		this.price=price;
	}
	
	public void addComponent(Component com) {
		components.add(com);
	}
	
	public void getName() {
		System.out.println("Name:" +name);
	}
	
	public double getPrice() {
		
		for (Component comp: components) {
			price = price + comp.getPrice();
		}
		
		getName();
		System.out.println();
		return price;
	}
}
