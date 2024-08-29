#include <iostream>
#include <string>
using namespace std;


int main(){
    int age;
    cout<<"คุณอายุเท่าไหร่";
    cin>>age;
    if(age>=18 && age <=60){
        cout<<"คุณอายุมากกว่า18ปีและน้อยกว่า60ปี"<<endl;
    }else if(age>60){
        cout<<"คุณอายุมากกว่า60"<<endl;  
    }else{
        cout<<"คุณอายุน้อยกว่า18"<<endl;
    }


}