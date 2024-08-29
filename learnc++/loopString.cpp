#include<iostream>
#include<string>
using namespace std;
int main(){
    
    string name;
    cout << "Your Name :";
    cin>>name;
    for(int i=0;i<name.length();i++){
        cout<<name[i]<<endl;
    }
    // cout<<"lenght of your name =" <<name.length();//lengthคือfnในการวัดความยาว
}