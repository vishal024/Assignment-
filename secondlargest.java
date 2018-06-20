import java.util.Scanner;
class Array
{
  public static void main(String[] args)
{ 
   int i;
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
int secondlargest=a[0];
int largest=a[0];
  for(i=0;i<n;i++)
  {
    if(a[i]>largest)
   {
      secondlargest=largest;
      largest=a[i];
    }
  }
  System.out.println("Second largest number in array is:"+secondlargest);  
}
} 