import java.util.*;
class MatAdd
{
	public static void main(String args[])
	{
		System.out.print("Enter n.o of rows and columns:");
		Scanner sc= new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int A[][] = new int[r][c];
		int B[][] = new int[r][c];
		int C[][] = new int[r][c];
		System.out.println("Enter first matrix: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("Enter element A["+i+"]["+j+"]: ");
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter second matrix: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("Enter element B["+i+"]["+j+"]: ");
				B[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				C[i][j] = A[i][j]+B[i][j];
			}
		}
		System.out.println("Addition matrix C is:");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(C[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
