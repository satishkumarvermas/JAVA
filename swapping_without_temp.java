import java.util.Scanner;

class swapping without temp
{
  public static void main(String[] args) 
  {
    int a , b ;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("Before Swapping");
    System.out.println("value of A:"+a);
    System.out.println("value of B:"+b);
    System.out.println("After Swapping");
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("value of A:"+a);
    System.out.println("value of B:"+b);
  }
}
