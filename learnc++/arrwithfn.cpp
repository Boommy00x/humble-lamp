#include <iostream>
using namespace std;

int* creatArray(int size){
    int* arr = new int[size]; //Dynamic allocate memmory

    for(int i=0;i<size;i++){
        arr[i] = i * i;
    }
    return arr;
}   

int main(){
    int size = 5;
    int *myArr = creatArray(size);

    cout << "Array elements :";
    for(int i =0;i<size; ++i){
        cout << myArr[i]<<" ";
    }
    cout << endl;

    delete[] myArr; //delete the allocated

    return 0;
}