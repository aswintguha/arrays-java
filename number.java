//  1 Automorphic number
// import java.util.*;
// public class number {
//     public static void main(String[] args) {
//         Scanner ab=new Scanner(System.in);
//         System.out.println("ENTER NUMBER");
//         int n=ab.nextInt();
//         int store,c,sqr;
//         double p=0;
//        sqr=n*n;
//         c=0;
//         store=n;
//         while(n!=0){
//            c++;
//            n=n/10;
//         }
//  p=sqr%(Math.pow(10,c));
// if(p==store){
//     System.out.println("Automorphic number");
// }
// else{
//     System.out.println("not automorphic ");
// }



//     }
// }
// 2 Fascinating number
//  import java.util.*;
// public class number {
//     public static void main(String[] args) {
//         Scanner ab=new Scanner(System.in);
//         System.out.println("ENTER NUMBER");
//         int count=0;
//         int n=ab.nextInt();
//         int two=n*2;
//         int three=n*3;
//         String conc=" ";
//         count=0;
//         conc=  Integer.toString(n) + Integer.toString(two)+ Integer.toString(three);
//         for(char i='1';i<='9';i++){
//             for(int j =0;j<conc.length();j++){

//                 char ch=conc.charAt(j);
//                 if(ch==i){
//                      count=count+1;
//                      break;
//                 }
//             }
//         }
//         if(count==9){
//             System.out.println("fascinating no.");
//         }
//         else{
//             System.out.println("not");
//         }
        
        
//     }
//     }
// // 3  HAPPY NUMBER
// import java.util.*;
// public class number {
    
//     static int sum(int n){
//         int s,r;
//         int sq;

//         sq=1;
//         s=0;
//         while(n!=0){
//         r=n%10;
//         sq=r*r;
//         s=s+sq;
//         n=n/10;}
//         return (s);
//     }
//     public static void main(String[] args) {
//     Scanner ab=new Scanner(System.in);
//     System.out.println("ENTER NUMBER");
//     int no,c;
//     no=ab.nextInt();
//     c=(sum(no));
//     while (c!=1&&c!=4) {
//         c=(sum(c));
//     if(c==1){
//         System.out.println("happy number");
//     }
//     else if(c==4){
//         System.out.println("not happy number");

//     }

//     }
//     }
// }
// 4  SUNNY NUMBER
// import java.util.*;
// public class number {
//     public static void main(String[] args) {
//         Scanner ab=new Scanner(System.in);
//         System.out.println("ENTER NUMBER");
//         int n=ab.nextInt();
//         int a;
//         a=n+1;
//         double sqr=Math.sqrt(a);
//         double appr=Math.ceil(sqr);
//         if(appr-sqr==0){
//             System.out.println("sunny no");
//         }
//         else{
//             System.out.println("not sunny");
//         }
//     }
// }
//5   DISARIUM NO
// import java.util.*;
// public class number {
//     public static void main(String[] args) {
//         Scanner ab=new Scanner(System.in);
//         System.out.println("ENTER NUMBER");
//         int n=ab.nextInt();
//         int store,r,c;
//         store=n;
//         c=0;
//         double sum;
//         r=0;
//         sum=0;
//         while(n!=0){
//             c++;
//             n=n/10;
//         }
//         n=store;
//         while(n!=0){
//             r=n%10;
//             sum=sum+Math.pow(r,c);
//             n=n/10;
//             c--;
//         }
//         if(sum==store){
//             System.out.println("disarium number");
//         }
//         else{
//             System.out.println("not disarium number");
//         }

//     }

// }
// 6  pronic
//  import java.util.*;
// public class number {
//     public static void main(String[] args) {
//         Scanner ab=new Scanner(System.in);
//         System.out.println("ENTER NUMBER");
//         int n=ab.nextInt();
//         int i,store;
//         store=n;
//         for(i=1;i<=n;i++){
//             if(i*(i+1)==store){
//                 System.out.println("pronic number");
//                 break;
//             }
//         }
           
//         }
    
//     }
    
// 7 TRIOMORPHIC NUMBER


// import java.util.*;
// public class number {
//     public static void main(String[] args) {
//         Scanner ab=new Scanner(System.in);
//         System.out.println("ENTER NUMBER");

//         int n=ab.nextInt();
//         int store,c,sqr;
//         double p=0;
//        sqr=n*n*n;
//         c=0;
//         store=n;
//         while(n!=0){
//            c++;
//            n=n/10;
//         }
//  p=sqr%(Math.pow(10,c));
// if(p==store){
//     System.out.println("triomorphic number");
// }
// else{
//     System.out.println("not trioomorphic ");
//  }



//     }
// }

// 8 Niven number OR HARSHAD NUMBER
// import java.util.*;
// public class number {

// 	public static void main(String args[]){
// 	    Scanner sc = new Scanner(System.in);

//     	int n, S = 0;

//     	System.out.println("Enter number");

//     	n = sc.nextInt();
//         int box=n;

//     	while  (n!=0) {

//         	S = S + n % 10;

// 	    	n = n / 10;
//     	}

//            if (box% S == 0) {

// 	System.out.println(" Niven number");

// 				}	   else {

// 						   System.out.println("Not a niven number");
// 					   }
//            }
// 	}
// 9  EVIL ODIUS NUMBER
//  import java.util.*;
//  public class number {
//      public static void main(String[] args) {
//         Scanner ab=new Scanner(System.in);
//          System.out.println("ENTER NUMBER");
//         int n=ab.nextInt();
//         System.out.println(decbin(n));
//         if(onefreq(decbin(n))==true){
//             System.out.println("evil");
//         }
//         else{
//             System.out.println("odius");
//         }
//      }
//      static boolean onefreq (int n){
//         String s;
//         s=" ";
//         int count=0;
//         s=Integer.toString(n);
//         char ch='1';
//        for(int i=0;i<s.length();i++){
//         if(s.charAt(i)==ch){
//             count++;
//                 }       
//              }
//              if(count%2==0){
//                 return true;
//              }else{
//                 return false;}


//      }
//       static int  decbin (int n){
//         int r,s,p;
//         s=0;
//         p=0;
//         while(n!=0){
//             r=n%2;
//             s=s+r*(int)Math.pow(10,p++);                  //************ IMPORTANT STEP***********  */
//             n=n/2;
//         }
//         return s;
     
//     }
//  }


//10 SPY NUMBER
// import java.util.*;
// public class number {
// 			public static void main(String[] args) {
// 		        Scanner sc = new Scanner (System.in);
// 		        int s=0,p=1,n,r;
// 		        System.out.println("Enter number");
// 		        n=sc.nextInt();
		        
// 		        while (n>0){
// 		            r=n%10;
//                     s=s+r;
//                     p=p*r;
// 		            n=n/10;
// 		        }
// 		        if (s==p){
// 		            System.out.println("Spy number");
// 		        }
// 		        else{
// 		            System.out.println("Not a Spy number");
// 		        }	        
// 	}
// }



//11 TWISTED PRIME OR EMRIP NUMBER 
//import java.util.*;
// public class number{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number`");
//         int no = sc.nextInt();
//         int store, r, reversed;
//         store = no;
//         reversed = 0;
//         reversed = rev(no);

// //        int a=100;

//         if (prime(store) == prime(reversed)&&prime(store)==100) {
//             System.out.println("twin prime");

//         } else {
//             System.out.println("not twisted prime");
//         }
//     }


//     static int rev(int n) {
//         int r,rev;
//         rev=0;
//         while (n != 0) {
//             r = n % 10;
//             rev = (rev * 10) + r;
//             n = n / 10;

//         }
//         return rev;
//     }
//     static int prime(int n){

//         int flag=0;
//         int a=0;
//         for (int i=1;i<=n;i++) {
//             if (n % i == 0) {
//                 flag = flag + 1;
//             }
//         }
//             if(flag==2){
//                  a=100;
//             }
//                 return a;
//     }
//     }