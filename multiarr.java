
// heres how to take input and print an array
// import java.util.*;
// public class multiarr
// {
//     public static void main(String args[])
//     {

//         // int [] [] arr={{1,2,3},{1,2,3},{1,2,3}};
//         Scanner ab=new Scanner(System.in);
//         int r,c;
//         System.out.println("ENTER NUMBER OF ROWS");
//         r=ab.nextInt();
//         System.out.println("ENTER NUMBER OF COLUMNS");
//         c=ab.nextInt();
//         int[][]arr=new int[r][c];
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 System.out.print("element for arr["+i+"]"+"["+j+"]");
//                 arr[i][j]=ab.nextInt();
//             }
            
//         }
        
//         printarr(arr);
//     }
//     static void printarr(int[][]arr){
//         for (int i = 0; i < arr.length; i++) {{
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j]+" ");
                
//             }
//             System.out.println();
//         }
            
//         }
//     }
// }

// Addition of matrix
// import java.util.*;
// public class multiarr
// {
//     public static void main(String args[])
//     {

//         // int [] [] arr={{1,2,3},{1,2,3},{1,2,3}};
//         Scanner ab=new Scanner(System.in);
//         int r,c;
//         System.out.println("ENTER NUMBER OF ROWS");
//         r=ab.nextInt();
//         System.out.println("ENTER NUMBER OF COLUMNS");
//         c=ab.nextInt();
//         int[][]arr=new int[r][c];
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 System.out.print("element for arr["+i+"]"+"["+j+"]");
//                 arr[i][j]=ab.nextInt();
//             }
            
//         }
//         System.out.println("first array");
//         printarr(arr);
//         int r2,c2;
//         System.out.println("ENTER NUMBER OF ROWS");
//         r2=ab.nextInt();
//         System.out.println("ENTER NUMBER OF COLUMNS");
//         c2=ab.nextInt();
//         int[][]arr2=new int[r][c];
//         for (int i = 0; i < r2; i++) {
//             for (int j = 0; j < c2; j++) {
//                 System.out.print("element for arr["+i+"]"+"["+j+"]");
//                 arr2[i][j]=ab.nextInt();
//             }
            
//         }
//         System.out.println("second array");
//         printarr(arr);
//         System.out.println("ADDED ARRAY");
//         add(arr, r, c, arr2, r, c);
       
//     }
//     static void printarr(int[][]arr){
//         for (int i = 0; i < arr.length; i++) {{
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j]+" ");
                
//             }
//             System.out.println();
//         }
            
//         }
//     }
//     static void add(int[][]arr1,int row1,int col1,int[][]arr2,int row2,int col2){
//         int[][]ans=new int[row1][col1];
//         if(row1!=row2||col1!=col2){
//             System.out.println("error");
//             return;
//         }
//         for (int i = 0; i < arr1.length; i++) {
//             for (int j = 0; j < arr1[i].length; j++) {
                
//                 ans[i][j]=arr1[i][j]+arr2[i][j];
//             }
            
//         }
//         printarr(ans);
//     }
// } 


// Multiplication array 
// import java.util.*;
// public class multiarr{
//     public static void main (String args[]){
//         Scanner ab=new Scanner(System.in);
//         int i,j,row1,col1,row2,col2;
//         System.out.println("Enter row 1");
//         row1=ab.nextInt();
//         System.out.println("Enter col 1");
//         col1=ab.nextInt();
//         System.out.println("Enter row 2");
//         row2=ab.nextInt();
//         System.out.println("Enter col 2");
//         col2=ab.nextInt();
//         int [][]arr1=new int[row1][col1];
//         int [][]arr2=new int[row2][col2];
//         int [][]ans=new int[row1][col2];
//          for(i=0;i<row1;i++){
//             for (j = 0; j < col1; j++) {
//                 System.out.println("enter arr1["+i+"]"+"["+j+"]");
//                 arr1[i][j]=ab.nextInt();
                
//             }
//          }
//          System.out.println("ARRAY 1");
//          printarr(arr1, row1, col1);
         
//          for(i=0;i<row2;i++){
//             for (j = 0; j < col2; j++) {
//                 System.out.println("enter arr2["+i+"]"+"["+j+"]");
//                 arr2[i][j]=ab.nextInt();
                
//             }
//          }
//          System.out.println("ARRAY 2");
//          printarr(arr2, row2, col2);;
//          ans=multiarr(arr1, row1, col1, arr2, row2, col2);
//          System.out.println("ANS ARRAY ");
//          printarr(ans, row1, col2);;
         

//     }
//     static int [][] multiarr(int [][] arr1,int row1,int col1,int [][]arr2,int row2,int col2)
//     {
        
//       int[][]ans=new int [row1][col2];
//       for(int i=0;i<row1;i++){
//         for(int j=0;j<col2;j++){
//             for (int k = 0; k < row2; k++) {
//                 ans[i][j]+=arr1[i][k]*arr2[k][j];
                
//             }

//         }
//       }

//       return ans;   
    
    
// }
// static void printarr(int[][]arr,int row,int col){
//     for (int i = 0; i < row; i++) {
//         for (int j = 0; j < col; j++) {
//            System.out.print(arr[i][j]+" "); 
//         }
        
    
//     System.out.println();
//     }
// }
// }


// REVERSE ROW IN  AN ARRAY

// import java.util.*;
// public class multiarr
// {
//     public static void main(String args[])
//     {

        
//         Scanner ab=new Scanner(System.in);
//         int r,c;
//         System.out.println("ENTER NUMBER OF ROWS");
//         r=ab.nextInt();
//         System.out.println("ENTER NUMBER OF COLUMNS");
//         c=ab.nextInt();
//         int[][]arr=new int[r][c];
//         int[][]ans=new int[c][r];
  
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 System.out.print("element for arr["+i+"]"+"["+j+"]");
//                 arr[i][j]=ab.nextInt();
//             }
            
//         }
//         System.out.println("ARRAY");
        
//         printarr(arr);
        
//         System.out.println("ANSWER");
//         revrow(arr, r, c);
//     }
//     static void printarr(int[][]arr){
//         for (int i = 0; i < arr.length; i++) {{
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j]+" ");
                
//             }
//             System.out.println();
//         }
            
//         }
//     }
//     static void revrow(int [][]arr,int row,int col){
//         int start=0;
//         int end=col-1;
//         for (int i = 0; i < row; i++) {
//             start=0;
//             end=col-1;
//         while(start<end){
//         int temp=arr[start][i];
//         arr[i][start]=arr[i][end];
//         arr[i][end]=temp;
//         start++;
//         end--;
//     }
// }
//     printarr(arr);

//     }
   
    
// }


// //TRANSPOSE AN ARRAY

// import java.util.*;
// public class multiarr
// {
//     public static void main(String args[])
//     {

        
//         Scanner ab=new Scanner(System.in);
//         int r,c;
//         System.out.println("ENTER NUMBER OF ROWS");
//         r=ab.nextInt();
//         System.out.println("ENTER NUMBER OF COLUMNS");
//         c=ab.nextInt();
//         int[][]arr=new int[r][c];
//         int[][]ans=new int[c][r];
  
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 System.out.print("element for arr["+i+"]"+"["+j+"]");
//                 arr[i][j]=ab.nextInt();
//             }
            
//         }
        
//         printarr(arr);
//         ans=tranp(arr, r, c);
//         System.out.println("ANSWER");
//         printarr(ans);
//     }
//     static void printarr(int[][]arr){
//         for (int i = 0; i < arr.length; i++) {{
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j]+" ");
                
//             }
//             System.out.println();
//         }
            
//         }
//     }
//     static int[][] tranp(int[][]arr,int row,int col){
//         int [][] ans=new int[col][row];
//         for (int i = 0; i <row; i++) 
//             for(int j=0;j<col;j++){
//             ans[j][i]=arr[i][j];
        
            
//         }
//           return ans;  
        
//     }
    
// }
// TRANSPOSE AN SQUARE ARRAY IN PLACE

// import java.util.*;
// public class multiarr
// {
//     public static void main(String args[])
//     {

        
//         Scanner ab=new Scanner(System.in);
//         int r,c;
//         System.out.println("ENTER NUMBER OF ROWS");
//         r=ab.nextInt();
//         System.out.println("ENTER NUMBER OF COLUMNS");
//         c=ab.nextInt();
//         int[][]arr=new int[r][c];
//         int[][]ans=new int[c][r];
  
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 System.out.print("element for arr["+i+"]"+"["+j+"]");
//                 arr[i][j]=ab.nextInt();
//             }
            
//         }
        
//         printarr(arr);
//         tranp(arr, r, c);
//         System.out.println("ANSWER");
//         printarr(arr);
//     }
//     static void printarr(int[][]arr){
//         for (int i = 0; i < arr.length; i++) {{
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j]+" ");
                
//             }
//             System.out.println();
//         }
            
//         }
//     }
//     static void tranp(int[][]arr,int row,int col){
        
//         for (int i = 0; i <row; i++) 
//             for(int j=i;j<col;j++){
//             int temp=arr[i][j];
//             arr[i][j]=arr[j][i];
//             arr[j][i]=temp;

        
            
//         }
            
        
//     }
    
// }

// //ROTATE AN ARRAY BY 90 DEGREE

// import java.util.*;
// public class multiarr
// {
//     public static void main(String args[])
//     {

        
//         Scanner ab=new Scanner(System.in);
//         int r,c;
//         System.out.println("ENTER NUMBER OF ROWS");
//         r=ab.nextInt();
//         System.out.println("ENTER NUMBER OF COLUMNS");
//         c=ab.nextInt();
//         int[][]arr=new int[r][c];
//         int[][]ans=new int[c][r];
  
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 System.out.print("element for arr["+i+"]"+"["+j+"]");
//                 arr[i][j]=ab.nextInt();
//             }
            
//         }
        
//         printarr(arr);
//         tranp(arr, r, c);
       
//         reverse(arr, r, c);
//         System.out.println("ANSWER");
//         printarr(arr);
//     }
//     static void printarr(int[][]arr){
//         for (int i = 0; i < arr.length; i++) {{
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j]+" ");
                
//             }
//             System.out.println();
//         }
            
//         }
//     }
//     static void tranp(int[][]arr,int row,int col){
        
//         for (int i = 0; i <row; i++) 
//             for(int j=i;j<col;j++){
//             int temp=arr[i][j];
//             arr[i][j]=arr[j][i];
//             arr[j][i]=temp;

        
            
//         }
//     }
        
//         static void reverse(int[][]arr,int row,int col){
//             int start,end;
//             start=0;
//             end=col-1;
//             for (int i = 0; i < row; i++) {
//                 start=0;
//                 end=col-1;
//                 while(start<end){
//                     int temp=arr[i][end];
//                     arr[i][end]=arr[i][start];
//                     arr[i][start]=temp;
//                     start++;
//                     end--;

//                 }
                
//             }

//         }
            
        
//     }
/*
 * 1
 * 1    1
 * 1    2   1
 * 1    3   3   1
 * 1    4   6   4   1
 * 
 * PASCAL TRIANGLE
 */

/*import java.util.Scanner;

public class multiarr{
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.println("ENTER ROW");
        int row= ab.nextInt();
        int [][]ans=pascal(row);
        printarr(ans, row);
        
    }
    static void printarr(int[][] arr,int row){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int[][] pascal(int row){
        int[][] ans=new int[row][];
        for (int i = 0; i < row; i++) {
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for (int j = 1; j < i; j++) {
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
                
            }
 }
     return ans;
    }
}*/
// /*
//  * SPIRAL MATRIX
//  * INPUT-:
//  *  1   2   3    4
//     5   6   7    8
//     9   10  11   12  

// OUTPUT-:
// 1   2   3   4   8     12     11    10    9    5      6   7
//  */
// import java .util.*;
// public class multiarr{
//   public static void main(String[] args){
//     Scanner ab=new Scanner (System.in);
//     System.out.println("enter row");
//      int row=ab.nextInt();
//     System.out.println("enter col");
//     int col=ab.nextInt();
//     int [][] arr=new int[row][col];
//     for(int i=0;i<row;i++){
//       for(int j=0;j<col;j++){
//          System.out.print("arr["+i+"]["+j+"]");
//         arr[i][j]=ab.nextInt();

//       }
//     }
//    printarr(arr, row,col);
//     spiral(arr, row,col);
//   }
//   static void printarr(int[][] arr,int row,int col){
//     for(int i=0;i<row;i++){
//       for(int j=0;j<col;j++){
//         System.out.print(arr[i][j] +"   ");
//       }
//       System.out.println();
//     }
//   }
//   static void spiral(int[][] arr,int row,int col){
//       int leftcol =0;
//       int rightcol =col-1;
//       int toprow =0;
//       int bottomrow =row-1;
//       int noofelements = 0;
//     int [][]ans=new int[row][col];
//     while(noofelements<row*col){
//     // TOP ROW- left col to  right col
//       for(int i=leftcol;i<=rightcol&&noofelements<row*col;i++){
//         System.out.print(arr[toprow][i]+"   ");

//         noofelements++;
//       }
//        toprow++;


//     // RIGHT COL- top row to bottom row
//       for(int i=toprow;i<=bottomrow&&noofelements<row*col;i++){
//         System.out.print(arr[i][rightcol]+"     ");
//         noofelements++;
//       }
//       rightcol--;


//     // BOTTOM ROW- right col to left col
//       for(int i=rightcol;i>=leftcol&&noofelements<row*col;i--){
//         System.out.print(arr[bottomrow][i]+"    ");
//         noofelements++;

//       }
//        bottomrow--;

//     // LEFT COL- bottom row to top row
//       for(int i=bottomrow;i>=toprow&noofelements<row*col;i--){
//         System.out.print(arr[i][leftcol]+"      ");
//         noofelements++;
//       }
//       leftcol++;
//     }

//   }
// }


/*
 * Problem : Generate a n*n matrix filled with elements 1 to n^2 in spiral order code.
 * EXAMPLE
 * enter row
    3
    ANSWER  
    1 2 3
    8 9 4
    7 6 5
 */


// import java .util.*;
// public class multiarr{
//   public static void main(String[] args){
//     Scanner ab=new Scanner (System.in);
//     System.out.println("enter row");
//      int row=ab.nextInt();
   
   
//     int [][] ans= spiral(row);
//     printarr(ans, row);
//   }
//   static void printarr(int[][] arr,int row){
//     for(int i=0;i<row;i++){
//       for(int j=0;j<row;j++){
//         System.out.print(arr[i][j]+" ");
//       }
//       System.out.println();
//     }
//   }
//   static int[][] spiral(int row){
//       int leftcol =0;
//       int rightcol=row-1;
//       int toprow =0;
//       int bottomrow =row-1;
//       int curr= 1;
//     int [][]arr=new int[row][row];
//     while(curr<=row*row){
//     // TOP ROW- left col to  right col
//       for(int i=leftcol;i<=rightcol&&curr<=row*row;i++){
//       arr[toprow][i]=curr++;
        
//       }
//        toprow++;


//     // RIGHT COL- top row to bottom row
//       for(int i=toprow;i<=bottomrow&&curr<=row*row;i++){
//        arr[i][rightcol]=curr++;
        
//       }
//       rightcol--;


//     // BOTTOM ROW- right col to left col
//       for(int i=rightcol;i>=leftcol&&curr<=row*row;i--){
//         arr[bottomrow][i]=curr++;
        

//       }
//        bottomrow--;

//     // LEFT COL- bottom row to top row
//       for(int i=bottomrow;i>=toprow&&curr<=row*row;i--){
//         arr[i][leftcol]=curr++;
        
//       }
//       leftcol++;
//     }
//     return arr;

//   }
// }
// HW DO SAME FOR ANTICLOCKWISE

// import java.util.Scanner;

// public class multiarr{
//     public static void main(String[] args) {
//         Scanner ab=new Scanner(System.in);
//         System.out.println("ENTER ROW");
//         int row=ab.nextInt();
//         System.out.println("ENTER COL");
//         int col=ab.nextInt();
//         int[][]arr=new int[row][col];
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 arr[i][j]=ab.nextInt();
                
//             }
//         }
//         printarr(arr, row, col);
//         System.out.println("enter row 1");
//         int r1=ab.nextInt();
//         System.out.println("enter row 2");
//         int r2=ab.nextInt();
//         System.out.println("enter col 1");
//         int c1=ab.nextInt();
//         System.out.println("enter col 2");
//         int c2=ab.nextInt();
//         System.out.println("THE SUM IS"+recsum(arr,r1,r2,c1,c2));

//     }
//     static void printarr(int[][]arr,int row,int col)
//     {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static int recsum(int[][] arr,int r1,int r2,int c1,int c2){
//         int sum=0;
//         for ( int i = r1; i <=r2; i++) {
//             for (int j = c1; j <=c2 ; j++) {
//                 sum=sum+arr[i][j];
                
//             }
            
//         }
//         return sum;
//     }

// }

// import java.util.Scanner;

// public class multiarr{
//     public static void main(String[] args) {
//         Scanner ab=new Scanner(System.in);
//         System.out.println("ENTER ROW");
//         int row=ab.nextInt();
//         System.out.println("ENTER COL");
//         int col=ab.nextInt();
//         int[][]arr=new int[row][col];
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 arr[i][j]=ab.nextInt();
                
//             }
//         }
//         printarr(arr, row, col);
//         System.out.println("Prefixsum array");
//         prefixsum(arr, row, col);
//         printarr(arr, row, col);
        
//         System.out.println("Enter number of queries");
//         int Q=ab.nextInt();
//         while(Q!=0){

//         System.out.println("enter row 1");
//         int r1=ab.nextInt();
//         System.out.println("enter row 2");
//         int r2=ab.nextInt();
//         System.out.println("enter col 1");
//         int c1=ab.nextInt();
//         System.out.println("enter col 2");
//         int c2=ab.nextInt();
//         int sum= recsum(arr, r1, r2, c1, c2);
//        System.out.println("SUM IS"+sum);
//         }

        
//     }
//     static void printarr(int[][]arr,int row,int col)
//     {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static void prefixsum(int [][]arr,int row,int col){
//         for (int i = 0; i < row; i++) {
//             for (int j = 1; j < col; j++) {
//                 arr[i][j]+=arr[i][j-1];
                
//             }
//         }
//     }
//     static int recsum (int[][] arr,int r1,int r2,int c1,int c2){
//         int sum=0;
        
//             for (int j = r1; j <=r2; j++) {
            
            
//             if(c1==0)
//             {
//                  sum = sum+ arr[j][c2];
//             }
                 
//             else{
//              sum= sum +arr[j][c2]-arr[j][c1-1];
             
//             }
           
          
            
        

        

//     }
// return sum;
// }
// }

import java.util.Scanner;

public class multiarr{
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.println("ENTER ROW");
        int row=ab.nextInt();
        System.out.println("ENTER COL");
        int col=ab.nextInt();
        int[][]arr=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=ab.nextInt();
                
            }
        }
        printarr(arr, row, col);
        System.out.println("Prefixsum array");
        prefixsum(arr, row, col);
        printarr(arr, row, col);
        
        System.out.println("Enter number of queries");
        int Q=ab.nextInt();
        while(Q!=0){

        System.out.println("enter row 1");
        int r1=ab.nextInt();
        System.out.println("enter row 2");
        int r2=ab.nextInt();
        System.out.println("enter col 1");
        int c1=ab.nextInt();
        System.out.println("enter col 2");
        int c2=ab.nextInt();
        int sum= recsum(arr, r1, r2, c1, c2);
       System.out.println("SUM IS"+sum);
        }

        
    }
    static void printarr(int[][]arr,int row,int col)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void prefixsum(int [][]arr,int row,int col){
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                arr[i][j]+=arr[i][j-1];
                
            }
        }
        for (int j = 0; j < col; j++) {
            for (int i = 1; i< row; i++) {
                arr[i][j]+=arr[i-1][j];
                
            }
        }
    }
    static int recsum (int[][] arr,int r1,int r2,int c1,int c2){
        int ans=0,sum=0,up=0,left=0,leftup=0 ;
       if (r1==0&&c1==0) {
        
       }
        sum=arr[r2][c2];
        if(r1>=1)
        up=arr[r1-1][c2];
        if(c1>=1)
        left=arr[r2][c1-1];
        if(r1>=1&&c1>=1)
        leftup=arr[r1-1][c1-1];
        ans=sum-up-left+leftup;

        
        return ans;

           }
}




