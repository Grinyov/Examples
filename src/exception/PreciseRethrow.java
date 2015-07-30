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
 * � ������ Java 7 ��������� ����������� ���������� ��� ���������� ��-
 �������� � ����, ��������� ��� ���������� �������� �|�.
 try {
 // some operations
 } catch(NumberFormatException | ClassNotFoundException | InstantiationException e) {
 e.printStackTrace();
 }
 ����� ������ ��������� ���������� �� ������������ ����.
 ������� ������� ����� ������ ���������� ���������� (more precise rethrow).
 ��� ������� ��������� � ������, ���� ��������� ����������� �����-
 ����� �� ����������������� � ������ � ������ ���� �������� �����������
 ������ ����� ������.
 */
public class PreciseRethrow {

    //�� �������� ����� ������� ��� �������� ���:
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
More precise rethrow ��������� �������� � ������������ ���������� catch
����� ����� ����������, ��� ����� ���� ������������ � ���������� try,
� ����������� ���������� �������������� ���������� ��� ��� �������� � ��-
�������� �����.
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
        } catch (final Exception e) { // final � ������������
            throw e; // more precise rethrow
        } finally {
            if(buff != null) {
                buff.close();
            }
        }
        return numFr;
    }
}
