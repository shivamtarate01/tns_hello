package tns_hello;

public class DataTypeDemo {

	public static void main(String[] args) {
		
		//example of different values as per their datatype
		int value1 = 9/2;
		float value2 = 100f/3f;
		double value3 = 100d/3d;
		float value4 = 100/3;
		
		System.out.println("Value 1 is :"+ value1);
		System.out.println("Value 2 is :"+ value2);
		System.out.println("Value 3 is :"+ value3);
		System.out.println("Value 4 is :"+ value4);
		
		
		
		//Percentage calculator
		int marker = 512;
		double percentage = marker*0.46f;
		
		System.out.println("Percentage is :"+ percentage);
		
		
		
		//Area of square
		int side = 2;
		int area = side*side;
		
		System.out.println("Area is :"+ area);
	}

}
