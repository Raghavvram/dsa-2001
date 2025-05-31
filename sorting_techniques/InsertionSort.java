import java.util.*;

public class InsertionSort {
    public static void Insertion_Sort(int[] a, int n)
    {
        for(int i = 1; i < n; i++)
        {
            int key = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > key)
            {
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array: " + Arrays.toString(a));
        Insertion_Sort(a,n);
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }
}
