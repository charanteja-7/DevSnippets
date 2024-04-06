#include <bits/stdc++.h>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int t;
    cin>>t;
    while(t--)
    {
        int f=0;
        string s;
        cin>>s;
        map<char,int>m;
        for(int i=0;i<s.length();i++)
        {
            if(m.find(s[i])!=m.end()){
            cout<<s[i]<<endl;
            f=1;
            break;}
        // m[s[i]];
        }
        if(f!=1)
        cout<<'.'<<'\n';
    }
    return 0;
}
