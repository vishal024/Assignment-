import java.util.Scanner;
class Rectangle
{
 int length,breadth,area;
 public void CalculateArea(int l,int b)
 { 
    length=l;
    breadth=b;
    area=length*breadth;
    System.out.println("Area of Reactangle is:"+area);
  }
 public static void main(String[] args)
{ 
   Rectangle A=new Rectangle();
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the length");
   int l=sc.nextInt();
   System.out.println("enter the breadth");
   int b=sc.nextInt();
   A.CalculateArea(l,b);
}
}
   
   