package io;

import java.io.FileNotFoundException;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 */
public class PackDemo {
    public static void main(String[] args) {
        String dirName = "путь_к_директории";
        PackJar pj = new PackJar("example.jar");
        PackZip pz = new PackZip("example.zip");
        try {
            pj.pack(dirName);
            pz.pack(dirName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
