/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AI小政
 */
import java.awt.*;  
import java.applet.*;  
import java.awt.event.*;  
import javax.swing.*;  
public class ChatApplet extends Applet implements MouseListener,Runnable  
{ int x,y;  int top,point;  
/***对小程序进行变量和颜色的初始化。*/   
public void init()  {    x = 0;    y = 0;     
//设置背景色为黑色  
setBackground(Color.black);   
addMouseListener(this);  
} public void paint(Graphics g)  {    }   
/** *使该程序可以作为应用程序运行。 */  
public static void main(String args[])   
{    ChatApplet applet = new ChatApplet();   
JFrame frame = new JFrame("TextAreaNew");    
frame.addWindowListener(new WindowAdapter()  
{       
    public void windowClosing(WindowEvent e){  
        System.exit(0);     
    }    });   
frame.getContentPane().add(      applet, BorderLayout.CENTER);   
frame.setSize(800,400);   
applet.init();   
applet.start();   
frame.setVisible(true);   
}  /***程序主线程，对一个烟花进行绘制。*/   
public void run()   
{    
    //变量初始化  
    Graphics g1;   
    g1 = getGraphics();   
    int y_move,y_click,x_click;   
    int v;   
    x_click = x;   
    y_click = y;   
    y_move = 400;  
    v = 3;  int r,g,b;  
    while(y_move > y_click)   
    {      
        g1.setColor(Color.black);  
        g1.fillOval(x_click,y_move,5,5);   
        y_move -= 5;     
        r = (((int)Math.round(Math.random()*4321))%200)+55;     
        g = (((int)Math.round(Math.random()*4321))%200)+55;    
        b = (((int)Math.round(Math.random()*4321))%200)+55;    
        g1.setColor(new Color(r,g,b));  
        g1.fillOval(x_click,y_move,5,5);    
        for(int j = 0 ;j<=10;j++)    
        {      
            if(r>55) r -= 20;     
            if(g>55) g -= 20;   
            if(b>55) b -=20;    
            g1.setColor(new Color(r,g,b));   
            g1.fillOval(x_click,y_move+j*5,5,5);    
        }     
        g1.setColor(Color.black);    
        g1.fillOval(x_click,y_move+5*10,5,5);    
        try     {        Thread.currentThread().sleep(v++);   
        }   
        catch (InterruptedException e) {}    
    }      
    for(int j=12;j>=0;j--)    
    {     
        g1.setColor(Color.black);   
        g1.fillOval(x_click,y_move+(j*5),5,5);  
        try     {      
            Thread.currentThread().sleep((v++)/3);   
        }   
        catch (InterruptedException e) {}  }  
    y_move = 400;  g1.setColor(Color.black);  
    while(y_move > y_click)   
    {     g1.fillOval(x_click-2,y_move,9,5);   
    y_move -= 5;   
    }    v = 15;  
    for(int i=0;i<=25;i++)  {   r = (((int)Math.round(Math.random()*4321))%200)+55;   
    g = (((int)Math.round(Math.random()*4321))%200)+55;   
    b = (((int)Math.round(Math.random()*4321))%200)+55;    
    g1.setColor(new Color(r,g,b));   
    g1.drawOval(x_click-3*i,y_click-3*i,6*i,6*i);  
    if(i<23)    
    {    g1.drawOval(x_click-3*(i+1),y_click-3*(i+1),6*(i+1),6*(i+1));    
    g1.drawOval(x_click-3*(i+2),y_click-3*(i+2),6*(i+2),6*(i+2));   
    }    
    try    
    {        Thread.currentThread().sleep(v++);     
    } catch (InterruptedException e) {}    
    g1.setColor(Color.black);  
    g1.drawOval(x_click-3*i,y_click-3*i,6*i,6*i);    
    }}   
/***对鼠标事件进行监听。*临听其鼠标按下事件。*当按下鼠标时，产生一个新线程。*/   
public void mousePressed(MouseEvent e)    
{    
    x = e.getX();   
    y = e.getY();     
    Thread one;    
    one = new Thread(this);    
    one.start();   one = null;   
}   
/**   *实现MouseListener接中的方法。为一个空方法。  */   
public void mouseReleased(MouseEvent e)  {    
  
}    
/**  *实现MouseListener接中的方法。为一个空方法。  */   
public void mouseEntered(MouseEvent e)  {  }   
/**   *实现MouseListener接中的方法。为一个空方法。  */   
public void mouseExited(MouseEvent e)  {  }   
/**   *实现MouseListener接中的方法。为一个空方法。  */   
public void mouseClicked(MouseEvent e)  {  }   
  
}  
