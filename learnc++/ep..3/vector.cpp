#include <iostream>
#include <vector>
using namespace std;


int main(){

vector<int> vec; //declare var
//vec.push_back（20） = ต่อ array Ex.[10] -> [10，20]
//vec.pop_back()= เอาตัวสุดท้ายออก
//vec.size()； = ขนาด
vector<long> arrvec(4,0); // x = ขนาด,y=ข้อมูล
    for(int i =0;i<arrvec.size();i++){
        cout << arrvec[i]+i<<" "; // or change to be ** arrvec.at(i) **
    }
    cout<<endl;
    
    cout<<"Size of vec array : "<< arrvec.size()<<" Capacity"<<arrvec.capacity()<<endl;
    // capacityความจุที่vectorทำการจอง ใช้้ร่วมกับ .reserve(ขนาด) คือการจองพื้นที่ /.resize();เปลี่ยนsize;
    
}

