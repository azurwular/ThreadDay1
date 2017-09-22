/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadd1.ex2;

/**
 *
 * @author Dell
 */
public class Excercise2
{
    

    public static void main(String[] args)
    {
        Even e = new Even();
        
        Thread t1 = new Thread (() ->
          {
            
            for (int i = 0; i<1000; i++)
              System.out.println("t1 = " + e.next());
          }        
        );
        
        Thread t2 = new Thread(() ->
          {
            for (int i = 0; i<1000; i++)
              System.out.println("t2 = " + e.next());
          });
        
        
        t1.start();
        t2.start();
        
        
        
    }
}
