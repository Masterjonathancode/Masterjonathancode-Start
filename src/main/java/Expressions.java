public class Expressions{
  boolean A = true;
  boolean B = false; 
}
// Boolean class assignments denoted as either true or false.// 
class Bool1{ 
  public static void main(String args[]){

// these are boolean variables     
     boolean A = true;
     boolean B = false; 
     if(A|B)
     System.out.println("A|B = "+(A|B));
     else if(A&B)
     System.out.println("A&B = "+(A&B));
     System.out.println("==A = "+(A));
     System.out.println("==B = "+(B));
     if(!A)   
     System.out.println("!A = "+(!A));
     System.out.println("!=A = "+(B));
     if(A^B)
     System.out.println("A^B = "+(A^B));
     else if(A|B&A)
     System.out.println("(A|B)&A = "+((A|B)&A));
     else
     System.out.println("!=B = "+(A));   
     }
     
}
//This program prints out the Java boolean logical operators with logical conditions of if,else if, and else statements.// 