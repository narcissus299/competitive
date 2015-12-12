/**
 * Created by Krishak on 2/6/15.
 The palindromic number 595 is interesting because it can be written as the sum of consecutive squares: 62 + 72 + 82 + 92 + 102 + 112 + 122.

 There are exactly eleven palindromes below one-thousand that can be written as consecutive square sums, and the sum of these palindromes is 4164. Note that 1 = 02 + 12 has not been included as this problem is concerned with the squares of positive integers.

 Find the sum of all the numbers less than 108 that are both palindromic and can be written as the sum of consecutive squares.

 */

public class ProjectEuler125 {
    public static void main(String[] args) {
        int sum=1;
        for(int i = 4;i<=1000;i++){
            if (!pallindrome(i))
            continue;
            int max = max(i);

        }
    }
    public static int max(int n){ //Calculation
        return (int) Math.sqrt(n/2);
    }

     public static int count(int n){
        int t=0;
        while(n>0){
        t++;
        n/=10;
    }
        return t;
    }

    public static boolean pallindrome(int n){
    int size = count(n);
        for(int i =1;i <= size/2;i++){
            if(digit(n,i) != digit(n,size-i+1))
                return false ;
        }

    return true;
    }

   public static int digit(int n,int d){
       if (d==count(n))
           return n%10;
       else return (n/(int)Math.pow(10,count(n)-d))%10;
   }


}
