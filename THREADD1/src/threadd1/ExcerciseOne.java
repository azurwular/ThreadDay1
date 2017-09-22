/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadd1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class ExcerciseOne
{
    public static void main (String args [])
    {
        long start = System.currentTimeMillis();
        long end = start + 10000;
        boolean[] shouldRun = {true};
     
            Thread t1 = new Thread(() -> 
            {
              long sum = 0;
              for (long i = 1; i <= 1e8; i++)
                {
                    sum = sum + i;
                }
                System.out.println("t1 = " + sum);
            });
            
            Thread t2 = new Thread(() ->
              {
                for (int i = 1; i<=5; i++)
                  {
                      System.out.println("t2 = " + i);
                    try
                      {
                        Thread.sleep(2000);
                      } catch (InterruptedException ex)
                      {
                        Logger.getLogger(ExcerciseOne.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
              });
            
            Thread t3 = new Thread(() ->
            {
                    int i = 10;
                    do
                      {
                          System.out.println("t3 ="+i);
                          i++;
                           try
                          {
                            Thread.sleep(3000);
                          } catch (InterruptedException ex)
                          {
                            Logger.getLogger(ExcerciseOne.class.getName()).log(Level.SEVERE, null, ex);
                          }

                      }
                    while(shouldRun[0]);
                    
              });


            t1.start();
            t2.start();

            t3.start();
            
            while(System.currentTimeMillis() < end)
            {
              
            }
            shouldRun[0] = false;
            
        
        }
    }


