package csce247.assignments.decorator;
//noah snell assignment 3
public class ChocolateChips extends ToppingsDecorator {
	IceCream iceCream;
	
	public ChocolateChips(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String toString() {
		return iceCream.toString() + ", + chocolate chips.";
	}
	
	public double getCost() {
		return iceCream.getCost() + 0.3;
	}
}
