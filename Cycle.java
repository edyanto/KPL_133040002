/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

/**
 *
 * @author bangED
 */
public class Cycle {
 private final int balance;
 private static final Cycle c = new Cycle();
 // Random Deposit
 private static final int deposit = (int) (Math.random() * 100);
 public Cycle() {
 // Subtract processing fee
 balance = deposit - 10;
 }
 public static void main(String[] args) {
 System.out.println("The account balance is: " + c.balance);
 }
}