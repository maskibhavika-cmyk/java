// public class Loops {
    
//       public static void main(String[] args) {
//  for( int counter = 0; counter<3; counter = counter + 1) {
//     System.out.println("Hello World");
//  }
// }
// }


// public class Loops {
    
//       public static void main(String[] args) {
//         // counter ++ => counter +1
//  for( int counter = 0; counter<11; counter++) {
//     System.out.println(counter+"");
//  }

// for( int i =0;i<11; i++){
//   System.out.println(i);
// }
// }
// }


// public class Loops {
    
//       public static void main(String args[]) {   
       // while loop
    //   int i = 0;
    //   while(i<11) {
    //     System.out.println(i);
    //     i = i+1 ; //i++
    //   }

    // do  while loop
    //  int i = 0;
    //  do{
    //     System.out.println(i);
    //   i = i+1 ; 
    //  } while(i< 11);

// int i = 12;
// while(i< 11) {
//       System.out.println("Apna CLg");
// }
//   do{
//         System.out.println("Apna CLg");
//      } while(i< 11);
//       }
//     }


import java.util.*;

public class Loops {
    
      public static void main(String args[]) {   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum = sum +1;
        }
     System.out.println(sum);
    } 
    }