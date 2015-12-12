/**
 * Created by Krishak on 25/2/15.
 */
//actually 37
public class ProjectEuler60 {

    public static boolean prime(int num) {
       if(num<2)
           return false;
       for(int i=2;i<num;i++)
           if(num%i==0)
               return false;
    return true;
    }

    public static int nod(int num){
        if (num==0)
            return 1;
        int digits = (int)(Math.log10((double)num))+1;
        return digits;
    }

    public static int rev(int num) {
        int rev =0;
        while(num>0){
            rev = (rev*10) + num%10;
            num /= 10;
        }
    return rev;
    }

    public static void main(String[] args) {
       BasicFunctions obj = new BasicFunctions();
       obj.start();

        int counter =0;
        int sum=0;


        for(int i=9;i>0;i++){


            boolean flag = true;
            int len = nod(i);
            //LEFT
            int left[] = new int[len];
            left[len-1] = i;
            for(int a=1;a<len;a++){
                left[a-1] = i % (int)(Math.pow(10,a));
            }
            for(int a=0;a<len;a++){
                if(!prime(left[a])){
                    flag = false;
                    break;
                }
            }
            if (!flag) continue;

            //RIGHT
            int right[] = new int[len-1];
            int j = rev(i);
            for(int a=1;a<len;a++){
                right[a-1] = rev(j % (int)(Math.pow(10,a)));
            }
            for(int a=0;a<len-1;a++){
                if(!prime(right[a])){
                    flag = false;
                    break;
                }
            }
           if (!flag) continue;

           //Contains 0

           int copy =i;
            while (copy>0){
                if(copy%10==0){
                    flag=false;
                    break;
                }
                copy /= 10;
            }

           if(flag){
            sum +=i;
            counter++;
            System.out.println(i);
           }
            if(counter==11) break;
        }
        System.out.println("Ans "+sum);
        obj.end();
    }
}
