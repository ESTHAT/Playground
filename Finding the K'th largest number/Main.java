import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <= n - 1; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        selection_sort(n, arr);
        System.out.println(arr[n-k]);
    }
    public static void selection_sort(int n, int arr[]){
        for(int i = 0; i <= n - 2;i++)
        {
            int min_idx = find_minimun_idx(i, arr, n-1);
            swap(i, min_idx, arr);
        }
    }
     public static void swap(int start_i, int min_i, int arr[]){
         int temp = arr[start_i];
         arr[start_i] = arr[min_i];
         arr[min_i] = temp;
     }
     public static int find_minimun_idx(int start_i, int arr[], int end_i){
         int min_i = 0;
         if(arr[start_i] < arr[start_i + 1])
         {
             min_i = start_i;
         }
         else{
             min_i = start_i+ 1;
         }
         for(int i = start_i + 2; i <= end_i; i++){
             if(arr[min_i] > arr[i])
             {
                 min_i = i;
             }
         }
         return min_i;
     }
}