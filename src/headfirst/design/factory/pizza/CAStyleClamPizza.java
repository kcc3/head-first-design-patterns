package factory.pizza;

public class CAStyleClamPizza extends Pizza {
	public CAStyleClamPizza() {
		name = "CA Style Clam Pizza";
		dough = "CA Style Crust Dough";
		sauce = "Malibu Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Frozen Clams from SF Bay");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
