import java.util.Scanner;
public class IT24102983Lab7Q3{
  public static void main(String[] args){
  final double discountRate = 0.05;
  double discount = 0;
  Scanner n = new Scanner(System.in);

  for(int i = 1; i <= 5; i++){
    System.out.println("Customer" + i);
    System.out.print("Enter total bill amount:");
    double bill = n.nextDouble();

  System.out.print("Enter mode of payment (C for cash, O for other):");
  char mode = n.next().toUpperCase().charAt(0);

  if(mode == 'C'){
    discount = bill * discountRate;
    double toPay = bill - discount;

    System.out.println("Discount is:" + discount);
    System.out.println("Amount to be paid:" +toPay);}

 else if(mode == 'O'){
   double toPay = bill;
   System.out.println("No discount applicable");
   System.out.println("Amount to be paid:" +toPay);}

 else{
   System.out.println("Payment mode is not valid");
   System.out.println();
   continue; }

 System.out.println();
  }
 }
}

  
  