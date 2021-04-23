package factory.pizza;

public class CAStyleVeggiePizza extends Pizza {
	public CAStyleVeggiePizza() {
		name = "CA Deep Dish Veggie Pizza";
		dough = "CA Style Crust Dough";
		sauce = "Malibu Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
