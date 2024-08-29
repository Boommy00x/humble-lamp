#include <iostream>
#include <vector>
using namespace std;

int main(){
        vector<int> vec ={2,4,6,8};

        vector<int>::iterator it = vec.begin();

        cout << "First Element " <<*it <<endl;
        *it =20;
        cout << "Added Element " <<vec[0] <<endl;

//         cout << "AddeElement " ;
//         fot(vector<int>::iterator i = vec.begin();;test!=vec.end();++test){
//             cout<<*test<<" ";
//         }
//         cout <<endl;
    it =vec.begin()+2; // shift position for 3 index
    vec.insert(it,5);
    vec.erase(it);

    //rage based for loop
    for(int elem : vec){ //ลูปไปทีละตัวแต่ละaddressที่อยู่ทางขวาออกมา
        cout << elem<<" ";
    }
}