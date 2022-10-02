#include<iostream>
using namespace std;

int main() {

double a,b,res; char op;

cout<<"Enter first number: \n"; cin>>a;
cout<<"Enter second number: \n"; cin>>b;
cout<<"Select an operand(+,-,*,/): \n"; cin>>op;
switch (op)
{
case '+': res=a+b;
            cout<<"Result is " << res;
    break;
case '-': if (a>b)
{
    res=a-b;
    cout<<"Result is " << res;
    break;
}
else 
{
    res=b-a;
    cout<<"Result is " << res;
    break;
}
case '*': res=a*b;
          cout<<"Result is " << res;
        break;
case '/': res=a/b;
            cout<<"Result is " << res;
        break;                   
default: cout<<"Enter a valid operator \n"; 
    break;  
    return 0;
}
}