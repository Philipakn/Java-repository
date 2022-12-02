public class normalBinary {

    int start;
    int end;
    int mid;

    public void BinSearch(int[] input, int target) {
        start = 0;
        end = input.length - 1;
        mid = start + ((end - start) / 2);

        while (start <= end) {

            if (target < input[mid]) {

                end = mid - 1;
                mid = start + ((end - start) / 2);

            } else if (target > input[mid]) {

                start = mid + 1;
                mid = start + ((end - start) / 2);

            } else if (target == input[mid]) {

                System.out.println("Value found at position: " + mid);
                break;
            }
        }
    }
}