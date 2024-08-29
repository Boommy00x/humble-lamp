#include <iostream>
using namespace std;

int main(){
    int min,max,num;
     cin >> num;
    min=max=num; 
    for(int i=0;i<5;i++){
        cin >> num;
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
    }
    cout << min<<endl;
    cout << max;
}