import java.util.Scanner;

class array
{
public static void main(String[] args)
{
 int myarray[][][]= new int[3][4][5];
 int i,j,k;
 for(i=0;i<3;i++)
  for(j=0;j<3;j++)
   for(k=0;k<3;k++)
   myarray[i][j][k]=i*j*k;
   for(i=0;i<3;i++){
  for(j=0;j<3;j++){
   for(k=0;k<3;k++){
   System.out.print(myarray[i][j][k]+"");
   System.out.println();
   }
   System.out.println();
   }
   }
   }
}