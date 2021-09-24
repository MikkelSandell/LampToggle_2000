package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gentag = true;
        Lampe Lampe1 = new Lampe("Lampe1");
        Lampe Lampe2 = new Lampe("Lampe2");
        Lampe Lampe3 = new Lampe("Lampe3");
        Lampe Lampe4 = new Lampe("Lampe4");
        Lampe Lampe5 = new Lampe("Lampe5");
        Lampe selectedLampe = null;
        System.out.println("der er "+ Lampe1.getCount() + " Lamper");

        while (gentag){
            System.out.println(" ");
            System.out.println(Lampe1);
            System.out.println(Lampe2);
            System.out.println(Lampe3);
            System.out.println(Lampe4);
            System.out.println(Lampe5);
            System.out.println(" ");
            System.out.print("Du kan ændre Lampernes tilstand med at vælge en tal imellem 1-" + Lampe1.getCount() +
                    " andre tal stopper programmet: ");

            int select = scanner.nextInt();
            if (select ==1){
                selectedLampe = Lampe1;
            } else if (select==2){
                selectedLampe = Lampe2;
            }else if (select==3){
                selectedLampe = Lampe3;
            }else if (select==4){
                selectedLampe = Lampe4;
            }else if (select==5){
                selectedLampe = Lampe5;
            }else {
                gentag=false;
            }
            selectedLampe.trykPåKontakt();

        }

    }
}
