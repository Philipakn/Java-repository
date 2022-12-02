public class Main {

    public static void main(String[] args) {

        normalBinary obj = new normalBinary();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24};
        obj.BinSearch(arr, 12);

        OrderAgnostic obj2 = new OrderAgnostic();
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24};
        obj.BinSearch(arr, 12);
    }

}
