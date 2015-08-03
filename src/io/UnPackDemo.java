package io;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 */
public class UnPackDemo {
    public static void main(String[] args) {
// расположение и имя архива
        String nameJar = "example.jar";
        String nameZip = "example.zip";
// куда файлы будут распакованы
        String destinationPath = "c:\\temp\\";
        new UnPackZip().unpack(destinationPath, nameZip);
    }
}
