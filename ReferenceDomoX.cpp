#include<iostream>
using namespace std;



int main()
{
  //We can creaste one Reference to one variable

  int no =11;
  int &x =no;

  //We can create multiple References for single variable

  int &y =no;

  //We can create Reference to Reference

  int &z =y;

  //We can create Reference to Pointer

  int *p =&no;
  int *(&q)=p;
  

  

    return 0;
}