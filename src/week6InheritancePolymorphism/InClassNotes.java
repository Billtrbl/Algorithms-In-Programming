package week6InheritancePolymorphism;

public class InClassNotes {

	/*
	 * A child can override the parent's method with
	 * 
	 * Child class can pull method from parent's class
	 * 
	 * Parent class CANNOT pull method from the child's class
	 * 
	 * Superclass - 
	 * 
	 * Override annotation should be placed before the method in child's class
	 * 
	 * Override = to overwrite parent's method
	 * 
	 *        --- @Override ---
	 *        ---   METHOD  ---
	 *        
	 *        
	 * 3 Classes :
	 *              A Super Class
	 *              { Super.constructor }
	 *              
	 *              A Sub Class extends A Super Class
	 *              { Sub.constructor }
	 *              
	 *              Demo Constructor
	 *              { A Sub Class child = new A Sub Class }
	 *              
	 *              Will execute super class constructor first then the sub's constructor will follow after
	 *              
	 *              keyword --- "super" --- first
	 *              
	 *              some method || this.method
	 *              
	 *              child uses some method if it's not overriden
	 *              
	 *              super call from parent
	 *              
	 *              this.method call from child
	 *              
	 *              super method can call from both
	 *              
	 *              
	 *              
	 *              
	 *              
	 *              ---------------------------------------------------------------------------------------
	 *              
	 *              |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	 *              
	 *              =======================================================================================
	 *              
	 *              |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	 *              
	 *              ---------------------------------------------------------------------------------------
	 *              
	 *              
	 *              
	 *         public class Customer
	 *         {
	 *              private int idNumber;
	 *              private double balanceOwed;
	 *              public Customer(int, id, double bal)
	 *              (
	 *              	idNumber = id;
	 *              	balancedOwed = bal;
	 *              )
	 *              public void display()
	 *              {
	 *              	System.out.println("Customer #" + idNumber + " Balance $" + balanceOwed);
	 *              }
	 *         }
	 *         
	 *         public class PreferedCustomer extends Customer
	 *         {
	 *             double discountRate;
	 *             public PreferredCustomer(int id, double bal, double rate)
	 *             {
	 *                 super(id, bal);
	 *                 discountRate = rate;
	 *             }
	 *             @Override
	 *             public void display()
	 *             {
	 *                 super.display();
	 *                 System.out.println("Discount rate is " + discountRate);
	 *             }
	 *         }
	 *         
	 *         public class testCustomers
	 *         {
	 *             public static void main(String[] args)
	 *             {
	 *                 Customer oneCust = new Customer(123, 123.45);
	 *                 PreferredCustomer onePCust = new 
	 *                     PreferredCustomer(125, 3456.78, 0.15);
	 *                 oneCust.display();
	 *                 onePCust.display();
	 *             }
	 *         }
	 *         
	 *         
	 *         
	 *         
	 *         --------------------------------------------------------------------------------------------------------------
	 *         
	 *         
	 *         
	 *         
	 *         public class Students
	 *         {
	 *             private int idNum;
	 *             private double gpa;
	 *             
	 *             public int getIDNum()
	 *             {
	 *                 return idNUm;
	 *             }
	 *             
	 *             public double getGpa()
	 *             {
	 *                 return gpa;
	 *             }
	 *             
	 *             public void setIdNum(int num)
	 *             {
	 *                 idNum = num;
	 *             }
	 *             
	 *             public void setGpa(double gradePoint)
	 *             {
	 *                 gpa = gradePoint;
	 *             }
	 * 
	 * 
	 */
}
