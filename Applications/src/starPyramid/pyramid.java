package starPyramid;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args)
	{
		/*SORU:4 Görüntüyü ekrana yazdıran program */
		
		for (int i = 0; i < 11; i++) 
		{
             for (int j = 0; j < i; j++) 
             {
				System.out.print(" * ");
			}
             System.out.println(" ");
		}
		 
		/* Eğer görüntünün boyutunu kendimiz belirlemek istersek; */
	/*	Scanner scan = new Scanner(System.in);
		System.out.print("Boyut Giriniz: ");
		int boyut = scan.nextInt();
		scan.close();
		
		for (int i = 0; i < boyut; i++)
		{
			for (int j =0; j < i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println(" "); 
		} */ 
	}
}
