package Arrays;

public class JugglingAlgorithm {

    // left Rotate
    void leftRotate(int arr[],int d,int n){

        int i,j,k,temp;
        for (i=0;i<gcd(n,d);i++){
            temp=arr[i];
            j=i;
            while (true){
                k=j+d;
                if (k>=n){
                    k=k-n;
                }
                if (k==i){
                    break;
                }

                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }

    }


    // Method To find GCD
    int gcd(int a,int b){
        if (b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }

    void PrintArray(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args){

        JugglingAlgorithm jugglingAlgorithm=new JugglingAlgorithm();

        int arr[]={1,2,3,4,5,6,7,8,9};

        jugglingAlgorithm.leftRotate(arr,3,9);

        jugglingAlgorithm.PrintArray(arr,9);

    }

}
