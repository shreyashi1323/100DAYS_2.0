//constructors: invoked at the time to object creation
//it doent have any return type
//it also doesnt have any input parameter

#include<iostream>
using namespace std;

class nezuko{
    public:
nezuko(){
cout<<"constructor called"<<endl;
}
};

int main(){
    //object created statically
    cout<<"namaste"<<endl;
  nezuko demon;
  cout<<"boodgye"<<endl;

  //creating object dynamically
  nezuko *n= new nezuko;
return 0;}
