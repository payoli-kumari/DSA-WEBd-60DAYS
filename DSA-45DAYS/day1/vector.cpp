#include <iostream>
#include <vector>
using namespace std;

int main() {
    // INITIALIZE VECTOR 
        // vector<int> vec={1,2,3,4,5};
    
    // ALL VALUE ARE SAME
         vector<int> vec(3,10);

    // INITIALIZE VECTOR 2 USINF 1
         vector<int> vec1={1,2,3,4,5};

         vector<int> vec2(vec1);

         for (int val : vec2){
            cout <<val <<" ";
         }

    // vector<int> vec;   //size=0

    // vec.push_back(1);
    // vec.push_back(3);
    // vec.push_back(5);
    // vec.push_back(6);
    // vec.push_back(4);
    // vec.push_back(9);
    // vec.push_back(2);

    // vec.pop_back();
    // vec.pop_back();


    // vec.emplace_back(10);
       

    // cout << vec.size() << endl;   //size=3
    // cout << vec.capacity() << endl;    //capacity=4
    // cout <<"value at index 2=" << vec[2]<< endl;
    // cout <<"front=" << vec.front() << endl;
    // cout <<"back=" << vec.back() << endl;
    return 0;
}
