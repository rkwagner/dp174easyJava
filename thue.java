//Author:	Ryan Wagner
//Date:		August 24, 2014
//Description:	Outputs the 0th-nth order Thue-Morse Sequence
//		Per Dailyprogrammer Challenge #174 (easy)

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class thue{

	public static String build(String in){
		String out="";
		for(int i=0;i<in.length();i++){
			out+=(in.charAt(i)=='0'?'1':'0');
		}
		return out;
	}

	public static void main(String[] args){
		System.out.print("Input Thue-Morse max order.\n>");
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		String thue = "0";
		System.out.println("0: " + thue);
		int i=0;
		try{
		for(i=0;i<=Integer.parseInt(n);i++){
			System.out.println(i + ": " + (thue+=build(thue)));
		}
		}catch(OutOfMemoryError e)
		{
			System.out.println("Out of memory, n="+i);
		}
	}

}
