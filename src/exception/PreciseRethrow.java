package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by green on 31.07.2015.
 *
 * В версии Java 7 появилась возможность объединить все идентичные ин-
 струкции в одну, используя для разделения оператор «|».
 try {
 // some operations
 } catch(NumberFormatException | ClassNotFoundException | InstantiationException e) {
 e.printStackTrace();
 }
 Такая запись позволяет избавиться от дублирования кода.
 Введено понятие более точной переброски исключений (more precise rethrow).
 Это решение применимо в случае, если обработка возникающих исклю-
 чений не предусматривается в методе и должна быть передана вызывающему
 данный метод методу.
 */
public class PreciseRethrow {

    //До введения этого понятия код выглядел так:
    public double parseFromFileBefore(String filename)
            throws FileNotFoundException, ParseException, IOException {
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        double numFr = 0;
        BufferedReader buff = null;
        try {
            FileReader fr = new FileReader(filename);
            buff = new BufferedReader(fr);
            String number = buff.readLine();
            numFr = nfFr.parse(number).doubleValue();
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        } catch (ParseException e) {
            throw e;
        } finally {
            if(buff != null) {
                buff.close();
            }
        }
        return numFr;
    }

/*
More precise rethrow разрешает записать в единственную инструкцию catch
более общее исключение, чем может быть генерировано в инструкции try,
с последующей генерацией перехваченного исключения для его передачи в вы-
зывающий метод.
 */

    public double parseFromFile(String filename)
            throws FileNotFoundException, ParseException, IOException {
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        double numFr = 0;
        BufferedReader buff = null;
        try {
            FileReader fr = new FileReader(filename);
            buff = new BufferedReader(fr);
            String number = buff.readLine();
            numFr = nfFr.parse(number).doubleValue();
        } catch (final Exception e) { // final — необязателен
            throw e; // more precise rethrow
        } finally {
            if(buff != null) {
                buff.close();
            }
        }
        return numFr;
    }
}
