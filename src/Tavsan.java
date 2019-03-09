import java.util.Random;

public class Tavsan { 				//Tavsan sýnýfý tanýmlýyoruz.

	private int yer; 				//Tavsan sýnýfýna ait özellikleri belirtiyoruz.
	private int id;
	String a="Hare";
	String b="[";	
	String c="]";
	@Override
	public String toString() {		//Kaçýncý sýrada ki tavþanýn kazandýðýný gösterebilmek için id deðiþkenini toString metotu ile yazýyoruz.
		return a+b+(getId()+1)+c+" "+"win";
	}
	
	public int getId() { 			//id'nin get metotunu yazarak kullanýcýnýn bu deðeri görebilmesini saðlýyoruz.
		return id;
	}
	public void setId(int id) { 	//id'nin set metotunu yazarak kullanýcýnýn bu deðeri deðiþtirebilmesini saðlýyoruz.
		this.id = id;
	}
	public int getYer() {			//yer'in get metotunu yazarak kullanýcýnýn bu deðeri görebilmesini saðlýyoruz.
		return yer;
	}
	public void setYer(int yer) { 	//yer'in set metotunu yazarak kullanýcýnýn bu deðeri deðiþtirebilmesini saðlýyoruz.
		this.yer=yer;
	}
	public void hareketlerT() { 	//Random sayý oluþturarak tavþanýn hangi sayýya karþý hangi hareketi yapacaðýnýný belirten metotu oluþturuyoruz.
		Random rand=new Random(); 
		int r=1+rand.nextInt(10);	//Random sayý üretiyoruz.
		if(r==1 || r==2) { 			//Sayý 1 veya 2 gelirse hangi hareketi yapacaðýný gösteriyoruz. (Sleep)
			yer = yer;
		}
		if(r==3 || r==4) { 			//Sayý 3 veya 4 gelirse hangi hareketi yapacaðýný gösteriyoruz.	(Big Hop)
			yer += 9;
		}
		if(r==5) { 					//Sayý 5 gelirse hangi hareketi yapacaðýný gösteriyoruz. (Big Slip)
			if(yer>12) { 			//Tavþanýn bulunduðu yer 12. konumdan büyükse bu if çalýþýyor.
				yer-=12;
			}
			else { 					//Bulunduðu yer 12. konumdan küçükse bu if çalýþýyor.(Konumun - deðerlere düþmemesi için)
				yer=1;
			}
		}
		if(r==6 || r==7 || r==8) { //Sayý 6,7 veya 8 gelirse hangi hareketi yapacaðýný gösteriyoruz. (Small Hop)
			yer+=1;
		}
		if(r==9 || r==10) { 		//Ve sayý üstteki durumlar haricinde gelirse(9 ve 10) Bu if bloðu çalýþýyor. (Small Slip)
			                		//Fakat burada da iç içe if kullanýcaz çünkü konumun - olmamasýný istiyoruz.
			if(yer>2) {     		//Tavþanýn konumu 2 den büyükse bu blok
				yer-=2;
			}
			else { 					//Tavþanýn konumu 2 den küçükse bu blok çalýþýyor.
				yer=1;
			}
		}
	}
}
