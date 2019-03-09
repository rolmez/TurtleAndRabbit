import java.util.Random;

public class Kaplumbaga { 			//Kaplumbaga s�n�f� tan�ml�yoruz.

	private int yer; 				//Kaplumbaga s�n�f�na ait �zellikleri belirtiyoruz.
	private int id;
	String a="Tortoise";
	String b="[";
	String c="]";
	@Override
	public String toString() { 		//Ka��nc� s�rada ki kaplumbagan�n kazand���n� g�sterebilmek i�in id de�i�kenini toString metotu ile yaz�yoruz.
		return a+b+(getId()+1)+c+" "+"win";
	}
	public int getYer() {		 	//yer'in get metotunu yazarak kullan�c�n�n bu de�eri g�rebilmesini sa�l�yoruz.
		return yer;
	}
	public void setYer(int yer) { 	//yer'in set metotunu yazarak kullan�c�n�n bu de�eri de�i�tirebilmesini sa�l�yoruz.
		this.yer=yer;
	}
	public void setId(int id) { 	//id'nin set metotunu yazarak kullan�c�n�n bu de�eri de�i�tirebilmesini sa�l�yoruz.
		this.id=id;
	}
	public int getId() { 			//id'nin get metotunu yazarak kullan�c�n�n bu de�eri g�rebilmesini sa�l�yoruz.
		return id;
	}
	public void hareketlerK() {		//Kaplumbaga'ya ait hareket metotunu yaz�yoruz.
		
		Random rand=new Random(); 
		int r=1+rand.nextInt(10);	//Rastgele say� �retiyoruz. 
		if(r>=1 && r<=5) 			//�retti�imiz say� 1 ve 5 aras�nda ise bu if blo�u �al���yor. (Fast Plod)
		{
			yer+=3;
		}
		else if(r==6 || r==7) 		//�retti�imiz say� 6 ve 7 ise bu if blo�u �al���yor. (Slip)
		{
			if(yer>6) 				//E�er kaplumba�an�n konumu 6'dan b�y�kse bu blok
			{
				yer-=6;
			}
			else 					//Kaplumba�an�n konumu 6'dan k���kse bu blok �al���yor.
			{
				yer=1;
			}
		}
		else 						//�retti�imiz say� 8,9 ve 10 ise bu blok �al���yor. (Slow Plod)
		{
			yer+=1;
		}
	}
}
