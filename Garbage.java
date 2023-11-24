import java.util.*;
class x{
    int y;
}
class Garbage{
    public static void main(String args[]){
        Runtime r = Runtime.getRuntime();
        System.out.println("total memory: "+r.totalMemory());
        long mem1,mem2,mem3;
        mem1 = r.freeMemory();
        System.out.println("Free memory: " + mem1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int z = sc.nextInt();
        int arr[];
        arr = new int[z];
        for(int i=0;i<10;i++){
            x y = new x();
        }
        Runtime g = g.getRuntime();
        mem2= g.freeMemory();
        System.out.println("Free memory: " + mem2);
        r.gc();
        mem3 = r.freeMemory();
        System.out.println("Free memory after gc: " + mem3);
    }
}