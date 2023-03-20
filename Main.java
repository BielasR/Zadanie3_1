import java.util.Scanner;
  
public class Main 
{
    public static void main(String[] args) 
  {
        Scanner wysokość = new Scanner(System.in);
        Scanner symbol = new Scanner(System.in);
    
        System.out.println("Podaj symbol");
        String s = symbol.nextLine();
    
        System.out.println("Podaj wysokosc choinki");
        int w = wysokość.nextInt();
  
  
        for (int i = 1; i<=w; i++)
        {
            for(int j=0;j<w-i;j++)
              System.out.print(" ");
          
            for (int j = 0; j<(i*2)-1; j++) //ustala ilość symboli w linijce 
              System.out.print(s);
              System.out.println(" ");
        }
  
    }
}