package Flowers;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Rose rose1 = new Rose(7);
        Tulip tulip1 = new Tulip(5);
        Chamomile chamomile1 = new Chamomile(8);
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlower(rose1);
        bucket.addFlower(tulip1);
        bucket.addFlower(chamomile1);
        System.out.println("Want to try our bucket or to create yours?" +
                "Print 'default' or 'own'");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if (choice.equals("default")){
            System.out.println("Thanks!");
            System.out.print("You have to pay:");
            System.out.print(bucket.getPrice());
        }
        if (choice.equals("own")){
            FlowerBucket myBucket = new FlowerBucket();

            System.out.println("Which flowers do you need? Print flower name");
            Scanner scan1 = new Scanner(System.in);
            String choice1 = scan.nextLine();
            if (choice1.equals("rose")){
                System.out.println("How much Roses do you need? Print a number.");
                Scanner scan11 = new Scanner(System.in);
                int choice11 = scan.nextInt();
                Rose rose = new Rose(choice11);
                myBucket.addFlower(rose);
            }

            if (choice1.equals("chamomile")){
                System.out.println("How much Chamomiles do you need? Print a number.");
                Scanner scanCh = new Scanner(System.in);
                int choiceCh = scan.nextInt();
                Chamomile chamomile = new Chamomile(choiceCh);
                myBucket.addFlower(chamomile);
            }

            if (choice1.equals("tulip")){
                System.out.println("How much Tulips do you need? Print a number.");
                Scanner scanTu = new Scanner(System.in);
                int choiceTu = scan.nextInt();
                Tulip tulip = new Tulip(choiceTu);
                myBucket.addFlower(tulip);
            }

            System.out.println("Thanks!");
            System.out.print("Please, pay: ");
            System.out.print(myBucket.getPrice());
        }

    }
}
