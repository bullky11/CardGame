package gondolatolvasokartyatrukk;

import java.util.Scanner;

public class GondolatOlvasoKartyatrukk {

    static Scanner sc = new Scanner(System.in);
    static String[] pakli = new String[22];
    
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            kirak();
            melyik();
            kever();
        }
        ezVolt();
    }

    private static void kirak() {
        for (int i = 1; i < pakli.length; i++) {
            pakli[i] = "Lap_" + i;
        }
        
        for (int i = 1; i < pakli.length; i++) {
            System.out.print(pakli[i] + " ");
            if(i % 3 == 0){
                System.out.println("");
            }
        }
    }

    private static void melyik() {
        System.out.print("melyik oszlop (1-3): ");
        int oszlop = Integer.parseInt(sc.nextLine());
    }

    private static void kever() {
        //a választott oszlop középre kerüljön
    }

    private static void ezVolt() {
        System.out.println("A gondolt lap: " + pakli[11]);
    }
    
}
