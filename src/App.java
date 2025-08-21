import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner tb = new Scanner(System.in);
        int[] array = new int[4];
                            System.out.println(Arrays.toString(array));

        int val=0;
        while(val!=4)
        {
            System.out.println("MENY: ");
            System.out.println("1. Lägg in tal i arrayen på en viss plats");
            System.out.println("2. Nollställ ett tal i arrayen på en viss plats");
            System.out.println("3. Flytta ett tal i arrayen från en plats till en annan,");
            System.out.println("4. Avsluta");
            int tal =0;
            int plats=0;
            int ny_plats =0;
            System.out.println("Array:"+Arrays.toString(array));
            System.out.print("Ange val:");
            val=tb.nextInt();

            switch(val){
                  case 1 -> {
                      System.out.print("Ange tal:");
                      tal = tb.nextInt();
                      System.out.print("Ange plats:");
                      plats = tb.nextInt();
                      array[plats]=tal;
                }
                  case 2 -> {
                      System.out.print("Ange plats som ska nollställas:");
                      plats = tb.nextInt();
                      array[plats]=0;
                }
                  case 3 -> {
                      System.out.print("Ange plats för tal som ska flyttas:");
                      plats = tb.nextInt();
                      System.out.print("Ange ny plats som talet  ska flyttas till:");
                      int temp = array[ny_plats];
                      array[ny_plats]=array[plats];
                      array[plats]=temp;
                }
                  case 4 -> System.out.println("Ajöken");

                  default -> System.out.println("Fel val, välj en siffra 1-4");
            }
                
        }
        tb.close();
    }

    
}
