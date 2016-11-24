package CoreJava.Applet;

import java.awt.*;
import java.applet.*;

import java.applet.*;
import java.awt.*;
import java.util.*;

public class ClockApplet extends Applet implements Runnable{
   Thread t,t1;
   public void start(){
      t = new Thread(this);
      t.start();
   }
   public void run(){
      t1 = Thread.currentThread();
      while(t1 == t){
         repaint();
         try{
            t1.sleep(1000);    
         }
         catch(InterruptedException e){}
      }
   }
   public void paint(Graphics g){
      Calendar cal = new GregorianCalendar();
      String hour = String.valueOf(cal.get(Calendar.HOUR));
      String minute = String.valueOf(cal.get(Calendar.MINUTE));
      String second = String.valueOf(cal.get(Calendar.SECOND));
      if(Integer.valueOf(second)<10)
    	  second = "0"+second;
    	  
      g.drawString(hour + ":" + minute + ":" + second, 20, 30);
   }
}