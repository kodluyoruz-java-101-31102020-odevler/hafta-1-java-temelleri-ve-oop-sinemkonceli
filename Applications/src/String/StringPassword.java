package String;

import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args)
	{
		/* SORU:1 */
		
		 String password = "123sinem456";
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Şifre Giriniz:");
		 String enterPassword= scan.nextLine();
		
		 if ( enterPassword.equals(password)) 
		 {
			System.out.print("Giriş Başarılı !");
		 }
		 else  {
			System.out.print("Giriş Başarısız!");
		}

	}

}
