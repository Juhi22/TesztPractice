import java.util.ArrayList;
import java.util.List;

public class feladat1 {

    public int sum(int a, int b) {
        return a+b;
    }

    public boolean lessThanTen(int a) {
        if ( a > 0 && a < 10 ) {
            return true;
        } else {
            return false;
        }
    }

    private int[] array1 = {1, 2, 3};
    private int[] array2 = {1, 2, 3};
    private List<String> list = new ArrayList<>(List.of("hello", "world"));

    public int[] getArray1() {
        return array1;
    }

    public int[] getArray2() {
        return array2;
    }

    public List<String> getList() {
        return list;
    }
}