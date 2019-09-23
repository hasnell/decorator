package csce247.assignments.decorator;
//noah snell assignment 3
public class Cherry extends ToppingsDecorator {
	IceCream iceCream;
	
	public Cherry(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String toString() {
		return iceCream.toString() + ", + a cherry on top.";
	}
	
	public double getCost() {
		return iceCream.getCost() + 0.4;
	}
}
