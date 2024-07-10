package tns_hello;

public class PrimitiveDataType {

	public static void main(String[] args) {
		
		//range of byte datatype
		byte byteMax = 127;
		byte byteMin = -128;
		
		System.out.println("Max value of byte can be :"+ byteMax);
		System.out.println("Min value of byte can be :"+ byteMin);
		
		
		//range of short datatype
		short shortMax = 32767;
		short shortMin = -32768;
		
		System.out.println("Max value of short can be :"+ shortMax);
		System.out.println("Min value of short can be :"+ shortMin);
		
		
		//range of int datatype
		int intMax = 2147483647;
		int intMin = -2147483648;
		
		System.out.println("Max value of int can be :"+ intMax);
		System.out.println("Min value of int can be :"+ intMin);
		
		
		//range of long datatype
		long longMax=9223372036854775807L;
		long longMin=-9223372036854775808L;
		
		System.out.println("Min range of long is "+ longMin);
		System.out.println("Max range of long is "+longMax);
		
		
		//range of float datatype
		float f=3234.141243278345f;
		
		System.out.println("float value is :"+f);
		
		
		//range of double datatype
		double d=3456.14124512345678902345678914d;
		
		System.out.println("Double value is :"+d);
		
		
		//boolean datatype have only two values as true and false
		boolean flag=false;
		
		System.out.println("boolean value is :"+ flag);
	}

}
