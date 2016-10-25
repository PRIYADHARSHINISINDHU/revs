import java.io.*;
import java.util.*;
class reverse
{
public static void main(String[] args)
{
int n,reve=0,rem=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number to be reverse:");
n=s.nextInt();
while(n!=0)
{
rem=n%10;
reve=reve*10+rem;
n=n/10;
}
System.out.println("The reversed number is:"+reve);
}
}
