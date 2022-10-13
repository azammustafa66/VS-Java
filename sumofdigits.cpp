#include<iostream>
using namespace std;
int main() {
    int n;
    cout<<"Enter an integer: "; cin>>n;
    int r,sum=0; int original=n;
    while(n!=0) {
        r=n%10;
        sum+=r;
        n/=10;
    }
    cout<<"The sum of digits of "<<original<<" is "<<sum;
}