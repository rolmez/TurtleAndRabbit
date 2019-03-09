import java.util.Random;

public class Tavsan { 				//Tavsan s�n�f� tan�ml�yoruz.

	private int yer; 				//Tavsan s�n�f�na ait �zellikleri belirtiyoruz.
	private int id;
	String a="Hare";
	String b="[";	
	String c="]";
	@Override
	public String toString() {		//Ka��nc� s�rada ki tav�an�n kazand���n� g�sterebilmek i�in id de�i�kenini toString metotu ile yaz�yoruz.
		return a+b+(getId()+1)+c+" "+"win";
	}
	
	public int getId() { 			//id'nin get metotunu yazarak kullan�c�n�n bu de�eri g�rebilmesini sa�l�yoruz.
		return id;
	}
	public void setId(int id) { 	//id'nin set metotunu yazarak kullan�c�n�n bu de�eri de�i�tirebilmesini sa�l�yoruz.
		this.id = id;
	}
	public int getYer() {			//yer'in get metotunu yazarak kullan�c�n�n bu de�eri g�rebilmesini sa�l�yoruz.
		return yer;
	}
	public void setYer(int yer) { 	//yer'in set metotunu yazarak kullan�c�n�n bu de�eri de�i�tirebilmesini sa�l�yoruz.
		this.yer=yer;
	}
	public void hareketlerT() { 	//Random say� olu�turarak tav�an�n hangi say�ya kar�� hangi hareketi yapaca��n�n� belirten metotu olu�turuyoruz.
		Random rand=new Random(); 
		int r=1+rand.nextInt(10);	//Random say� �retiyoruz.
		if(r==1 || r==2) { 			//Say� 1 veya 2 gelirse hangi hareketi yapaca��n� g�steriyoruz. (Sleep)
			yer = yer;
		}
		if(r==3 || r==4) { 			//Say� 3 veya 4 gelirse hangi hareketi yapaca��n� g�steriyoruz.	(Big Hop)
			yer += 9;
		}
		if(r==5) { 					//Say� 5 gelirse hangi hareketi yapaca��n� g�steriyoruz. (Big Slip)
			if(yer>12) { 			//Tav�an�n bulundu�u yer 12. konumdan b�y�kse bu if �al���yor.
				yer-=12;
			}
			else { 					//Bulundu�u yer 12. konumdan k���kse bu if �al���yor.(Konumun - de�erlere d��memesi i�in)
				yer=1;
			}
		}
		if(r==6 || r==7 || r==8) { //Say� 6,7 veya 8 gelirse hangi hareketi yapaca��n� g�steriyoruz. (Small Hop)
			yer+=1;
		}
		if(r==9 || r==10) { 		//Ve say� �stteki durumlar haricinde gelirse(9 ve 10) Bu if blo�u �al���yor. (Small Slip)
			                		//Fakat burada da i� i�e if kullan�caz ��nk� konumun - olmamas�n� istiyoruz.
			if(yer>2) {     		//Tav�an�n konumu 2 den b�y�kse bu blok
				yer-=2;
			}
			else { 					//Tav�an�n konumu 2 den k���kse bu blok �al���yor.
				yer=1;
			}
		}
	}
}
