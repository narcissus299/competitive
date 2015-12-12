/**
 * Created by Krishak on 7/9/15.
 */
public class ProjectEuler65 {
    public static void main(String[] args) {
        fraction sum = new fraction(0,0);
        int flag = 0;
        int multiplier = ;
        for(int i =100;i>1;i++){
        int k =1;
        //Hash for 2k

        }
        sum.add(new fraction(2,1));
        System.out.println(addDigits(sum.numerator));
    }

    public static int addDigits(int n){
        int sum=0;
        while (n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}

class fraction {
    int numerator;
    int denominator;

    fraction(int num,int den){
        numerator = num;
        denominator = den;
    }

    public void add(fraction b){
        if(numerator == 0 && denominator == 0 && b.numerator!=0 && b.denominator!=0){
            numerator = b.numerator;
            denominator = b.denominator;
        }
        else if(b.numerator != 0 && b.denominator !=0){
        numerator = numerator*b.denominator + b.numerator*denominator;
        denominator = denominator * b.denominator;
        }
    }

    public void simplify(){
        for(int i=2;i<=(numerator < denominator?numerator:denominator);i++){
            if(numerator%i==0 && denominator%i==0){
                numerator /=i;
                denominator /=i;
            }
        }
    }

    // b / this
    public void divide(fraction b){
        int copy = numerator;
        numerator = b.numerator * denominator;
        denominator = copy * b.denominator;
    }
}
