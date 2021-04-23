package factory.pizza;

public class CAStylePepperoniPizza extends Pizza {
	public CAStylePepperoniPizza() {
		name = "CA Style Pepperoni Pizza";
		dough = "CA Style Crust Dough";
		sauce = "Malibu Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
