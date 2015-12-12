/**
 * Created with IntelliJ IDEA.
 * User: Krishak
 * Date: 4/12/13
 * Time: 4:29 PM
 * To change this template use File | Settings | File Templates.
 */
//Generate the 10001th Prime
//Answer is 104743

public class ProjectEuler7 {
    public static void main(String[] args) {
        int rank = 90001; int counter=1;
        long loop =3; long prime=0;

        while(rank!=counter){
            if(prime(loop)){
                counter++;
                prime=loop;
            }
            loop+=2;
        }
         System.out.println("The "+counter+"th prime is : "+prime);
    }
    public static boolean prime(long n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
