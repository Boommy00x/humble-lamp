#include <iostream>
using namespace std;

int main(){
    long long factorial = 1;
    int ip;
    cout<<"Enter Number for calculating factorial :";
    cin>> ip;
    if(ip<0){
        cout<<"Error for calculating factotial"<<endl;
    }else{
        for(int i=1;i<=ip;i++){
            factorial *= i;
        }
        cout <<"factorial of input "<<ip<<" = "<<factorial<<endl;
    }
    return 0;
}