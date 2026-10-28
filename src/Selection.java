import java.util.concurrent.ThreadLocalRandom;

public class Selection {
    private IntArray arr;
    private IntArray arrCopy;
    public Selection(IntArray a){
        arr = a.copy();
        arrCopy = a.copy();
    }

    public int getKthMinPosition(int k){
        if (arr == null || arr.length() == 0) return -1;
        if (arr.length() < k) return -1;
        quickSort(0, arr.length() - 1);
        int len = arrCopy.length();
        for (int i = 0; i < len; i++) {
            if (arrCopy.get(i) == arr.get(k-1)){
                return i;
            }
        }
        return -1;
    }

    public int get(int index){
        return arr.get(index);
    }

    private void quickSort(int low, int high) {
        if (low >= high) return;
        var pivot = arr.get(ThreadLocalRandom.current().nextInt(low, high + 1));
        var lt = low;
        var gt = high;
        var i = low;
        while (i <= gt) {
            if (arr.get(i) < pivot) {
                swap(i, lt);
                i++;
                lt++;
            } else if (arr.get(i) > pivot) {
                swap(i, gt);
                gt--;
            } else {
                i++;
            }
        }
        quickSort(low, lt - 1);
        quickSort(gt + 1, high);
    }

    private void swap(int i, int j) {
        var t = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, t);
    }
}