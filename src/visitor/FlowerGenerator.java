/**
 * @author shadow
 * @Date 2016��8��13������8:18:55
 * @Fun
 **/
package visitor;

import java.util.Random;

public class FlowerGenerator {
	private static Random random = new Random();
	
	public static Flower newFlower(){
		switch (random.nextInt(2)) {
		default:
		case 0:			
			return new Gladiolus();
		case 1:
			return new Chrysanthemum();
		}
	}
}
