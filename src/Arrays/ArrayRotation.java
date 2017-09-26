package Arrays;

public class ArrayRotation {


    // Shifting For Loop
    void leftRotate(int arr[],int d,int n){
        int i;
        for (i=0;i<d;i++){
          leftRotateByOne(arr,n);
        }
    }

    // Left Rotate By One
    void leftRotateByOne(int arr[],int n){

        int i,temp;
        temp=arr[0];
        for (i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
    }

    // Printing Array
    void printArray(int arr[],int size){

        for (int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }

    }

    // Main function
    public static void main(String[] args){


        ArrayRotation arrayRotation=new ArrayRotation();
        int arr[]={1,2,3,4,5,6,7,8};
        arrayRotation.leftRotate(arr,2,8);

        arrayRotation.printArray(arr,8);

    }


}
