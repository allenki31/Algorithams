package com.app;
class Selectionsort
{
    void sort(int arr[])
    {
        int n = arr.length;
 
        
        for (int i = 0; i < n-1; i++)
        {
            
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
          
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
    
    void print(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    
    public static void main(String args[])
    {
        Selectionsort ob = new Selectionsort();
        int arr[] = {25,20,12,39,86,56};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.print(arr);
    }
}
