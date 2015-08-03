package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 */
public class DemoReader {
    public static void main(String[ ] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("data\\res.txt"));
            String tmp = "";
            while ((tmp = br.readLine()) != null) {
                // пробел использовать как разделитель
                String[] s = tmp.split("\\s");
// вывод полученных строк
                for (String res : s) {
                    System.out.println(res);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
