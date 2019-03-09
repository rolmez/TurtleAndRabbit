import java.util.ArrayList;
import java.util.Scanner;

public class Test { //Test s�n�f�

	public static void main(String[] args) { 
		ArrayList<String> arr=new ArrayList<String>(); //ArrayList tan�ml�yoruz.
		Scanner tscan=new Scanner(System.in); //Kullan�c�dan girdi alabilmek i�in 
		Scanner kscan=new Scanner(System.in); 
		System.out.println("Tavsan say�s�n� giriniz:");
		int a=tscan.nextInt(); //Kullan�c�dan ald���m�z de�eri 'a' ya at�yoruz. a burada tav�an say�s� oluyor.
		System.out.println("Kaplumbaga say�s�n� giriniz:");
		int b=kscan.nextInt(); //Kullan�c�dan ald���m�z de�eri 'b' ya at�yoruz. b burada kaplumbaga say�s� oluyor.
		Kaplumbaga k[] = new Kaplumbaga[b]; //Kaplumbaga s�n�f�ndan bir dizi tan�ml�yoruz ve bunun ismine k[] diyoruz. 
											//Bu dizinin boyutu kullan�c�dan al�nan b de�eri kadar oluyor.
		Tavsan t[] = new Tavsan[a]; 		//Tav�an s�n�f�ndan bir dizi tan�ml�yoruz ve bunun ismine t[] diyoruz.
											//Bu dizinin boyutu kullan�c�dan al�nan a de�eri kadar oluyor.
		for(int i=0;i<k.length;i++) {		
			k[i]=new Kaplumbaga();			//Bir for d�ng�s�n�n i�erisinden olu�turdu�umuz dizi objelerine de�er at�yoruz.
											//Bu i�lem yap�lmazsa NullPointerException hatas� al�n�yor.
			k[i].setId(i);					//Her kaplumba�a nesnesine bir id ve yer tan�ml�yoruz.
			k[i].setYer(1);
		}
		
		
		for(int i=0;i<t.length;i++) {		
			t[i]=new Tavsan();			//Bir for d�ng�s�n�n i�erisinden olu�turdu�umuz dizi objelerine de�er at�yoruz.
										//Bu i�lem yap�lmazsa NullPointerException hatas� al�n�yor.
			t[i].setId(i);				//Her kaplumba�a nesnesine bir id ve yer tan�ml�yoruz.
			t[i].setYer(1);
		}
		while(true) { 					//False olana kadar d�necek bir while d�ng�s� yaz�yoruz.
		
			for(int i = 0;i<t.length;i++) {	//t dizisinin uzunlu�u kadar her nesneye Tavsan s�n�f�nda yazd���m�z hareketleri yapt�rt�yoruz.
				t[i].hareketlerT();
			}
			
			for(int i = 0;i<k.length;i++) {	//k dizisinin uzunlu�u kadar her nesneye Kaplumbaga s�n�f�nda yazd���m�z hareketleri yapt�rt�yoruz.
				k[i].hareketlerK();		
			}
			
			for(int i = 0;i<t.length;i++) { //70 uzunlu�u ge�en Tav�an var ise olu�turdu�umuz ArrayList'e bu tav�an� veya tav�anlar� ekliyoruz.
				if(t[i].getYer() >=70) {
					arr.add(t[i].toString());
				}
			}
			for(int i = 0;i<k.length;i++) {//70 uzunlu�u ge�en Kaplumba�a var ise olu�turdu�umuz ArrayList'e bu kaplumba�ay� veya kaplumba�alar� ekliyoruz.
				if(k[i].getYer() >=70) {
					arr.add(k[i].toString());
				}
			}
			for(int j=0;j<t.length;j++) { //Tav�anlar�n yerlerini g�stermelerini sa�layacak d�ng�y� olu�turuyoruz.
				for(int i=1;i<=70;i++ ) {
					if(t[j].getYer()==i) {
						System.out.print("T");
					}
					else {
						System.out.print("_");
					}
				}
				System.out.println();
			}
			for(int j=0;j<k.length;j++) { //Kaplumba�alar�n yerlerini g�stermelerini sa�layacak d�ng�y� olu�turuyoruz.
				for(int i=1;i<=70;i++ ) {
					if(k[j].getYer()==i) {
						System.out.print("K");
					}
					else {
						System.out.print("_");
					}
				}
				System.out.println();
			}
			if(arr.size() > 0) {
				break;
			}
		}
		for(int i=0;i<arr.size();i++) { //E�er kazanan s�n�f�n sonu 'n' (Tav�a'n') ile bitiyorsa bu d�ng�
			if(arr.get(i).endsWith("n")) {
				System.out.println(arr.get(i));
			}
		}		
		for(int i=0;i<arr.size();i++) { //E�er kazanan s�n�f�n sonu 'a'(Kaplumba�'a') ile bitiyorsa bu d�ng� �al���yor.
			if(arr.get(i).endsWith("a")) {
				System.out.println(arr.get(i));
			}
		}	
		if(arr.size() > 1) { //E�er birden fazla kazanan varsa bu d�ng� �al���yor.
		//	System.out.println("BERABERE");
			for(int i=0;i<arr.size();i++) {
				System.out.println(arr.get(i));
			}
			System.out.println("It's a tie between");
		}	
	}
	
}
