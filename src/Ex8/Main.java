package Ex8;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Sortable s = new Sortable() {
            @Override
            public void sort(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] > arr[j]) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
        };
        s.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        int[] arr2 = {5, 4, 3, 2, 1};
        Sortable s2 = new QuickSort();
        s2.sort(arr2);
        for (int i : arr2) {
            System.out.println(i);
        }

        int[] arr3 = {5, 4, 3, 2, 1};
        Sortable s3 = new BubbleSort();
        s3.sort(arr3);
        for (int i : arr3) {
            System.out.println(i);
        }
    }
}
