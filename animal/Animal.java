package animal;
import food.*;

abstract class Animal {
	/* Public interface -----------------------------------------------------------------------------------------*/
	public String name;
	public double energy;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void walk(int minutes) {
		double perMinuteBurn = 10 * Math.random();
		double caloryExpenditure = minutes * perMinuteBurn;

		if (caloryExpenditure <= this.energy) {
			System.out.println(this.name + " is walking for " + minutes + " min");
			this.energy -= caloryExpenditure;
		} else {
			System.out.println(this.name + " has no enough energy :(");
		}
	}

	public void eat(Food food) {
		String foodName = food.getClass().getSimpleName().toLowerCase();
		
		if (this.shouldEat(food)) {
			System.out.println(this.name + " is eating " + foodName);
			this.energy += food.calories;
		} else {
			System.out.println(this.name + " cannot eat " + foodName + " :C");
		}
	}

	/* Private interface ----------------------------------------------------------------------------------------- */	
	private boolean shouldEat(Food food) {
		if (food instanceof JunkyFood) return false;
		return true;
	}
}
