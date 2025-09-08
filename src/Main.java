import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5]; // exempelarray

        boolean kör = true;
        while (kör) {
            System.out.println("\nMeny:");
            System.out.println("1. Lägg in tal");
            System.out.println("2. Nollställ tal");
            System.out.println("3. Byt plats på tal");
            System.out.println("4. Avsluta");
            System.out.print("Ditt val: ");

            int val = 0;
            try {
                val = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Fel inmatning! Ange ett heltal.");
                scanner.nextLine(); // rensar bufferten
                continue; // gå tillbaka till menyn
            }

            switch (val) {
                case 1 -> {
                    try {
                        System.out.print("Vilket index? ");
                        int index = scanner.nextInt();
                        System.out.print("Vilket tal? ");
                        int tal = scanner.nextInt();
                        array[index] = tal;
                        System.out.println("Talet " + tal + " sattes in på plats " + index);
                    } catch (InputMismatchException e) {
                        System.out.println("Fel: Du måste ange ett heltal.");
                        scanner.nextLine();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Fel: Index utanför arrayens storlek!");
                    }
                }
                case 2 -> {
                    try {
                        System.out.print("Vilket index vill du nollställa? ");
                        int index = scanner.nextInt();
                        array[index] = 0;
                        System.out.println("Nollställt plats " + index);
                    } catch (InputMismatchException e) {
                        System.out.println("Fel: Du måste ange ett heltal.");
                        scanner.nextLine();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Fel: Index utanför arrayens storlek!");
                    }
                }
                case 3 -> {
                    try {
                        System.out.print("Första index: ");
                        int i1 = scanner.nextInt();
                        System.out.print("Andra index: ");
                        int i2 = scanner.nextInt();
                        int temp = array[i1];
                        array[i1] = array[i2];
                        array[i2] = temp;
                        System.out.println("Bytte plats på " + i1 + " och " + i2);
                    } catch (InputMismatchException e) {
                        System.out.println("Fel: Du måste ange ett heltal.");
                        scanner.nextLine();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Fel: Index utanför arrayens storlek!");
                    }
                }
                case 4 -> {
                    System.out.println("Avslutar programmet.");
                    kör = false;
                }
                default -> System.out.println("Felaktigt menyval!");
            }
        }
        scanner.close();
    }
}
