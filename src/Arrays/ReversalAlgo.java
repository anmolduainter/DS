package Arrays;

// Reversal Algo for Array Rotation

public class ReversalAlgo {

    // Left Rotate
    static void LftRotate(int arr[],int d){

        int n=arr.length;

        Reverse(arr,0,d-1);

        Reverse(arr,d,n-1);

        Reverse(arr,0,n-1);


    }


    // Reverse is done here
    static void Reverse(int arr[],int start,int end){

        int temp;

        while(start<end){

            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }

    }

    // Printing Array
    static void PrintArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args){

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        LftRotate(arr, 2); // Rotate array by 2
        PrintArray(arr);

    }

}
