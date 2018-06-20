import java.util.Scanner;
class Array
{
  public static void main(String[] args)
{ 
   int i,j,temp;
  Scanner s=new Scanner(System.in);
  System.out.println("enter the no. of elements for array");
  int n=s.nextInt();
  int a[]=new int[n];
  System.out.println("enter elements");
  for(i=0;i<n;i++)
  {
    a[i]=s.nextInt();
  }
  System.out.print("Array elements are");
  for(i=0;i<n;i++)
  {  
   System.out.println(a[i]);
   }
 for(i=0;i<n;i++)
   {
      for(j=i+1;j<n;j++)
         {
             if(a[i]>a[j])
             {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
        }
    }
for(i=0;i<n-1;i+=2)
{
    temp=a[i];
    a[i]=a[i+1];
    a[i+1]=temp;
}
System.out.println("after rearrange array is:");
 for(i=0;i<n;i++)
{
System.out.println(a[i]);
} 
}
}   