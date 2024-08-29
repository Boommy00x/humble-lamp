#include <iostream>
#include <vector>
using namespace std;

class Solution{
public:
    vector<int> twoSum(vector<int> &nums, int target){

        for(int i=0; i<nums.size(); i++){
            cout << "Index = "<< i <<","<<nums[i]<<endl;
        }
        return {1,2};

    }
};

int main(){
  Solution s; //Inheritance   
  vector<int> input = {2,7,11,15};
  int target = 9;
  vector<int> result = s.twoSum(input, target);//calling fn/method from class Solution

 for(int i=0;i<result.size();i++){
    cout << result[i] <<endl;
 }
  
}





