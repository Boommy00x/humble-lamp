#include <iostream>
using namespace std; 
int main(){
    int count = 0;
    int num = 0;
    do{
        cout<<"Enter num plase enter num more than 0 :";
        cin>>num;
    }while(num<0); //ออกเงื่อนไขเมื่อnum>0
    cout <<num<<endl;
    while(count < 10){
        cout <<"Count = "<<count<<endl;
        count += 1;
    }

}