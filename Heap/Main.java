package Heap;

public class Main {
    public static  void heapSort(int[] arr){
        Heap h = new Heap(arr.length);
        int n = arr.length;
        for(int i=n/2-1; i>=0; i--){
            h.heapify(arr, n, i);
        }
        // time complexity of above loop and headify is O(n) why
        // because heapify is O(log n) and we are calling it n/2 times
        // so O(n/2 * log n) = O(n log n)
        // but we can say that heapify is O(n) because it is called n/2 times
        // and each time it takes O(log n) time
        // so O(n/2 * log n) = O(n)
        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            h.heapify(arr, i, 0);
        }
        // time complexity of above loop is O(n log n)
        // because we are calling heapify n times and each time it takes O(log n) time
    }
    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.insert(5);
        heap.insert(10);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);

        System.out.println("Heap elements:");
        heap.printHeap();
        //output of this program should be:
        //Heap elements:
        //10 8 3 5 1

        heap.delete();
        System.out.println("Heap after deletion:");
        heap.printHeap();
        //output of this program should be:
        //Heap after deletion:
        //8 5 3 1

        int [] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        for(int i=n/2-1; i>=0; i--){
            heap.heapify(arr, n, i);
        }
        System.out.println("Heapified array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        //output of this program should be:
        //Heapified array:
        //13 11 12 5 6 7
        int [] arr1 = {12, 11, 13, 5, 6, 9};
        heapSort(arr1);
        System.out.println("Sorted array:");
        for (int j : arr1) {
            System.out.print(j + " ");
        }
        //output of this program should be:
        //Sorted array:
        //5 6 7 11 12 13

    }

}
