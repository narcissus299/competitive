/**
 * Created by Krishak on 4/12/13.
 */
//Sum of multiples of 3's and 5's before 1000
public class ProjectEuler1 {
    public static void main(String[] args){
        int counter = 0;
        for(int i=1;i<1000;i++){
            if(i%3==0 || i%5 ==0)
                counter+=i;
        }

        print(counter);
    }

    public static void print(int object) {
        System.out.print(object);
    }
}
