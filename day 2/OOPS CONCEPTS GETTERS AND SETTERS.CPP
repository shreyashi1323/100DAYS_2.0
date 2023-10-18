#include<iostream>
using namespace std;
class marvel{
private:
    int health;
//private variables can only be accessed inside the class
//. therfore we use getters and setters for it
public :
    char level;

void print(){
cout<<level<<endl;
}
//getters and setters
int gethealth(){
    return health;
}
char getlevel(){
return level;}

void sethealth(int h){
health = h;}

void setlevel(char ch){
    level=ch;
}
    };

int main(){

    marvel witch;
    cout<<sizeof(marvel)<<endl;
    cout<<sizeof(witch)<<endl;
    //witch.sethealth(55);
    witch.level='A';
    cout<<"witch health is"<<witch.gethealth()<<endl;
    cout<<witch.level<<endl;

return 0;}
