#include <iostream>
using namespace std;

int main(){

    int score = 0;
    
    cout<<"กรุณาระบุคะแนนของคุณเพื่อคำนวณ Grade :";
    cin >> score;

    if(score>=80 && score<100){
        cout <<"Grade = A";
    }else if (score>=70 && score<80){
        cout <<"Grade = B";
    }else if(score>=60 && score<70){
        cout <<"Grade = C";
    }else if(score>=50 && score<60){
        cout <<"Grade = D";
    }else if(score>=0 && score<50){
        cout <<"Grade = F";
    }else{
        cout <<"Error Condition"; //ถ้าข้อมูลเป็นติด- เพราะว่าตัวแปรเป็นชนิดจำนวนเต็ม โดยจน.เต็มมี2แบบ เต็ม+,-
    }
}
