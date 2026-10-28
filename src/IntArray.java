import java.util.Arrays;
import java.util.Random;

public class IntArray {
    private int[] array;

    public int get(int index){
        return array[index];
    }

    public void set(int index, int value){
        array[index] = value;
    }

    public int length(){
        return array.length;
    }

    public IntArray(int length){
        array = new int[length];
        fillRandom();
    }

    public IntArray(int[] arr){
        array = Arrays.copyOf(arr, arr.length);
    }

    public IntArray copy(){
        var newArr = new IntArray(length());
        newArr.array = Arrays.copyOf(array, length());
        return newArr;
    }

    private void fillRandom(){
        var r = new Random(0);
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-10, 11);
        }
    }

    public String toString() {
        return Arrays.toString(array);
    }
}
