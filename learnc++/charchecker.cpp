#include <iostream>
#include <cctype>
using namespace std;
string s;
int main() {
  cin >> s;
  bool upper = false; 
  bool lower = false; 
  for (char c: s) {
    if(isupper(c)){
        upper = true;
    }else if(islower(c)){
        lower = true;
    }
  }
    if(upper&&lower) cout << "Mixed";
    else if(upper) cout <<"All Capital Letter";
    else cout << "All Small Letter";
}