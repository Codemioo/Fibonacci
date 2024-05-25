package fibonacci;
import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
        // TODO Auto-generated method stub

       //While ile FİBONACCİ
        Scanner oku=new Scanner(System.in);
        System.out.println("Kaç Adet Fibonnacci Sayısı Görmek İstiyorsunuz?");
        int sayi=oku.nextInt();
        

	   int birinci=0;
		int ikinci=1;
		
		int ucuncu=birinci+ikinci;
        
        System.out.println("Fibonacci Sayıları: ");
        
       
          System.out.print(birinci+ " "+ikinci+ " ");
          
      
            while(sayi>0){
            	sayi--; 
            
            
            	
            System.out.print(ucuncu+ " "); 
            birinci=ikinci;
            ikinci=ucuncu;      
            ucuncu=birinci+ikinci;
            
           
            }
            
              // for döngüsü ile FİBONACCİ:
            
            Scanner reader = new Scanner(System.in);
            System.out.print("Bir Sayı Girin:");
     
            int num = reader.nextInt();
            int t1 = 0, t2 = 1;
            System.out.print(num+"=" + "Sayısının Fibonacci Sayıları: ");
     
            for (int i = 1; i <= num; ++i)
            {
                System.out.print(t1 + " + ");
     
                int toplam = t1 + t2;
                t1 = t2;
                t2 = toplam;
            }
          }   
}
