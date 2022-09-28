package arrayList;
import java.util.ArrayList;
public class arrayList {

	public static void main(String[] args) {
		
		String[] fruits = new String[3];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Strawberry";
		System.out.println(fruits[1]);
		
		
		
		
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Watermelon");
		fruitList.add("Orange");
		
		
		System.out.println(fruitList);
		
		fruitList.remove("Strawberry");
		fruitList.remove("Apple");
		fruitList.remove("Watermelon");
		
		System.out.println(fruitList);
		System.out.println("oops, did I do that");
		
		
		
		
	}

}
