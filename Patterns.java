
// public class Patterns {
//     public static  void  main (String args[]) {   
//      int n = 4;
//      int m = 5;

//      //outer loop
//      for(int i = 1; i<=n; i++){
//         //innner loop
//          for(int j = 1; j<=m; j++){
//             System.out.println("*");
//      }

// }
// }
// }


// public class Patterns {
//     public static  void  main(String args[]) {   
//      int n = 4;
//      int m = 5;

//      //outer loop
//      for(int i = 1; i<=n; i++){
//         //innner loop
//          for(int j = 1; j<=m; j++){
//             //cell -> (i,j)
//           if(i==1 || j== 1 || i==n || j==m){
//            System.out.print("*");
//           } else {
//       System.out.print(" ");
//      }
//     }
//         System.out.println("*");
// }
// }
// }



// public class Patterns {
//     public static void main(String args[]) {   

//  int n = 4;

//      //outer loop
//      // example 1
//     //  for(int i = 1; i<=n; i++){
//     // example 2
//      for(int i = n; i>=1; i--){
//         //innner loop
//          for(int j = 1; j<=i; j++){
//            System.out.print("*");
//           }
//         System.out.println();
// }
// }
// }


public class Patterns {
    public static  void  main(String args[]) {   

 int n = 4;
 // outer loop
     for(int i = 1; i<=n; i++){
   
        //innner loop -> space print 
         for(int j = 1; j<=n-i; j++){
           System.out.print(" ");
          }
          // inner loop -> star print
            for(int j = 1; j<=i; j++){
                System.out.println("*");
        }
        System.out.println();
}
}
}
