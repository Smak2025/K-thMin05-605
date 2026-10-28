void main() {
    int[] a = new int[]{-2, -2, -2, -5, 7, 8, 1, 2};
    // {-5, -2, -2, -2, 1, 2, 7, 8}
    var iArr = new IntArray(a);
    var s = new Selection(iArr);
    System.out.println(s.getKthMinPosition(3));
}