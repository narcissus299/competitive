/**
 * If we take 47, reverse and add, 47 + 74 = 121, which is palindromic.

 Not all numbers produce palindromes so quickly. For example,

 349 + 943 = 1292,
 1292 + 2921 = 4213
 4213 + 3124 = 7337

 That is, 349 took three iterations to arrive at a palindrome.

 Although no one has proved it yet, it is thought that some numbers, like 196, never produce a palindrome. A number that never forms a palindrome through the reverse and add process is called a Lychrel number. Due to the theoretical nature of these numbers, and for the purpose of this problem, we shall assume that a number is Lychrel until proven otherwise. In addition you are given that for every number below ten-thousand, it will either (i) become a palindrome in less than fifty iterations, or, (ii) no one, with all the computing power that exists, has managed so far to map it to a palindrome. In fact, 10677 is the first number to be shown to require over fifty iterations before producing a palindrome: 4668731596684224866951378664 (53 iterations, 28-digits).

 Surprisingly, there are palindromic numbers that are themselves Lychrel numbers; the first example is 4994.

 How many Lychrel numbers are there below ten-thousand?

 NOTE: Wording was modified slightly on 24 April 2007 to emphasise the theoretical nature of Lychrel numbers.
 */
public class ProjectEuler55 {
    public static long reverse(long n){
        String number = Long.toString(n);
        String reverse="";

        for(int i=0;i<number.length();i++)
        reverse = number.charAt(i)+reverse;

        return Long.parseLong(reverse);
    }
    public static String reverse(String number){
        String reverse="";

        for(int i=0;i<number.length();i++)
            reverse = number.charAt(i)+reverse;

        return reverse;
    }

    public static boolean pallindrome(long n){
        String number = Long.toString(n);
        int length = number.length();
        int half_length = length/2;
        switch(length%2){
            case 0 :
                    String a = number.substring(0,half_length);
                     String b = number.substring(half_length,length);
                     if(a.equals(reverse(b))) return true;
                break;
            case 1 :
                String x = number.substring(0,half_length);
                String y = number.substring(half_length+1,length);
                if(x.equals(reverse(y))) return true;
                break;
        }
        return false;
    }


    public static void main(String[] args) {
        int counter =0;
        for(int i =10;i<10000;i++){
         long sum = i;
         for(int a=0;a<50;a++){
           sum = sum + reverse(sum);
           if(pallindrome(sum)) {counter++; break;}
         }
            System.out.println("Counter: "+counter+"\ti: "+i);
        }
    }
}
