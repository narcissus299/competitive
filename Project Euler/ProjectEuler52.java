/**
 * Created by Krishak on 14/2/15.
 */
public class ProjectEuler52 {

    private static boolean samedigits(int digits1[],int digits2[]){
        if(digits1.length != digits2.length) return false;
        for(int i=0; i <digits1.length;i++){
            if(digits1[i] != digits2[i]) return false;
        }
        return true;
    }

    private static int[] givedigits(int n){
        int digits[] = new int[(Integer.toString(n)).length()];
        int pos=0;
        while(n>0){
            int temp = n%10;
            digits[pos++] = temp;
            n /= 10;
        }
        for(int i =0;i<digits.length-1;i++){
            for(int a =0;a<digits.length-i-1;a++){
                if(digits[a]>digits[a+1]){ int t=digits[a]; digits[a]=digits[a+1]; digits[a+1]=t;}
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        BasicFunctions time = new BasicFunctions();
        time.start();
         for(int i=10;i>0;i++){
           int digits[] = givedigits(i);
            boolean flag = true;
            for(int a =2;a<7;a++){
                int[] dig2 = givedigits((i*a));
                if(samedigits(digits,dig2)==false){flag =false; break;}
            }
            if(flag){System.out.println("Ans : "+i);break;}


        }
        time.end();
    }
}
