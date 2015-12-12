/*
ID: krishak1
LANG: JAVA
TASK: friday
*/

import java.io.*;
import java.util.StringTokenizer;

class friday {

    public static int day(int D, int M, int Y) {
        int y = Y - (14 - M) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = M + 12 * ((14 - M) / 12) - 2;
        int d = (D + x + (31*m)/12) % 7;
        return d;
    }

    public static void main(String[] args) throws IOException{

        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] thirteenth = {0,0,0,0,0,0,0};

        for(int y = 1900;y<(1900+n);y++){
            for(int m = 1;m<=12;m++){
                    thirteenth[day(13, m, y)]++;

            }
        }
            String answer  = Integer.toString(thirteenth[6])+" "+Integer.toString(thirteenth[0])+" "+Integer.toString(thirteenth[1])+" "+Integer.toString(thirteenth[2])+" "+Integer.toString(thirteenth[3])+" "+Integer.toString(thirteenth[4])+" "+Integer.toString(thirteenth[5]);
            out.println(answer);
            out.close();
            System.exit(0);
        }
    }
