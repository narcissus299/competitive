/**
 * Created by Krishak on 5/12/13.
 */

//  THIS IS ACTUALLY PROBLEM 3 AND NOT 2

public class ProjectEuler2 {
    //Ultimate primality function!
    public static boolean prime(double n){
        if(n==1.0)return false;
        else if(n<4.0) return true;
        else if(n%2.0==0.0) return false;
        else if(n<9.0) return true;
        else if(n%3.0==0.0) return false;
        else{
            double r=Math.floor(Math.sqrt(n));
            double f=5.0;
            while(f<=r){
                if(n%f==0.0) return false;
                if(n%(f+2.0)==0.0) return false;
                f=f+6.0;
            }
            return true;
        }}

    public static void main(String[] args) {
        double a = 600851475143.0;
        double limit = (a/2.0);
        double highest=0;
        for(double i = 3.0;i<limit;i+=2){
            System.out.println(i+" - highest prime factor till now : "+highest);
         if(a % i ==0.0){
           if(prime(i)){
            if(i > highest)
                highest = i;
         }
         }
        }
        System.out.println("Therefore, the answer is : "+ (int)highest);
    }
}
