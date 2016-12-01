/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

/**
 *
 * @author bangED
 */
public class CycleNN {
    private final int balance;
 // Random Deposit
 private static final int deposit = (int) (Math.random() * 100);
 // Inserted after initialization of required fields
 private static final CycleNN c = new CycleNN(); 
 public CycleNN() {
 // subtract processing fee
 balance = deposit - 10;
 }
 public static void main(String[] args) {
 System.out.println("The account balance is: " + c.balance);
 }
}
