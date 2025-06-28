package Heap;

public class Heap {

    private final int[] heap;
    private int size;
    private final int maxSize;

    public Heap(int maxSize){
        this.maxSize = maxSize+1;
        this.size = 0;
        this.heap = new int[maxSize];
        heap[size] = -1;
    }

    public void insert(int value) {
        if (size == maxSize) {
            System.out.println("Heap is full");
            return;
        }
        size++;
        heap[size] = value;
        int i = size;
        while(i>1){
            int parent = i/2;
            if(heap[parent] < heap[i]){
                int temp = heap[parent];
                heap[parent] = heap[i];
                heap[i] = temp;
                i = parent;
            } else {
                break;
            }
        }
    }
    public  void delete(){
        if(size == 1){
            System.out.println("Heap is empty");
            return;
        }
        heap[1] = heap[size];
        size--;
        int i=1;
        while(i<size){
            int left = 2*i;
            int right = 2*i+1;
            if(left<=size && heap[left] >heap[i]){
                int temp = heap[left];
                heap[left] = heap[i];
                heap[i] = temp;
                i = left;
            } else if(right<=size && heap[right] >heap[i]){
                int temp = heap[right];
                heap[right] = heap[i];
                heap[i] = temp;
                i = right;
            } else {
                break;
            }
        }
    }
    public void heapify(int [] arr,int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,n,largest);
        }
    }
    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

}
