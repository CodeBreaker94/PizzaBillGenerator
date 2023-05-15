
public class Pizza {
	private int price;
	
	private Boolean veg;
	private int extraCheese = 100;
	private int extraToppinsAdded = 150;
	private int backPack = 20;
	private int basePizza;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppinsAdded = false;
	private boolean isOptedForTakeAway =  false;
	
	public Pizza(Boolean veg) {
		super();
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		}
		else
		{
			this.price = 400;
			
		}
		basePizza = this.price;
	}
	
	public void addExtraCheese(){
		isExtraCheeseAdded = true;
		System.out.println("Extra cheese added");
		this.price += extraCheese;
	}
	public void addExtraToppins(){
		isExtraToppinsAdded = true;
		System.out.println("Extra Toppins added");
		this.price += extraToppinsAdded;
	}
	public void takeAway(){
		isOptedForTakeAway = true;
		System.out.println("Take Away opted");
		this.price += backPack;
	}
	public void getBill(){
		String bill= "";
		System.out.println("Pizza :"+ basePizza);
		if (isExtraCheeseAdded) {
			bill += "Extra cheese added: "+extraCheese + "\n";
			
		}
		if (isExtraToppinsAdded) {
			bill += "Extra Topppins added: "+extraToppinsAdded+ "\n";
			
		}
		if (isOptedForTakeAway) {
			bill += "The product is for Take Away: "+backPack+ "\n";
			
		}
		bill+= "Bill : "+this.price + "\n";
		System.out.println(bill);
		
		
		
		
		
	}
	
	
	

}












