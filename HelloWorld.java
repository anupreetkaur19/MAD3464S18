/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnupreetKaur
 */
public class HelloWorld {
    public static void main(String args[]){
        System.out.println("HelloWorld");
        int n1 = 10;
        float f1 = 10.5f;
        double d1 = 12.34546677;
        short s1 = 12;
        char c1 = 'a';
        String str1 = "Java";
                boolean b1 = true;
                System.out.println("value of n1 is" + n1);
    System.out.println("value of f1 is" + f1);
    System.out.println("value of d1 is" + d1);
    
    System.out.println("value of s1 is" + s1);
    System.out.println("value of c1 is" + c1);
    System.out.println("value of str1 is" + str1);
    n1 *= 20;
    System.out.println("value of n1 is" +n1);
    n1++;
    System.out.println("value of n is"  +n1);
    ++n1;
    System.out.println("value of n1 is" +n1);
    n1--;
    System.out.println("value of n1" +n1);
    int n2 = n1++;
     System.out.println("value of n is"  +n2);
      System.out.println("value of n is"  +n1);
      c1 = 'A';
 System.out.println("value of c is"  +c1); 
  System.out.println("value of n is" + (n1+10));
  System.out.println("value of c is"  +(char) (c1 + 10));
  System.out.println("value of c is"  + ++c1);
  System.out.println("value of c is"  + c1++);
    }
    
    
}
