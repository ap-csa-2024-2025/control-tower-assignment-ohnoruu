import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
   // Complete the code below
   
   // TODO: Create Airplane 1 and 2
   Airplane airplane1 = new Airplane("AAA01", 1, 0, 0);
   Airplane airplane2 = new Airplane("AAA02", 15.8, 128, 30000);
   // TODO: Create a Scanner
   Scanner sc = new Scanner(System.in);
   // TODO: Getting inputs for Airplane 3
   System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");
   String plane3Sign = sc.nextLine();
   double plane3Dist = sc.nextDouble();
   int plane3Bearing = sc.nextInt();
   int plane3Alt = sc.nextInt();
   // TODO: Create Airplane 3 from inputs
   Airplane airplane3 = new Airplane(plane3Sign, plane3Dist, plane3Bearing, plane3Alt);
   // TODO: Print the initial positions
   System.out.println("\nInitial Positions:");
   System.out.println(airplane1.toString());
   System.out.println(airplane2.toString());
   System.out.println(airplane3.toString());
   // TODO: Print initial distances 
   System.out.println("\nInitial Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + airplane1.distTo(airplane2) + " miles");
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + airplane1.distTo(airplane3) + " miles");
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + airplane2.distTo(airplane3) + " miles");
   
   // TODO: Print initial height differences
   System.out.println("\nInitial Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + (airplane1.getAlt() - airplane2.getAlt()));
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + (airplane1.getAlt() - airplane3.getAlt()));
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + (airplane2.getAlt() - airplane3.getAlt()));
   
   // TODO: Airplane 1 changes
   airplane1.move(airplane2.distTo(airplane3), 65);
   airplane1.gainAlt();
   airplane1.gainAlt();
   airplane1.gainAlt();
   // TODO: Airplane 2 changes
   airplane2.move(8.0, 135);
   airplane2.loseAlt();
   airplane2.loseAlt();
   // TODO: Airplane 3 changes
   airplane3.move(5.0, 55);
   airplane3.loseAlt();
   airplane3.loseAlt();
   airplane3.loseAlt();
   airplane3.loseAlt();
   // TODO: Print new positions of airplanes
   System.out.println("\nNew Positions: ");
   System.out.println(airplane1.toString());
   System.out.println(airplane2.toString());
   System.out.println(airplane3.toString());
   // TODO: Print new distances between airplanes
   System.out.println("\nNew Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + airplane1.distTo(airplane2) + " miles");
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + airplane1.distTo(airplane3) + " miles");
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + airplane2.distTo(airplane3) + " miles");
   
   // TODO: Print new heights between airplanes
   System.out.println("\nNew Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + (airplane1.getAlt() - airplane2.getAlt()));
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + (airplane1.getAlt() - airplane3.getAlt()));
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + (airplane2.getAlt() - airplane3.getAlt()));
  }
}
