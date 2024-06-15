package com.tns.daytwo;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char x = '1';
		switch (x)
		{
		case 'l' :
		case 'L' :
			System.out.println(x+" is a Letter");
			break;
		case 'd' :
		case 'D' :
			System.out.println(x+" is a Digit");
			break;
		case 'w' :
		case 'W' :
			System.out.println(x+" is white space");
			break;
		case 's' :
		case 'S' :
			System.out.println(x+" is a specil symbol");
			default:
				System.out.println(x+" is other than letter, digit, symbol");
				break;
	}

}
}
