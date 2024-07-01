
// //no of occurences of particular x
// import java.util.*;

// public class arrqs{
//     public static void main(String[] args) {
//         int n,c,x;
//         Scanner ab=new Scanner(System.in);
//         System.out.println("enter number of elements");
//         n=ab.nextInt();
//         int[] arr=new int[n];
//         c=0;
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("enter element"+i);
//             arr[i]=ab.nextInt();
//     }
//     System.out.println("ARRAY IS");
//     System.out.println(Arrays.toString(arr));
//             System.out.println("enter the x whose occurence you want to find");
//         x=ab.nextInt();

//     for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==x)
//             {c++;
//             }
//     }
//     System.out.println("no of times c occurs is"+c);


// }
// }

// //Lastoccurence of particular x
// import java.util.*;

// public class arrqs{
//     public static void main(String[] args) {
//         int n,c,x;
//         Scanner ab=new Scanner(System.in);
//         System.out.println("enter number of elements");
//         n=ab.nextInt();
//         int[] arr=new int[n];
//         c=0;
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("enter element"+i);
//             arr[i]=ab.nextInt();
//     }
//     System.out.println("ARRAY IS");
//     System.out.println(Arrays.toString(arr));
//             System.out.println("enter the x whose occurence you want to find");
//         x=ab.nextInt();

//     for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==x)
//             {c=i;
//             }
//     }
//     System.out.println("last occurence of" +x+"is  "+c);

// Element greater than of particular x
// // import java.util.*;

// // public class arrqs{
// //     public static void main(String[] args) {
// //         int n,b,c,x;
// //         Scanner ab=new Scanner(System.in);
// //         System.out.println("enter number of elements");
// //         n=ab.nextInt();
// //         int[] arr=new int[n];
// //         c=0;
// //         for (int i = 0; i < arr.length; i++) {
// //             System.out.println("enter element"+i);
// //             arr[i]=ab.nextInt();
// //     }
// //     System.out.println("ARRAY IS");
// //     System.out.println(Arrays.toString(arr));
// //             System.out.println("enter the x whose occurence you want to find");
// //         x=ab.nextInt();

// //     for (int i = 0; i < arr.length; i++) {
// //             if(arr[i]>x)
// //             {c=arr[i];
// //             }
// //     }
// //     System.out.println("element greater than" +x+"is  "+c);
// }
// }

// CHECK IF ARRAY SORTED OR NOT
// //Lastoccurence of particular x
// import java.util.*;

// public class arrqs{
//     public static void main(String[] args) {
//         int n,c,x;
//         Scanner ab=new Scanner(System.in);
//         System.out.println("enter number of elements");
//         n=ab.nextInt();
//         int[] arr=new int[n];
//         c=0;
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("enter element"+i);
//             arr[i]=ab.nextInt();
//     }
//     System.out.println("ARRAY IS");
//     System.out.println(Arrays.toString(arr));
//             boolean flag=sort(arr);
//             if(flag==false)
//             {
//                 System.out.println("not sorted");
//             }
//             else{
//                 System.out.println("sorted");
//             }
//     }
//     static boolean sort(int[] arr){
//         boolean flag=true;
//         for (int i = 1; i < arr.length; i++) {
//             if(arr[i]<arr[i-1])
//             {flag=false;
//             }
//     }
//     return flag;
//     }
// }

// // return an array of largest an smallest element of an array
// import java.util.*;

// public class arrqs{
//     public static void main(String[] args) {
//         int n;
//         Scanner ab=new Scanner(System.in);
//         System.out.println("enter number of elements");
//         n=ab.nextInt();
//         int[] arr=new int[n];
        
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("enter element"+i);
//             arr[i]=ab.nextInt();
//     }
//     System.out.println("ARRAY IS");
//     System.out.println(Arrays.toString(arr));
//             System.out.println(Arrays.toString(smallestandlargest(arr)));
//     }
//     static int []smallestandlargest(int[] arr){
//         Arrays.sort(arr);
//         System.out.println("Smallest"+arr[0]);
//         System.out.println("Largest"+arr[arr.length-1]);
//         int[]arrsl={arr[0],arr[arr.length-1]};
//     return arrsl;
//     }
// }

// // // Program to find the total number of pairs in the arrays whose sum is equal to the given value x
// import java.util.*;

// public class arrqs{
//     public static void main(String[] args) {
//         int n;
//         Scanner ab=new Scanner(System.in);
//         System.out.println("enter number of elements");
//         n=ab.nextInt();
//         int[] arr=new int[n];
        
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("enter element"+i);
//             arr[i]=ab.nextInt();
//     }
//     System.out.println("ARRAY IS");
//     System.out.println(Arrays.toString(arr));
//     System.out.println("enter the target element");
//     int target=ab.nextInt();
//     System.out.println("number of lets is ");
//     System.out.println(doublets(arr,target));
           
//     }
//     static int doublets(int arr[],int target){
//        int c;
//        c=0;

//        for (int i = 0; i < arr.length; i++) {
//         {for (int j = i+1; j < arr.length; j++) {

//            {
            
//                 if(arr[i]+arr[j]==target){
//                     c++;
//                 }
                
            
//            } 
//         }

//        }
        
//        }
//        return c;
//     }

// }

// Program to find the total number of triplets in the arrays whose sum is equal to the given value x
// import java.util.*;

// public class arrqs{
//     public static void main(String[] args) {
//         int n;
//         Scanner ab=new Scanner(System.in);
//         System.out.println("enter number of elements");
//         n=ab.nextInt();
//         int[] arr=new int[n];
        
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("enter element"+i);
//             arr[i]=ab.nextInt();
//     }
//     System.out.println("ARRAY IS");
//     System.out.println(Arrays.toString(arr));
//     System.out.println("enter the target element");
//     int target=ab.nextInt();
//     System.out.println("number of triplets is ");
//     System.out.println(doublets(arr,target));
           
//     }
//     static int doublets(int[] arr,int target){
//        int c;
//        c=0;

//        for (int i = 0; i < arr.length; i++) {
//         {for (int j = i+1; j < arr.length; j++) {

//            {
//             for (int j2 = j+1; j2 < arr.length; j2++) {
//                 if(arr[i]+arr[j]+arr[j2]==target){
//                     c++;
//                 }
                
//             }
//            } 
//         }

//        }
        
//        }
//        return c;
//     }

// }
// // Program to find the unique element in an array
// import java.util.*;

// public class arrqs{
//     public static void main(String[] args) {
//         int n;
//         Scanner ab=new Scanner(System.in);
//         System.out.println("enter number of elements");
//         n=ab.nextInt();
//         int[] arr=new int[n];
        
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("enter element"+i);
//             arr[i]=ab.nextInt();
//     }
//     System.out.println("ARRAY IS");
//     System.out.println(Arrays.toString(arr));
//     System.out.println("number is ");
//     System.out.println(unique(arr));
           
//     }
//     static int unique (int [] arr){
//         int c;
//         c=0;

//        for (int i = 0; i < arr.length; i++) {
//         {for (int j = i+1; j < arr.length; j++) {

//            {
            
//                 if(arr[i]==arr[j]){
//                     arr[i]=-1;
//                     arr[j]=-1;
//                 }
                
            
//            } 
//         }

//        }
        
//        }
//        for (int i = 0; i < arr.length; i++) {
//         if(arr[i]!=-1){
//             c=arr[i];
//         }
        
//        }
//        return c;
//     }

// }

// // // Program to find the total number of pairs in the arrays whose sum is equal to the given value x
// import java.util.*;

// public class arrqs{
//     public static void main(String[] args) {
//         int n;
//         Scanner ab=new Scanner(System.in);
//         System.out.println("enter number of elements");
//         n=ab.nextInt();
//         int[] arr=new int[n];
        
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("enter element"+i);
//             arr[i]=ab.nextInt();
//     }
//     System.out.println("ARRAY IS");
//     System.out.println(Arrays.toString(arr));
//     System.out.println("second maximum  "+secondmaxm(arr));
   
           
//     }
//     static int maxm (int [] arr)
//     {
//         int max=Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]>max) {
//                 max=arr[i];
                
//             }
//         }
//         return max;
       
//     }
//     static int secondmaxm (int [] arr)
//     {
//         int max=maxm(arr);
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]==max) {
//                 arr[i]=Integer.MIN_VALUE;
                
//             }
//         }

//         return maxm(arr);
       
//     }
// }

// For an array of integers return the first value that is repeating in the array

// import java.util.*;

// public class arrqs{
//     public static void main(String[] args) {
//         int n;
//         Scanner ab=new Scanner(System.in);
//         System.out.println("enter number of elements");
//         n=ab.nextInt();
//         int[] arr=new int[n];
        
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("enter element"+i);
//             arr[i]=ab.nextInt();
//     }
//     System.out.println("ARRAY IS");
//     System.out.println(Arrays.toString(arr));
    
//     System.out.println("The first repeating number is ");
//     System.out.println(firstrepeat(arr));
           
//     }
//     static int firstrepeat(int [] arr){
       
//        for (int i = 0; i < arr.length; i++) {
//         {for (int j = i+1; j < arr.length; j++) {

//            {
//             for (int j2 = j+1; j2 < arr.length; j2++) {
//                 if(arr[i]==arr[j]){
//                     return arr[i];
//                 }
                
//             }
//            } 
//         }

//        }
        
//        }
//        return -1;
//     }

// }

// Reverse an array
// import java.util.*;
// public class arrqs{
//     public static void main(String[] args) {
//         int n;
//         Scanner ab=new Scanner(System.in);
//         System.out.println("enter number of elements");
//         n=ab.nextInt();
//         int[] arr=new int[n];
        
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("enter element"+i);
//             arr[i]=ab.nextInt();
//     }
//     System.out.println("ARRAY IS");
//     System.out.println(Arrays.toString(arr));
//     System.out.println("REVERSED ARRAY  ");
//     int[] ans=new int[arr.length];
//     ans=reverse(arr);
//     System.out.println( Arrays.toString(ans));
   
           
//     }
//     static int[] reverse(int [] arr)
//     {
//         int j=0;
//         int n=arr.length;
//         int i=n-1;
//         int [] ans=new int[n];
//         // for ( i = arr.length-1; i >= 0; i--) {
//         //     ans[j++]=arr[i];
                
//         //     }
//         while ( i >=0) {
//             ans[j++]=arr[i--];
            
//         }

        
//         return ans;
       
//     }
    
// }
// REVERSE AN ARRAY USING SWAPPING
// import java.util.*;

// public class arrqs {
//     public static void main(String[] args) {
//         int n, i;
//         i = 0;
//         Scanner ab = new Scanner(System.in);
//         System.out.println("enter number of elements");
//         n = ab.nextInt();
//         int[] arr = new int[n];

//         for (i = 0; i < arr.length; i++) {
//             System.out.println("enter element" + i);
//             arr[i] = ab.nextInt();
//         }
//         System.out.println("ARRAY IS");
//         System.out.println(Arrays.toString(arr));
//         System.out.println("REVERSED ARRAY  ");
//         reverse(arr, 0, n - 1);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void reverse(int[] arr, int start, int end) {
//         while (start < end) {
//             swap(arr, start, end);
//             start++;
//             end--;
//         }
//     }
// }
// //Rotate the array by 'k' steps

// import java.util.*; 
// public class arrqs {
//     public static void main(String[] args) {
//          int n, i;
//          i = 0;
//          Scanner ab = new Scanner(System.in);
//          System.out.println("enter number of elements");
//          n = ab.nextInt();
//          int[] arr = new int[n];

//          for (i = 0; i < arr.length; i++) {
//              System.out.println("enter element" + i);
//              arr[i] = ab.nextInt();
//          }
//          System.out.println("ARRAY IS");
//          System.out.println(Arrays.toString(arr));
//          System.out.println("enter k th time you want to rotate the array");
//          int k=ab.nextInt();
//          int [] ans=new int[n];
//          ans=rotate(arr, k);
//           System.out.println("ROTATE ARRAY IS");
//          System.out.println(Arrays.toString(ans));
//         }
//          static int [] rotate(int []arr,int k) {
//             int n=arr.length;
//             k=k%n;
//             int[]ans=new int[n];
//             int j=0;
//             for(int i=n-k;i<n;i++){
//                 ans[j++]=arr[i];
//             }
//             for(int i=0;i<n-k;i++){
//                 ans[j++]=arr[i];
//             }
//             return ans;
//          }
//     }
// Rotate the array by 'k' steps

// import java.util.*; 
// public class arrqs {
//     public static void main(String[] args) {
//          int n, i;
//          i = 0;
//          Scanner ab = new Scanner(System.in);
//          System.out.println("enter number of elements");
//          n = ab.nextInt();
//          int[] arr = new int[n];

//          for (i = 0; i < arr.length; i++) {
//              System.out.println("enter element" + i);
//              arr[i] = ab.nextInt();
//          }
//          System.out.println("ARRAY IS");
//          System.out.println(Arrays.toString(arr));
//          System.out.println("enter k th time you want to rotate the array");
//          int k=ab.nextInt();
//          rotateinplace(arr, k);
//           System.out.println("ROTATE ARRAY IS");
//          System.out.println(Arrays.toString(arr));
//         }
//         static void swap(int[]arr,int start,int end){
//             int temp=arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;

//         }
//         static void reverse (int[] arr,int start,int end) 
//         {
//             while(start<end){
//                 swap(arr,start,end);
//                 start++;
//                 end--;
//             }
//         }
//          static void rotateinplace(int []arr,int k) {
//            int n=arr.length;
//            k=k%n;
//             reverse(arr,0,n-k-1);
//             reverse(arr,n-k,n-1);
//             reverse(arr,0,n-1);

//          }
//     }

// K TIMES ROTATE AN ARRAY WITHOUT USING EXTRA  SPACE:}
// import java.util.*; 
// public class arrqs {
//     public static void main(String[] args) {
//          int n, i;
//          i = 0;
//          Scanner ab = new Scanner(System.in);
//          System.out.println("enter number of elements");
//          n = ab.nextInt();
//          int[] arr = new int[n];

//          for (i = 0; i < arr.length; i++) {
//              System.out.println("enter element" + i);
//              arr[i] = ab.nextInt();
//          }
//          System.out.println("ARRAY IS");
//          System.out.println(Arrays.toString(arr));
//          System.out.println("enter k th time you want to rotate the array");
//          int k=ab.nextInt();
//          rotateinplace(arr, k);
//           System.out.println("ROTATE ARRAY IS");
//          System.out.println(Arrays.toString(arr));
//         }
//         static void swap(int[]arr,int start,int end){
//             int temp=arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;

//         }
//         static void reverse (int[] arr,int start,int end) 
//         {
//             while(start<end){
//                 swap(arr,start,end);
//                 start++;
//                 end--;
//             }
//         }
//          static void rotateinplace(int []arr,int k) {
//            int n=arr.length-1;
//            k=k%n;
//             reverse(arr,0,n-k-1);
//             reverse(arr,n-k,n-1);
//             reverse(arr,0,n-1);

//          }
//     }


// For Q queries ,check if the given number is present int he array or not
// import java.util.*; 
// public class arrqs {
//     public static void main(String[] args) {
//          int n, i;
//          i = 0;
//          Scanner ab = new Scanner(System.in);
//          System.out.println("enter number of elements");
//          n = ab.nextInt();
//          int[] arr = new int[n];

//          for (i = 0; i < arr.length; i++) {
//              System.out.println("enter element" + i);
//              arr[i] = ab.nextInt();
//          }
//          System.out.println("ARRAY IS");
//          System.out.println(Arrays.toString(arr));
//          System.out.println("enter Q th time you want to QUERY the array");
//          int Q=ab.nextInt();
//          int[]frequencyarray=frequencyarray(arr);

//          while(Q!=0){
//             System.out.println("enter the number you want to search");
//             int x=ab.nextInt();
//             if(frequencyarray[x]>0){
//                 System.out.println("YES");
//             }
//             else{
//                 System.out.println("NO");
//             }
//             Q--;
//          }
         
//         }
        

        
//         static int []  frequencyarray (int[] arr) 
//         {
//             int [] freq=new int[(int)Math.pow(10,5)];
//             for (int i = 0; i < arr.length; i++) {
                
            
//             freq[arr[i]]++;
//         }
//         return freq;
//         }
//     }

// SORT an array with 0s and 1s

// import java.util.*; 
// public class arrqs {
//     public static void main(String[] args) {
//          int n, i;
//          i = 0;
//          Scanner ab = new Scanner(System.in);
//          System.out.println("enter number of elements");
//          n = ab.nextInt();
//          int[] arr = new int[n];

//          for (i = 0; i < arr.length; i++) {
//              System.out.println("enter element" + i);
//              arr[i] = ab.nextInt();
//          }
//          System.out.println("ARRAY CONSISTING OF0 AND 1 IS");
//          System.out.println(Arrays.toString(arr));
//          System.out.println("SORTEDD ARRAY IS ");
//          sortzeroandone(arr);
//          System.out.println(Arrays.toString(arr));
         
         
//          }
         
//         static int noofzeroes(int[] arr) 
//         {
//             int freq=0;
//             for (int i = 0; i < arr.length; i++) {
//                 if(arr[i]==0){
//                     freq++;
//                 }
                
//             }
        
//         return freq;
//         }
//         static void sortzeroandone(int[] arr) 
//         {
//             int noofzeroes=noofzeroes(arr);
//                 for (int i = 0; i < arr.length; i++) {
//                     if(i<noofzeroes){
//                         arr[i]=0;
//                     }
//                     else{
//                         arr[i]=1;
//                     }
                        
//                     }
                
                
//             }
//         }


// SORT AN ARRAY WITH EVEN AND ODD INPUTS WITHOUT EXTRA SPACE
// import java.util.*; 
// public class arrqs {
//     public static void main(String[] args) {
//          int n, i;
//          i = 0;
//          Scanner ab = new Scanner(System.in);
//          System.out.println("enter number of elements");
//          n = ab.nextInt();
//          int[] arr = new int[n];

//          for (i = 0; i < arr.length; i++) {
//              System.out.println("enter element" + i);
//              arr[i] = ab.nextInt();
//          }
//          System.out.println("ARRAY CONSISTING OF EVEN AND ODD IS");
//          System.out.println(Arrays.toString(arr));
//          System.out.println("SORTEDD ARRAY IS ");
//          sortzeroandone(arr);
//          System.out.println(Arrays.toString(arr));
         
         
//          }
//           static void swap(int[] arr,int left,int right) 
//         {
//             int temp=arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;
//         }
//         static void sortzeroandone(int[] arr) 
//         {
//                int left=0;
//                int right=arr.length-1;
//                while(left<right){

//                if(arr[left]%2==1&&arr[right]%2==0){
//                 swap(arr,left,right);
//                 left++;
//                 right--;

//                }
//                if(arr[left]%2==0){
//                 left++;
//                }
//                if(arr[right]%2==1){
//                 right--;
//                }
                
//             }
//         }
//     }
        
//   SORT AN ARRAY IN NON DECREASIND MANNER LIKE [-10, -3, -2, 1, 4, 5]     TO   [1, 4, 9, 16, 25, 100]     
// import java.util.*; 
// public class arrqs {
//     public static void main(String[] args) {
//          int n, i;
//          i = 0;
//          Scanner ab = new Scanner(System.in);
//          System.out.println("enter number of elements");
//          n = ab.nextInt();
//          int[] arr = new int[n];

//          for (i = 0; i < arr.length; i++) {
//              System.out.println("enter element" + i);
//              arr[i] = ab.nextInt();
//          }
//          System.out.println("ARRAY  IS");
//          System.out.println(Arrays.toString(arr));
//          int [] ans =new int[arr.length];
//          System.out.println("SORTEDD ARRAY IS ");
//          ans=sortsquares(arr);
//          revarr(ans);
//          System.out.println(Arrays.toString(ans));
         
         
//          }
//           static void swap(int[] arr,int left,int right) 
//         {
//             int temp=arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;
//         }
//         static void revarr(int [] arr){
//             int start=0;
//             int end=arr.length-1;
//             while(start<end){
//                 swap(arr, start, end);
//                 start++;
//                 end--;
//             }
//         }
//         static int [] sortsquares(int[] arr) 
//         {
//                int left=0;
//                int right=arr.length-1;
//               int [] ans=new int[arr.length];
//               int k=0;
//               while(left<=right){
//                 if(Math.abs(arr[left])>Math.abs(arr[right])){
//                     ans[k++]=arr[left]*arr[left];
//                     left++;
//                 }
//                 else{
                    
//                         ans[k++]=arr[right]*arr[right];
//                         right--;
//                     }

//                 }
//                 return ans;
//               }
//         }
    
// //Given an integer array 'a', return the prefix sum/running sum.
        
// import java.util.*; 
// public class arrqs {
//     public static void main(String[] args) {
//          int n, i;
//          i = 0;
//          Scanner ab = new Scanner(System.in);
//          System.out.println("enter number of elements");
//          n = ab.nextInt();
//          int[] arr = new int[n];

//          for (i = 0; i < arr.length; i++) {
//              System.out.println("enter element" + i);
//              arr[i] = ab.nextInt();
//          }
//          System.out.println("ARRAY IS");
//          System.out.println(Arrays.toString(arr));
//          int [] ans =new int[arr.length];
//          System.out.println("SORTEDD ARRAY IS ");
//          ans=prefixsum(arr);
         
//          System.out.println(Arrays.toString(ans));
         
         
//          }
        
//         static int [] prefixsum(int[] arr) 
//         {
//                int[]ans=new int[arr.length];
//                ans[0]=arr[0];
//                for (int i = 1; i < ans.length; i++) {
//                 ans[i]=ans[i-1]+arr[i];

//                }
//                return ans;
               
//                 }
//                 }
        
    
// Given an integer array 'a', return the prefix sum/running sum in the same array.
        
// import java.util.*; 
// public class arrqs {
//     public static void main(String[] args) {
//          int n, i;
//          i = 0;
//          Scanner ab = new Scanner(System.in);
//          System.out.println("enter number of elements");
//          n = ab.nextInt();
//          int[] arr = new int[n];

//          for (i = 0; i < arr.length; i++) {
//              System.out.println("enter element" + i);
//              arr[i] = ab.nextInt();
//          }
//          System.out.println("ARRAY IS");
//          System.out.println(Arrays.toString(arr));
         
//          System.out.println("SORTEDD ARRAY IS ");
//          prefixsum(arr);
         
//          System.out.println(Arrays.toString(arr));
         
         
//          }
        
//         static void prefixsum(int[] arr) 
//         {
             
//              for (int i =1 ; i < arr.length; i++) 
                
//              {
//                 arr[i]=arr[i-1]+arr[i];
                
//              }
              
               
//                 }
//                 }

// //For a given array of integers of size n, answer q queries to print the sum of values in a given range of indices from l to r4

// import java.util.*; 
// public class arrqs {
//     public static void main(String[] args) {
//          int n, i;
//          i = 0;
//          Scanner ab = new Scanner(System.in);
//          System.out.println("enter number of elements");
//          n = ab.nextInt();
//          int[] arr = new int[n];

//          for (i = 0; i < arr.length; i++) {
//              System.out.println("enter element" + i);
//              arr[i] = ab.nextInt();
//          }
//          System.out.println("ARRAY IS");
//          System.out.println(Arrays.toString(arr));
         
//          System.out.println("SORTEDD ARRAY IS ");
//          prefixsum(arr);
         
//          System.out.println(Arrays.toString(arr));
         
         
//          }
        
//         static void prefixsum(int[] arr) 
//         {
             
//              for (int i =1 ; i < arr.length; i++) 
                
//              {
//                 arr[i]=arr[i-1]+arr[i];
                
//              }
              
               
//                 }
//                 static int sum(int []arr,int l,int r){
//                     int sum=0;
//                     prefixsum(arr);
//                     sum=arr[]
//                 }
//                 }

//  Program to check if an array can be partitioned into sub-arrays with equal sum


// import java.util.*;

// public class arrqs
// {
//     public static void main(String[] args) {
//         Scanner ab=new Scanner (System.in);
//         System.out.println("Enter row");
//         int row=ab.nextInt();
//         int [] arr=new int[row];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=ab.nextInt();
//         }
//         System.out.println(Arrays.toString(arr));
//         System.out.println("  Program to check if an array can be partitioned into sub-arrays with equal sum "+eqlsubarr(arr));
//     }
//     static int findsum(int [] arr ){
//         int sum=0;
//         for (int i = 0; i < arr.length; i++) {
//             sum+=arr[i];
//         }
//         return sum;
//     }
//     static boolean eqlsubarr(int[] arr){
//         int totalsum=findsum(arr);
//         int prefixsum=0;
//         for (int i = 0; i < arr.length; i++) {
//             prefixsum +=arr[i];
//             int suffixsum=totalsum-prefixsum;
//             if (prefixsum==suffixsum) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }



