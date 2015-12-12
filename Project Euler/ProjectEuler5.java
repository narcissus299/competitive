/**
 * Created by Krishak on 7/12/13.
 */

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class ProjectEuler5{
    public static void main(String[] args){
        BasicFunctions obj = new BasicFunctions();
        obj.start();

        for(int i=21;i>0;i++){
            boolean flag = true;
            for(int a=2;a<=20;a++){
                if(i%a == 0 ){}
                    else{flag= false; break;}
            }
             if(flag==true){
                 System.out.println(i);
                 break;
             }

        }

        obj.end();
    }
}
