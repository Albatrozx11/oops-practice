import java.util.*;
class BinarySearch {
    int[] arr = new int[10];
    int  mid,high,target;
    int low=0;
    int binarySearch(int arr[], int target, int n) {
        high = n - 1;
        int flag = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                flag = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return flag;
    }
    
}

class BinDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n.o elements:");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+i+":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element:");
        Scanner sc1 = new Scanner(System.in);
        int target = sc1.nextInt();
        BinarySearch bs = new BinarySearch();
        int result = bs.binarySearch(arr, target,n);
        if(result==-1){
            System.out.print("Element not found");
        }else{
            System.out.print("Element found at index "+result);
        }
    }
}

