package io;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 */
public class PackZip {
    private String jarFileName;
    public final int BUFFER = 2_048;
    public PackZip(String jarFileName) {
        this.jarFileName = jarFileName;
    }
    public void pack(String dirName) throws FileNotFoundException {
// получение списка имен файлов в директории
        File dir = new File(dirName);
        if (!dir.exists() || !dir.isDirectory()) {
            throw new FileNotFoundException(dir + " not found");
        }
        File[] files = dir.listFiles();
        ArrayList<String> listFilesToZip = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            if (!files[i].isDirectory()) {
                listFilesToZip.add(files[i].getPath());
            }
        }
        String[] temp = {};
        String[] filesToZip = listFilesToZip.toArray(temp);
// собственно архивирование
        try (FileOutputStream fos = new FileOutputStream(jarFileName);
             ZipOutputStream zos = new ZipOutputStream(fos)) {
            byte[] buffer = new byte[BUFFER];
// метод сжатия
            zos.setLevel(Deflater.DEFAULT_COMPRESSION);
            for (int i = 0; i < filesToZip.length; i++) {
                zos.putNextEntry(new ZipEntry(filesToZip[i]));
                try (FileInputStream in = new FileInputStream(filesToZip[i])) {
                    int len;
                    while ((len = in.read(buffer)) > 0) {
                        zos.write(buffer, 0, len);
                    }
                    zos.closeEntry();
                } catch (FileNotFoundException e) {
                    System.err.println("Файл не найден" + e);
                }
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e + "Некорректный аргумент" + e);
        } catch (IOException e) {
            System.err.println("Ошибка доступа" + e);
        }
    }
}
