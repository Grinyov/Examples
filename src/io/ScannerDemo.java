package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 *
 * разбор текстового файла
 */
public class ScannerDemo {
    public static void main(String[ ] args) {
        String filename = "text\\scan.txt";
        Scanner scan = null;
        try {
            FileReader fr = new FileReader(filename);
            scan = new Scanner(fr);
// чтение из файла
            while (scan.hasNext()) {
                if (scan.hasNextInt()) {
                    System.out.println(scan.nextInt() + " :int");
                } else if (scan.hasNextBoolean()) {
                    System.out.println(scan.nextBoolean() + " :boolean");
                } else if (scan.hasNextDouble()) {
                    System.out.println(scan.nextDouble() + " :double");
                } else {
                    System.out.println(scan.next() + " :String");
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
