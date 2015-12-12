import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Krishak on 20/5/14.
 *
 *
 * It was proposed by Christian Goldbach that every odd composite number can be written as the sum of a prime and twice a square.

 9 = 7 + 2×12
 15 = 7 + 2×22
 21 = 3 + 2×32
 25 = 7 + 2×32
 27 = 19 + 2×22
 33 = 31 + 2×12

 It turns out that the conjecture was false.

 What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?
 */

public class ProjectEuler46 {
    public static void main(String[] args) {
            BasicFunctions obj2 = new BasicFunctions();
            obj2.start();
            main2();
            obj2.end();
        }

    public static boolean isPrime(int n) {

        if(n==1)return false;
        else if(n<4) return true;
        else if(n%2==0) return false;
        else if(n<9) return true;
        else if(n%3==0) return false;
        else{
            double r=Math.floor(Math.sqrt(n));
            double f=5.0;
            while(f<=r){

                if(n%f==0.0) return false;
                if(n%(f+2.0)==0.0) return false;
                f=f+6.0;

            }

            return true;

    } }


    //Checks if number is a perfect square
    public static boolean issq(double num){
        int  y = (int) Math.pow(num,0.5);
        if((y*y)==num) return true;
        return false;
    }

    public static void main2(){
        for(int i=5;i>0;i+=2){

            if(isPrime(i)) continue;
            boolean flag = false;

            for(int p = 1;p<i;p++){
                if(!isPrime(p)) continue;
                if(issq((i-p)/2)){
                    flag = true;
                    break;}
            }


            if(!flag){
                System.out.println(i);
                break;}
        }

    }

}
