package practice10;

import java.util.Random;

public class Car {
	int serialNo, gasoline;
	String color;


	int run() {
		this.gasoline -= 1;
		if(gasoline >= 0) {
			return  new Random().nextInt(15) + 1;
		} else {
			return -1;
		}
	}
}
