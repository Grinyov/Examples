package decomposition;

/**
 * Created by green on 18.07.2015.
 */
public class Matrix {
    private int[ ][ ] a;
    public Matrix(int n, int m) throws MatrixException {
// проверка на отрицательные значения размерности матрицы
        if ((n < 1) || (m < 1)) {
            throw new MatrixException();
        }
        a = new int[n][m];
    }
    public int getVerticalSize() {
        return a.length;
    }
    public int getHorizontalSize() {
        return a[0].length;
    }
    public int getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) { // проверка i и j
            return a[i][j];
        }
        throw new MatrixException();
    }
    public void setElement(int i, int j, int value) throws MatrixException {
        if (checkRange(i, j)) { // проверка i и j
            a[i][j] = value;
        }
        throw new MatrixException();
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nMatrix : " + a.length + "x" + a[0].length + "\n");
        for (int [ ] row : a) {
            for (int value : row) {
                s.append(value + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
    /*
    В классе Matrix объявлен private-метод checkRange(int i, int j) для проверки
параметров на предельные допустимые значения во избежание невынужденных
    ошибок. Однако условный оператор if в этом методе выглядит запутанным,
во?первых, нарушая правило положительного сценария, то есть разумно ожи-
дать, что параметры метода с индексами элемента матрицы будут корректными,
и, исходя из этого, строить условие, а в представленном варианте все наоборот;
во?вторых, при значении true в условии оператора метод возвращает значение
false, что выглядит противоречивым.
Метод следует переписать в виде
 private boolean checkRange(int i, int j) {
        if ( i >= 0 && i < a.length && j >= 0 && j < a[0].length ) {
            return true;
        } else {
            return false;
        }
    }
    заменив условие в операторе на противоположное и возвращая непротиворечащее
результате значение.

// !!! Старая версия метода
    // проверка возможности выхода за пределы матрицы
    private boolean checkRange(int i, int j) {
        if ( i < 0 || i > a.length - 1 || j < 0 || j > a[0].length - 1) {
            return false;
        } else {
            return true;
        }
    }
    */
    // проверка возможности выхода за пределы матрицы
    private boolean checkRange(int i, int j) {
        if ( i >= 0 && i < a.length && j >= 0 && j < a[0].length ) {
            return true;
        } else {
            return false;
        }
    }
}

