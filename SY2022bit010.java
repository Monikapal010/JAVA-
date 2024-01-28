import java.util.Scanner;
public class SY2022bit010
{
public static int task1(int a[])
{
 System.out.println(a[0]);
 return a[0];
}
public static int task2(int a[])
{	
 System.out.println(a[4]);
 return a[1];
}
public static int task3(int a[])
{	
 System.out.println(a[3]);
 return a[3];
}
public static int task4(int a[])
{
 int sum;	
 System.out.println(sum=a[0]+a[1]+a[2]+a[3]+a[4]);
 return sum;
}
public static void main(String[] args)
{
  int a[]={2,3,4,1,5};
        task1(a);
        task2(a);
        task3(a);
        task4(a);
       
}
}
