#include <bits/stdc++.h>
using namespace std;
int numIdenticalPairs(vector<int>& nums) 
{
    int res = 0;
    unordered_map<int, int> count;
    for (int a: nums) 
    {
        res += count[a]++;
    }
  
    return res;
}
int main() 
{
    vector<int> nums={1,2,3,1,1,3};
  
  cout<<numIdenticalPairs(nums)<<endl;
  return 0; 
}
