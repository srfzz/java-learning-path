class ArrayDescending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // // Sort the array in descending order
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         if (arr[j] < arr[j + 1]) {
        //             // Swap arr[j] and arr[j+1]
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }

        // // Print the sorted array
        // System.out.println("Array in descending order:");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}