//Author  : Vaishnavi Sheoran.
//Date      : 12/03/2020.
//Purpose: Returning the roots of quadratic equation.


import java.io.*;
class qdEqn
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the value of a");
double res,x1,x2,a,b,c;
a=Double.parseDouble(br.readLine());
System.out.println("Enter the value of b");
b=Double.parseDouble(br.readLine());
System.out.println("Enter the value of c");
c=Double.parseDouble(br.readLine());
System.out.println();
System.out.println();
res=Math.sqrt((b*b)-(4*a*c));
x1=(-b+res)/2*a;
x2=(-b-res)/2*a;
System.out.println("a="+a+"   b="+b+"    c="+c);
System.out.println("The roots are "+x1+" and "+x2);
}}