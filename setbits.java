

import java.util.*;

class setbits
{
static int setbits(int n)
{
int count=0;
while(n>0)
{
n&=(n-1);
count++;
}
return count;
}
public static void main(String[] args)
{
int i=9;
System.out.println(i);
}
}
wap to find non repeating char in a string 
wap to check whether 2 string are anagram of each other
wap to sort an array by increasing frequency
wap to reverse linklist without actually reversing it
