import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	    
	   int mat, fizik, kimya, turkce, tarih, muzik;
	   
	    Scanner input = new Scanner(System.in);

	    System.out.print("matematik notunuz:  ");
        mat = input.nextInt();
        
	    System.out.print("fizik notunuz:  ");
        fizik = input.nextInt();
	    
	    System.out.print("kimya notunuz:  ");
        kimya = input.nextInt();
	    
	    System.out.print("türkçe notunuz:  ");
        turkce = input.nextInt();
	    
	    System.out.print("tarih notunuz:  ");
        tarih = input.nextInt();
	    
	    System.out.print("müzik notunuz:  ");
        muzik = input.nextInt();
	    
	    int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
	    double ortalama = toplam/6;
	    
	    System.out.println("Ortalamanız:" + ortalama);
	    
	    boolean durum = ortalama >= 60;
	    
	    String str= durum ? "sinifi  gectiniz":"sinifta  kaldiniz";
        System.out.println(str);
	   
	   
	}
}
