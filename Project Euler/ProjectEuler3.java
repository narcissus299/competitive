/**
 * Created by Krishak on 5/12/13.
 */
//AND THIS IS ACTUALLY 2 ....
class ProjectEuler3{
    public static void main(String[] args){
        int a=1; int b=2;
        int counter=0;
        while(b<4000000){
            if(b%2==0)
                counter+=b;

            int t=a;
            a=b;
            b=b+t;
        }
        System.out.println(counter);
    }
}