import java.util.Random;

public class RandomVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		//generate from -2billion to 2billion
		int x = random.nextInt();
		System.out.println(x);
		
		//generate numbers from 0 to 5
		int y = random.nextInt(6);
		System.out.println(y);
		
		//generate numbers from 0 to 6
		int z = random.nextInt(6)+1;
		System.out.println(z);
		
	
	}

}
