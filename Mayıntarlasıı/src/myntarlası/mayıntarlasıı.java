package myntarlası;
import java.util.Random;
import java.util.Scanner;
public class mayıntarlasıı {

	public static void main(String[] args)
	{
		///Ad-Soyad:Furkan Koçyiğit- Öğrenci No:233908008-Bölüm:Bilgisayar mühendisliği ;//
			Random rnd=new Random();
			Scanner scan=new Scanner(System.in);
			int P=0;
			int sayaç1=0;
			int işlem=1;
			System.out.println("Lütfen oluşturmak istediğiniz oyunun satır büyüklüğünü giriniz.");
			int s1=scan.nextInt();
			System.out.println("Lütfen oluşturmak istediğiniz oyunun sütun büyüklüğünü giriniz.");
			int s2=scan.nextInt();
			char[][]d2=new char[s1][s2];
			char[][]d3=new char[s1][s2];
			while(true) 
			{
				System.out.println("Lütfen oyunun zorluk yüzdesini giriniz."+("%20-%80 arası değer giriniz."));
				int z1=scan.nextInt();
				if(z1<20||z1>80) 
				{
					System.err.println("Zorluk düzeyini yanlış girdiniz tekrar deneyiniz.");
				}
				else 
				{
					işlem=(s1*s2*z1)/100;
					break;
				}
			}
			for(int i=0;i<s1;i++) 
			{
				for(int j=0;j<s2;j++) 
				{
					d3[i][j]='0';
					d2[i][j]='*';
				}
			
			}
			while(sayaç1!=işlem) 
			{
				int i=rnd.nextInt(s1);
				int j=rnd.nextInt(s2);
				if(d3[i][j]=='0') 
				{
					d3[i][j]='1';
					sayaç1++;
				}
			}
			System.out.println("Mayınlar Yerleştirildi o zaman Oyun başlasın!!!");
			for(int i=0;i<s1;i++) 
			{
				for(int j=0;j<s2;j++) 
				{
					System.out.print(d2[i][j]);
				}
				System.out.println();
			}
			while(true) 
			{
				System.out.println("Lütfen seçmek istediğiniz satır büyüklüğünü giriniz."+("Lütfen 1-"+s1+" "+"kadar bir büyüklük giriniz."));
				int k=scan.nextInt()-1;
				System.out.println("Lütfen seçmek istediğiniz sütun büyüklüğünü giriniz."+("Lütfen 1-"+s2+" "+"kadar bir büyüklük giriniz."));
				int l=scan.nextInt()-1;
				if(k<s1&&l<s2) 
				{
					if (d2[k][l] != '*') 
					  {
					        System.err.println("Girmiş olduğunuz değeri tekrar girdiniz, lütfen tekrar deneyiniz.");
					        continue;
					  }
					else if(d3[k][l]=='0') 
					{
						d2[k][l]=d3[k][l];
						P+=5;
						for(int i=0;i<s1;i++) 
						{
							for(int j=0;j<s2;j++) 
							{
								System.out.print(d2[i][j]+" ");
							}
							System.out.println();
						}
					}	
					else 
					{
						System.err.println("Oyun Bitti Dostum Üzgünüm!!:(");
						System.out.println("Toplam skor:"+P);
						for(int i=0;i<s1;i++) 
						{
							for(int j=0;j<s2;j++) 
							{
								System.out.print(d3[i][j]+" ");
							}
							System.out.println();
						}
						break;
					}
				}
				else 
				{
					System.err.println("Yanlış değer girdiniz.tekrar deneyiniz.");
				}
			}
			scan.close();	}
	}


