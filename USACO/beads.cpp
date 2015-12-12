/*
ID: krishak1
LANG: C++
TASK: beads
*/

#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int count(string *beads, int *length,int *pos,char b,int c, int *pass){
	int d = (c+(*pos)+1)%(*length);
	if(d-1 == (*pass) || c == (*length))
		return c;
	char x = (*beads).at(d);
	if(b!='w' && b!=x && x!='w')
		return c+1;
	if(b=='w')
		return count(beads,length,pos,x,c+1,pass);
	return count(beads,length,pos,b,c+1,pass);
}

int main() {
    ofstream fout ("beads.out");
    ifstream fin ("beads.in");
    int len;
    string s;

    int max=0,i; 

    fin >> len;
    fin >> s;


    for(i=0;i<len;i++){
        int pass = -1;
    	int firstpass = count(&s,&len,&i,s.at(i),0,&pass);
    	int secondpass = 0;
        if(firstpass != len){
            int internalVar = i+firstpass;
            pass = i;
            secondpass = count(&s,&len,&internalVar,s.at(internalVar%len),0,&pass);
        }
    	if(firstpass+secondpass > max)
    		max = firstpass+secondpass;
    }

    fout << max << endl;
    return 0;
}