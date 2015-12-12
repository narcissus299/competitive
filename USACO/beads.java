/*
ID: krishak1
LANG: JAVA
TASK: beads
*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;

import java.util.*;//StringTokenizer;


class beads {
    
    public static int count(String beads,int length,int pos, char b, int c,int pass){
        int d = (c+pos+1)%length;
        if(d-1 == pass || c == length)
            return c;
        char x = beads.charAt(d);
        if(b!='w' && b!=x && x!='w')
            return c+1;
        if(b=='w')
            return count(beads,length,pos,x,c+1,pass);
        return count(beads,length,pos,b,c+1,pass);
    }
    /**
     * Main function
     */
    public static void main(String args[]) throws IOException{

        BufferedReader f = new BufferedReader(new FileReader("beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
        int len = Integer.parseInt(new StringTokenizer(f.readLine()).nextToken());
        String s = new StringTokenizer(f.readLine()).nextToken();

        int max = 0;
        for(int i = 0;i<len;i++){
            int firstpass = count(s,len,i,s.charAt(i),0,-1);
            int secondpass = firstpass == len? 0:count(s,len,i+firstpass,s.charAt((i+firstpass)%len),0,i);
            if(firstpass + secondpass > max)
                max = firstpass + secondpass;
        }

        out.println(max);
        out.close();
        System.exit(0);

    }
}