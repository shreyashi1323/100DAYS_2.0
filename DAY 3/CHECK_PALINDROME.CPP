#include<iostream>
using namespace std;
bool palin(string str, int i, int j){
if(i>j)
    return true;
 if(str[i]!=str[j])
        return false;
 else{
    return palin(str, i+1,j-1);
 }
}


int main(){
   string name="ababa";
    bool ans= palin(name, 0, name.length()-1);

    if(ans){
        cout<<"haa dude...palindrome nikla ye toh!!";
    }
    else{
        cout<<"palindrome ka mtlb pta bhi h?";
    }
return 0;}
