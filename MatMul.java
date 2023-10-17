import java.util.*;
class MatMul
{
	public static void main(String args[])
	{
		System.out.print("Enter n.o of rows and columns of A:");
		Scanner sc= new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.print("Enter n.o of rows and columns of B:");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int A[][] = new int[r1][c1];
		int B[][] = new int[r2][c2];
		int C[][] = new int[r1][c2];
		if(c1!=r2){
			System.out.println("Multiplication not possible");
		}else{
		
		
		System.out.println("Enter first matrix: ");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				System.out.print("Enter element A["+i+"]["+j+"]: ");
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter second matrix: ");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				System.out.print("Enter element B["+i+"]["+j+"]: ");
				B[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				for(int k = 0;k<c1;k++){
					C[i][j] += A[i][k]*B[k][j];
				}

			}
		}
		System.out.println("Resultant matrix C is:");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				System.out.print(C[i][j]+"\t");
			}
			System.out.println("");
		}
		}
	}
}
