import java.util.Scanner;
class Complex
{
  int real,imag,complexnumber;
  public void Display(int r,int i)
   {
     real=r;
     imag=i;
     System.out.println("Complex number is:"+real+"+"+imag+"i");
   }
public static void main(String[] args)
{
  Complex c=new Complex();
  Scanner s=new Scanner(System.in);
  System.out.println("enter the real part");
  int r=s.nextInt();
  System.out.println("enter the imaginary part");
  int i=s.nextInt();
  c.Display(r,i);
}
}

