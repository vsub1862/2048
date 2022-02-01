import java.util.Arrays;

public class Activity3Tester {

	public static void main(String[] args) {
		int[][] co = { {2,1,3},{3,5,6},{7,0,4}};
		//Declare a Board object
		//Board b = new Board();
		//create an array with some values you want to 
		//slideRight. ie [2 0 0 0]
		
		//b.populateOne();
		//b.slideLeft();
		int[] ticketInfo = {0,25,20,25};//sample data to slide
		int[] result = new int[co.length];
		Board b = new Board(); 	   //instance object
		result = b.getCol(co, 2);
		System.out.println(Arrays.toString(result));

		
		
		//invoke the slideRight method on the array 
		
		
		//print out the array to see if slideRight
		//worked
		
		
	}

}
