package pertemuantuju;

import  java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("===== MENU MAKANAN =====");
        System.out.println("1. AYAM GORENG");
        
        System.out.println("PILIH MENU: ");
        int pilihan = input.nextInt();
        input.nextInt();

        if (pilihan == 1){
            System.out.println("PILIH RASA");
            String rasa = input.nextInt();

            System.out.println("Kamu pilih menu dengan rasa pedas" + rasa);

        }else {
             System.out.println("Tdiak ada di menu");
             sc.close();
        }
    }
}
