package Array;

import java.util.Random;

public class Array {

	public static void main(String[] args) 
	{
		/* Soru:5  Rastgele sayılardan oluşan 100 elemanlık tamsayı dizisi oluşturuldu. Ardından tek ve çift sayılar bulundu */
		
		System.out.println("Sayılar ");
        int dizi[] = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < dizi.length; i++) 
        {
            int rastgele = rnd.nextInt(101);
            dizi[i] = rastgele;
            System.out.print(dizi[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Çift sayılar ");
        for (int i = 0; i < dizi.length; i++) 
        {
            if (dizi[i] % 2 == 0)
            {
                System.out.print(dizi[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Tek sayılar ");
        for (int i = 0; i < dizi.length; i++)
        {
            if (dizi[i] % 2 == 1)
            {
                System.out.print(dizi[i] + " ");
            }
        }
}
}
