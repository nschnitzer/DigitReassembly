//******************************************************
// Nathan Schnitzer
// DigitReassembly.java
// 12/4/18
// ACSL Contest #1 - Senior Division
//******************************************************

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class DigitReassembly 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner scan = new Scanner(new File("src/inputs.txt"));
		while (scan.hasNextLine())
		{
			StringTokenizer tokenizer = new StringTokenizer(scan.nextLine());
			String token1 = tokenizer.nextToken();
			int n = Integer.parseInt(tokenizer.nextToken());
			
			while (token1.length() % n != 0)
			{
				token1 = token1 + "0";
			}
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i < token1.length(); i++)
			{
				arr.add(Integer.parseInt(token1.substring(i, i+n)));
				i = i + n - 1;
			}
			
			int sum = 0;
			for (int i = 0; i < arr.size(); i++)
			{
				sum = sum + arr.get(i);
			}
			
			System.out.println(sum);
		}

	}

}
