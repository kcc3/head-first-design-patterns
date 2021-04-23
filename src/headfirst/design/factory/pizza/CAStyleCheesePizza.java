package factory.pizza;

public class CAStyleCheesePizza extends Pizza {
	public CAStyleCheesePizza() {
		name = "CA Style Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "CA Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into sqaure slices");
	}
}
