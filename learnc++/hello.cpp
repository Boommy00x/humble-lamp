#include <iostream>
using namespace std; // ประกาศstd เป็นglobal
int main(){

int ageNew=0,sumAge=0;
int count;
cout << "ระบุจำนวนครั้งในการบวกอายุ:";
cin >> count;
for(int i=0;i<count;i++){
cout <<"กรุณาพิมพ์อายุครั้งที่ "<<i+1<<": ";
cin >> ageNew;
sumAge = sumAge +ageNew; // บวกหาผลรวมโดยใช้ ตัวแปร1ตัวในการหาผลรวม
}
cout << "ผลรวมอายุ =" << sumAge << endl;

char fav;
cout << "จงบอกอักษรที่ชอบมา :";
cin >> fav;
cout << "ตัวอักษณที่คุณชอบคือ " << fav << endl;
return 0;

}