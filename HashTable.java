/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author ASUS
 */
public class HashTable {
    public static void main(String args[]) {
      // Create a hash map
      Hashtable balance = new Hashtable();
      Enumeration names;
      String str;
      double bal;

      balance.put("Indah", new Double(3434.34));
      balance.put("Rahmah", new Double(123.22));
      balance.put("Liska", new Double(1378.00));
      balance.put("Aulia", new Double(99.22));
      balance.put("Ainun", new Double(-19.08));

      // Show all balances in hash table.
      names = balance.keys();
      while(names.hasMoreElements()) {
         str = (String) names.nextElement();
         System.out.println(str + ": " +
         balance.get(str));
      }
      System.out.println();
      // Deposit 1,000 into Zara's account
      bal = ((Double)balance.get("Indah")).doubleValue();
      balance.put("Indah", new Double(bal+1000));
      System.out.println("Indah's new balance: " +
      balance.get("Indah"));
   }
    
}