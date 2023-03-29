import java.util.Scanner;
  
public class Main 
{
    public static void main(String[] args) 
  {
        Scanner wysokość = new Scanner(System.in);
        Scanner symbol = new Scanner(System.in);
    
        System.out.println("Podaj symbol");
        String s = symbol.nextLine();
    
        System.out.println("Podaj ilość boku");
        int w = wysokość.nextInt();
  
  
        for (int j = 0; j<w; j++)
        {
            for (int z = 0; z<w; z++)
              System.out.print(s);
              System.out.println(" ");
        }
      System.out.println(" ");

      String s2 = "*";
  
      for (int i = 1; i<=4; i++)
        {
            for (int a = 1; a<=4; a++)
           { 
              if(i>1 && i<4 && a>1 && a<4)
              System.out.print(" ");
             else
                System.out.print(s2);
                 
            }
         System.out.println(" ");
        }
     
    }
}
  