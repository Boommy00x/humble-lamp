#include <iostream>
using namespace std;

int main(){
    int num[] = {1,2,3,4,5}; //ประกาศแบบกำหนดค่า
    int numm[5];//ประกาศแบบกำหนดแค่ขนาด
    int sum=0,count;

   for(int i =0; i<5;i++){
     cout<< "กรุณาใส่ตัวเลข "<<i+1<<" เข้ามา: ";
     cin>>numm[i];
     sum +=numm[i];
   }

    for(int i = 0; i <5;i++){
      cout<<"เลขครั้งที่ "<<i+1<<" = "<<numm[i]<<endl;
    }
   cout <<"ผลรวม = "<<sum;
}

