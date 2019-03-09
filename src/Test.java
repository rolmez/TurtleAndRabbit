import java.util.ArrayList;
import java.util.Scanner;

public class Test { //Test sýnýfý

	public static void main(String[] args) { 
		ArrayList<String> arr=new ArrayList<String>(); //ArrayList tanýmlýyoruz.
		Scanner tscan=new Scanner(System.in); //Kullanýcýdan girdi alabilmek için 
		Scanner kscan=new Scanner(System.in); 
		System.out.println("Tavsan sayýsýný giriniz:");
		int a=tscan.nextInt(); //Kullanýcýdan aldýðýmýz deðeri 'a' ya atýyoruz. a burada tavþan sayýsý oluyor.
		System.out.println("Kaplumbaga sayýsýný giriniz:");
		int b=kscan.nextInt(); //Kullanýcýdan aldýðýmýz deðeri 'b' ya atýyoruz. b burada kaplumbaga sayýsý oluyor.
		Kaplumbaga k[] = new Kaplumbaga[b]; //Kaplumbaga sýnýfýndan bir dizi tanýmlýyoruz ve bunun ismine k[] diyoruz. 
											//Bu dizinin boyutu kullanýcýdan alýnan b deðeri kadar oluyor.
		Tavsan t[] = new Tavsan[a]; 		//Tavþan sýnýfýndan bir dizi tanýmlýyoruz ve bunun ismine t[] diyoruz.
											//Bu dizinin boyutu kullanýcýdan alýnan a deðeri kadar oluyor.
		for(int i=0;i<k.length;i++) {		
			k[i]=new Kaplumbaga();			//Bir for döngüsünün içerisinden oluþturduðumuz dizi objelerine deðer atýyoruz.
											//Bu iþlem yapýlmazsa NullPointerException hatasý alýnýyor.
			k[i].setId(i);					//Her kaplumbaða nesnesine bir id ve yer tanýmlýyoruz.
			k[i].setYer(1);
		}
		
		
		for(int i=0;i<t.length;i++) {		
			t[i]=new Tavsan();			//Bir for döngüsünün içerisinden oluþturduðumuz dizi objelerine deðer atýyoruz.
										//Bu iþlem yapýlmazsa NullPointerException hatasý alýnýyor.
			t[i].setId(i);				//Her kaplumbaða nesnesine bir id ve yer tanýmlýyoruz.
			t[i].setYer(1);
		}
		while(true) { 					//False olana kadar dönecek bir while döngüsü yazýyoruz.
		
			for(int i = 0;i<t.length;i++) {	//t dizisinin uzunluðu kadar her nesneye Tavsan sýnýfýnda yazdýðýmýz hareketleri yaptýrtýyoruz.
				t[i].hareketlerT();
			}
			
			for(int i = 0;i<k.length;i++) {	//k dizisinin uzunluðu kadar her nesneye Kaplumbaga sýnýfýnda yazdýðýmýz hareketleri yaptýrtýyoruz.
				k[i].hareketlerK();		
			}
			
			for(int i = 0;i<t.length;i++) { //70 uzunluðu geçen Tavþan var ise oluþturduðumuz ArrayList'e bu tavþaný veya tavþanlarý ekliyoruz.
				if(t[i].getYer() >=70) {
					arr.add(t[i].toString());
				}
			}
			for(int i = 0;i<k.length;i++) {//70 uzunluðu geçen Kaplumbaða var ise oluþturduðumuz ArrayList'e bu kaplumbaðayý veya kaplumbaðalarý ekliyoruz.
				if(k[i].getYer() >=70) {
					arr.add(k[i].toString());
				}
			}
			for(int j=0;j<t.length;j++) { //Tavþanlarýn yerlerini göstermelerini saðlayacak döngüyü oluþturuyoruz.
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
			for(int j=0;j<k.length;j++) { //Kaplumbaðalarýn yerlerini göstermelerini saðlayacak döngüyü oluþturuyoruz.
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
		for(int i=0;i<arr.size();i++) { //Eðer kazanan sýnýfýn sonu 'n' (Tavþa'n') ile bitiyorsa bu döngü
			if(arr.get(i).endsWith("n")) {
				System.out.println(arr.get(i));
			}
		}		
		for(int i=0;i<arr.size();i++) { //Eðer kazanan sýnýfýn sonu 'a'(Kaplumbað'a') ile bitiyorsa bu döngü çalýþýyor.
			if(arr.get(i).endsWith("a")) {
				System.out.println(arr.get(i));
			}
		}	
		if(arr.size() > 1) { //Eðer birden fazla kazanan varsa bu döngü çalýþýyor.
		//	System.out.println("BERABERE");
			for(int i=0;i<arr.size();i++) {
				System.out.println(arr.get(i));
			}
			System.out.println("It's a tie between");
		}	
	}
	
}
