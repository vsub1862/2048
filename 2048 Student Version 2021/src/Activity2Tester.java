import java.util.Random;

public class Activity2Tester {

	public static void main(String[] args) {
		//Create a Board object
       Board b = new Board();
		
		// invoke the toString method by passing the object to 
		// print or println

       	b.populateOne();
		
		System.out.println(b);
		b.eraseBoard();
		//call the populateOne method and print out the board each time
		//does it fill a random location? How about if the board is almost
		//full? Does it still work?
		/*
		Random rnd = new Random(0);
		System.out.println(rnd.nextInt(3));
		System.out.println(rnd.nextInt(3));
		System.out.println(rnd.nextInt(3));
		System.out.println(rnd.nextInt(3));
		System.out.println(rnd.nextInt(3));
		
		rnd.nextInt(10); //[0,9]
		if(rnd.nextInt(10) < 2) {// if 0 or 1 run else
			
		} 
		
		else {
			
		}
		*/
	}

}
