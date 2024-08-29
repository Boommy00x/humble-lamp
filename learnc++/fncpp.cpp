#include <iostream>
#include <string>
using namespace std;

int sum(int a,int b){
   return a+b;
}
float areaOfCircle(float raduis){
    return 3.1415 * raduis * raduis;
}
int main(){
    int Sum = sum(5,6);
    cout<<Sum<<endl;
    double areaCircle = areaOfCircle(2);
    cout<<areaCircle<<endl;
    return 0;
}