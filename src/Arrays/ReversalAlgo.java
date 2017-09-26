package Arrays;

// Reversal Algo for Array Rotation

public class ReversalAlgo {

    // Left Rotate
    static void LftRotate(int arr[],int d){

        int n=arr.length;



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

    }

}
