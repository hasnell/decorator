package csce247.assignments.decorator;
//noah snell assignment 3
public abstract class IceCream {
	protected String description;
	
	public String toString() {
		return description;
	}
	
	public abstract double getCost();
}
