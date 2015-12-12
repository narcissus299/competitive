/**
 * Created by Krishak on 5/12/13.
 */
/*
The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?
 */
public class ProjectEuler35 {
    public static void main(String[] args){
        BasicFunctions obj = new BasicFunctions();

        //Map out time
       //long start = System.currentTimeMillis();
        obj.start();
        int limit =1000000 ; // 1000000

        int counter=0;
        for(int i=2;i<limit;i++){
            boolean flag = true;
            int temp = i;
            if(obj.isPrime(i)) {
                int l = obj.lengthOfIneger2(i);

                for(int a =1;a<=l;a++){
                 int t = temp/10;
                 temp %= 10;
                 temp= temp*(int) Math.pow(10,l-1) + t;;

                 if(!obj.isPrime(temp)){ // || temp > i){
                     flag=false;
                     break; }
                }

            }
            else continue;
            if(flag){
                counter++;
               System.out.println(i);
            }
            }

            System.out.println("Answer is : " + counter);


            //End program
            //System.out.println((System.currentTimeMillis() - start) + " ms");
            obj.end();
    }
    }

