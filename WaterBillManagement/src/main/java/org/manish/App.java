package org.manish;

import java.io.*;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws IOException {
        int guest = 0;
        int BHK =2;
        int r1 = 3, r2 = 7;
        File file = new File(args[0]);
        FileReader fr = new FileReader(file);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine())
        {
            String instructions = scanner.nextLine();
            if (instructions.contains("ALLOT_WATER")){
                BHK = Integer.parseInt(instructions.substring(12, 13));
                r1 = Integer.parseInt(instructions.substring(14, 15));
                r2 =Integer.parseInt(instructions.substring(16));
            }else if (instructions.contains("ADD_GUESTS")){
               guest = guest + Integer.parseInt(instructions.substring(11));
            }else if(instructions.contains("BILL")){
                break;
            }
        }
        Consumer consumer = new Consumer(BHK,r1,r2, guest);
        System.out.println(consumer.getLitre() +" " + consumer.getAmount());
    }
}
