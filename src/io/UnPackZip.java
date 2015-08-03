package io;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 */
public class UnPackZip {
    private File destFile;
    // размер буфера для распаковки
    public final int BUFFER = 2_048;
    public void unpack(String destinationDirectory, String nameZip) {
        File sourceJarFile = new File(nameZip);
        try (ZipFile zFile = new ZipFile(sourceJarFile)) {
            File unzipDir = new File(destinationDirectory);
// открытие jar-архива для распаковки
            Enumeration<? extends ZipEntry> zipFileEntries = zFile.entries();
            while (zipFileEntries.hasMoreElements()) {
// извлечение текущей записи из архива
                ZipEntry entry = zipFileEntries.nextElement();
                String entryname = entry.getName();
                System.out.println("Extracting: " + entry);
                destFile = new File(unzipDir, entryname);
// определение каталога
                File destinationParent = destFile.getParentFile();
// создание структуры каталогов
                destinationParent.mkdirs();
// распаковывание записи, если она не каталог
                if (!entry.isDirectory()) {
                    writeFile(zFile, entry);
                }
            }
        } catch (IOException e) {
        }
    }
    private void writeFile(ZipFile jFile, ZipEntry entry) {
        int currentByte;
        byte data[] = new byte[BUFFER];
        try (BufferedInputStream is = new BufferedInputStream(jFile.getInputStream(entry));
             FileOutputStream fos = new FileOutputStream(destFile);
             BufferedOutputStream dest = new BufferedOutputStream(fos,BUFFER)) {
// запись файла на диск
            while ((currentByte = is.read(data, 0, BUFFER)) > 0) {
                dest.write(data, 0, currentByte);
            }
            dest.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
