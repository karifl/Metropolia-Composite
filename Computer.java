package composite;



public class Computer {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
		Component Cabinet = new Composite("Metal covered cabinet");
		Component Motherboard = new Composite("Zephyr");
		Component NIC = new ComputerPart("Infiltrator 5", 245.00);
		Component HD = new ComputerPart("Buffalo 4 TB", 200.00);
		Component GraphicCard = new ComputerPart("Nvidia GeForce 3", 250.00);
		Component CPU = new ComputerPart("Intel X", 210.00);
		Component RAM = new ComputerPart("Corsair DDR3 4Ghz", 90.00);
		Component Computer = new Composite("HiveMind");
		
		Motherboard.addComponent(RAM);
		Motherboard.addComponent(CPU);
		Cabinet.addComponent(Motherboard);
		Cabinet.addComponent(HD);
		Cabinet.addComponent(NIC);
		Cabinet.addComponent(GraphicCard);
		Computer.addComponent(Cabinet);
		
		System.out.println("Motherboad total price:" + Motherboard.getPrice());
		System.out.println("*******************END OF THE LINE ****************");
		System.out.println();
		System.out.println("Cabinet total price:" + Cabinet.getPrice());
		System.out.println("*******************END OF THE LINE ****************");
		System.out.println();
		System.out.println("Computer total price:" + Computer.getPrice());
		System.out.println("*******************END OF THE LINE ****************");


	}

}
