
public class Main {
	public static void main(String[] args) {
//		Pizza basePizza = new Pizza(false);
//		basePizza.addExtraToppins();
//		basePizza.addExtraCheese();
////		basePizza.takeAway();
//		basePizza.getBill();
		
		DeluxePizza dp = new DeluxePizza(true);
		dp.getBill();
		dp.addExtraCheese();
		dp.addExtraToppins();
	}

}
