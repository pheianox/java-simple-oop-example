import animal.*;
import food.*;

public class Main {
	public static void main(String[] args) {
		// Create Murka
		Cat kitty = new Cat("Murka");

		// Feed
		kitty.eat(new Milk());
		kitty.eat(new Milk());
		kitty.eat(new Milk());

		// Walk for 30 minutes
		kitty.walk(30);

		// Make sound
		kitty.meow();
	}
}
