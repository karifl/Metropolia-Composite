package composite;

public class ComputerPart implements Component {
	public double price;
	public String name;
	
	public ComputerPart(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void addComponent(Component component) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: Cannot add component on a simple component.");
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("Name:" + name);
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		getName();
		System.out.println("price: " +price);
		System.out.println();
		return price;
	}
}
