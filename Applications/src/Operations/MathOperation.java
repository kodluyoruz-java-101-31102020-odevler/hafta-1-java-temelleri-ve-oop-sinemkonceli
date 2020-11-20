package Operations;

import java.util.Arrays;
import java.util.Scanner;

public class MathOperation {
	
	public static void main(String[] args) 
	{
		/* SORU:2 */ 
	
		int sayi1,sayi2,sonuc;
		String islem=" ";
		Scanner okuyucu = new Scanner(System.in);
		System.out.print("1.Sayıyı Girin: ");
		sayi1= okuyucu.nextInt();
		System.out.print("2.Sayıyı Girin: ");
		sayi2= okuyucu.nextInt();
		
		System.out.println(" ");
		String[] islemler= {"Toplama (+)","Çıkarma (-)","Çarpma  (*)","Bölme   (/)"};
		System.out.println("YAPILMASI GEREKEN İŞLEMLER");
		for (int i = 0; i < islemler.length; i++)
		{
			System.out.println( islemler[i]);
		}
		System.out.println(" ");
		System.out.print("Yapmak istediğiniz işlemi Girin: ");
		islem=okuyucu.next();
		int[] sayilar= new int[6]; 
			
		sonuc=0;
		if(islem.equals("+"))
			sonuc=sayi1+sayi2;
		else if(islem.equals("-"))
			sonuc=sayi1-sayi2;
		else if(islem.equals("*"))
			sonuc=sayi1*sayi2;
		else if(islem.equals("/"))
			sonuc=sayi1/sayi2;
		System.out.println("SONUÇ:"+ sonuc);
		
	}
}


