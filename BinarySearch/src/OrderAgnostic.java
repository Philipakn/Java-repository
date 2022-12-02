public class OrderAgnostic {

    int start;
    int end;
    int mid;
    boolean type;

    public void BinSearch(int[] input, int target) {

        start = 0;
        end = input.length - 1;
        mid = start + ((end - start) / 2);

        if (input[start] < input[end]) {

            type = true;
        } else {

            type = false;
        }

        while (start <= end) {

            if (type) {

                if (target < input[mid]) {

                    end = mid - 1;
                    mid = start + ((end - start) / 2);
                }

            } else {

                if (target > input[mid]) {

                    start = mid + 1;
                    mid = start + ((end - start) / 2);
                }
            }

            if (target == input[mid]) {

                System.out.println("Value found at position: " + mid);
                break;
            }
        }
    }
}
