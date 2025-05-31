import java.util.*;

public class SelectionSort {
    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void Selection_Sort(int[] a, int n)
    {
        for(int i = 0; i <= n-2; i++)
        {
            int min = i;
            for(int j = i+1; j <= n-1; j++)
            {
                if(a[j] < a[min]) min = j;
            }
            swap(a,i,min);
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
        Selection_Sort(a,n);
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }
}
