package example;

class MCFICIB
{
   static int x = 10;

   static double temp = 98.6;

   static
   {
      System.out.println("x = " + x);
      temp = (temp - 32) * 5.0/9.0; // convert to Celsius
      System.out.println("temp = " + temp);
   }

   static int y = x + 5;

   static
   {
      System.out.println("y = " + y);
   }

   public static void main(String[] args)
   {
   }
}