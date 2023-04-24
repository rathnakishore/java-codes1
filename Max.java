//calculate the max, min, sum, avg of an array using lambda expression

interface ArrayLam
{
int func(int n);
}

public class Max
{  
public static void main(String[] args) 
{  
ArrayLam Maxi= (ar)->
{
int[]arr = new int[]{25,11,7,75,56};  
int max = arr[0];  
for(int i=0; i<arr.length;i++) 
{  
if(arr[i] > max)  
max = arr[i];  
}
};
System.out.println("Maximum is " + max);  
}  
}  
