/**
 * Created by Krishak on 4/12/13.
 */
//Petagonal number = n(3n-1)/2
// find Pa - Pb = Pa + Pb
//Petagonal number = n(3n-1)/2
// find Pa - Pb = Pa + Pb
public class ProjectEuler44 {
    public static void main(String[] args) throws SecurityException{
        double answer  =0.0;
        boolean flag=true;
        for(int i=1;i>0;i++){
            for(int a=i;a<10000;a++){
                double pa = gen(i);
                double pb = gen(a);
                answer=pb-pa;
                double add = pa + pb;
                if(check(add)&&check(answer)){
                    System.out.println(answer+" its "+a+" and "+i);
                    flag=false;
                    break;
                }
                if(flag==false) break;
            }
        }

    }
    public static double gen(int number){
        return 0.5*((3.0*Math.pow(number, 2.0))-number);
    }
    public static boolean check(double x){
        double n = (1.0/6.0)*(Math.sqrt((24.0*x)+1.0)+1.0);

        if(n%1==0)
            return true;
        else
            return false;
    }
}
