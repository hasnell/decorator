package csce247.assignments.decorator;
//noah snell assignment 3
public class VanillaIceCream extends IceCream {
	public VanillaIceCream() {
		this.description = "Vanilla Ice Cream";
	}
	
	public double getCost() {
		return 0.75;
	}
}
