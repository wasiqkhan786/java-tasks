import java.awt.*;
















  





jp.addKeyListener(jp);
jp.setFocusable(true);

jp.setRequestFocusEnabled(true);      
jp.setLayout(null);          

 


 


 


  
q2.setVisible(true);



  









int xinc=0; 

int yinc=0; 


public void paintComponent(Graphics g){


  super.paintComponent(g);

Graphics2D g2d=(Graphics2D) g;










if (xinc<230){
      xinc++;
       

            }
else {if(xinc>=230)
             xinc--;
              

                  }  
repaint(6);

 




 int ke=k.getKeyCode();

 if(ke==KeyEvent.VK_RIGHT)


      xinc++;;   
     repaint();

}  else {if(ke==KeyEvent.VK_LEFT)
    xinc--;
    repaint();}
}






















































