#include <iostream>
#include <string>
using namespace std;

int main(){
    string name;
    cout<<"name of you:";
    cin>>name;
    cout<<"name:"<<name<<endl;
    char Ch = name[0]; //[คือindexหรือตำแหน่งเริ่มจาก0]
    cout<<"index 0 of char in String = "<<Ch<<endl;

}