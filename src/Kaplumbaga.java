import java.util.Random;

public class Kaplumbaga { 			//Kaplumbaga sýnýfý tanýmlýyoruz.

	private int yer; 				//Kaplumbaga sýnýfýna ait özellikleri belirtiyoruz.
	private int id;
	String a="Tortoise";
	String b="[";
	String c="]";
	@Override
	public String toString() { 		//Kaçýncý sýrada ki kaplumbaganýn kazandýðýný gösterebilmek için id deðiþkenini toString metotu ile yazýyoruz.
		return a+b+(getId()+1)+c+" "+"win";
	}
	public int getYer() {		 	//yer'in get metotunu yazarak kullanýcýnýn bu deðeri görebilmesini saðlýyoruz.
		return yer;
	}
	public void setYer(int yer) { 	//yer'in set metotunu yazarak kullanýcýnýn bu deðeri deðiþtirebilmesini saðlýyoruz.
		this.yer=yer;
	}
	public void setId(int id) { 	//id'nin set metotunu yazarak kullanýcýnýn bu deðeri deðiþtirebilmesini saðlýyoruz.
		this.id=id;
	}
	public int getId() { 			//id'nin get metotunu yazarak kullanýcýnýn bu deðeri görebilmesini saðlýyoruz.
		return id;
	}
	public void hareketlerK() {		//Kaplumbaga'ya ait hareket metotunu yazýyoruz.
		
		Random rand=new Random(); 
		int r=1+rand.nextInt(10);	//Rastgele sayý üretiyoruz. 
		if(r>=1 && r<=5) 			//Ürettiðimiz sayý 1 ve 5 arasýnda ise bu if bloðu çalýþýyor. (Fast Plod)
		{
			yer+=3;
		}
		else if(r==6 || r==7) 		//Ürettiðimiz sayý 6 ve 7 ise bu if bloðu çalýþýyor. (Slip)
		{
			if(yer>6) 				//Eðer kaplumbaðanýn konumu 6'dan büyükse bu blok
			{
				yer-=6;
			}
			else 					//Kaplumbaðanýn konumu 6'dan küçükse bu blok çalýþýyor.
			{
				yer=1;
			}
		}
		else 						//Ürettiðimiz sayý 8,9 ve 10 ise bu blok çalýþýyor. (Slow Plod)
		{
			yer+=1;
		}
	}
}
