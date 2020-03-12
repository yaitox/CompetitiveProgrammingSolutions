#include <bits/stdc++.h>


using namespace std;

int main(){
ios::sync_with_stdio(false);
cin.tie(0);
cout.precision(10);
cout<< fixed;
int t,n,p1,p2;
string p;
cin>>t;
while(t--){
 cin>>n;
 cin>>p1>>p2;
 cin>>p;
 if(p.compare("Alice")==0){
  if(p1>p2){cout<<"ALICE"<<'\n';}
  else{cout<<"CARL"<<'\n';}
 }
 else if(p.compare("Carl")==0){
    if(p1>p2){cout<<"CARL"<<'\n';}
  else{cout<<"ALICE"<<'\n';}
 }
}
return 0;
}
