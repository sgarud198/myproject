import java.util.Scanner;
 
class AddNumbers
{
   public static void main(String args[])
   {
      int x, y, z;
 
      System.out.println("Enter two numbers to calculate their sum: ");
      Scanner sc = new Scanner(System.in);
     
      x = sc.nextInt();
      y = sc.nextInt();
      z = x + y;
     
      System.out.println("Sum of the integers = " + z);
   }
}