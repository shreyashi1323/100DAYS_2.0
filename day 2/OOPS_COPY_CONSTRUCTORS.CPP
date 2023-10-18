//COPY CONSTRUCTORS: Among different types of constructors, the copy constructor is the type that uses another object 
//within the same class to initialize the data members of the class within the class. In other words, it creates a copy of an existing object of the class.

#include<iostream>
 using namespace std;

 class hero{
  public :
      char level;
  private:
    int health;
  hero(){
  cout<<"default construuctor called"<<endl;
  }

  int gethealth(){
  return health;
  }

  void print(){
  cout<<"health"<<health<<endl;
  }
  char getlevel(){
  return level;}

   void sethealth(int h){
   health =h;}

   void setlevel(char ch){
   level=ch;}
 };
 int main(){
     hero suresh;
     suresh.sethealth(70);
     suresh.setlevel('c');

 return 0;}
