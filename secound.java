import java.lang.*;
//import java.util.Arrays;
public class secound{
    static final int M=3;
    static final int N=3;
    static void transpose(int A[][],int B[][])
    {
        int i,j;
        for(i=0;i<N;i++)
        {
            for( j=0;j < M;j++)
            {
                B[i][j] = A[j][i];
            }
        }
    } 
    public static void main(String[] args){
    
       int  A[][]={
                     {1,2,3},
                     {4,5,6},
                     {7,8,9}};
       int [][] B= new int[N][M],i,j;
      transpose(A, B);
      System.out.print("Result matrix is \n");
      for (int k = 0; k < N; k++) {
          for (int l = 0; l < M; l++)
              {
                System.out.print(B[k][l] +" ");
               
              }
              System.out.print("\n");
      }
    }
}