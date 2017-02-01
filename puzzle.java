import java.applet.Applet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
     
     public class puzzle extends Applet implements ActionListener, MouseListener{         
           static int clicks =0 ;
  
           Random r1 = new Random();
           JPanel temp1 = new JPanel();
           JPanel temp2 = new JPanel();
             
           ArrayList<JPanel> panels = new ArrayList<JPanel>();  
           JPanel temp = new JPanel();
               
           JButton newgame = new JButton("New Game");
          
           JPanel buttonpanel= new JPanel();
           JPanel panel = new JPanel();
           JPanel p1 = new JPanel();
           JPanel p2 = new JPanel();
           JPanel p3 = new JPanel();
           JPanel p4 = new JPanel();
           JPanel p5 = new JPanel();
           JPanel p6 = new JPanel();
           JPanel p7 = new JPanel();
           JPanel p8 = new JPanel();
           JPanel p9 = new JPanel();
           JPanel clk = new JPanel();
           
           JLabel l1 = new JLabel("1");
           JLabel l2 = new JLabel("2");
           JLabel l3 = new JLabel("3");
           JLabel l4 = new JLabel("4");
           JLabel l5 = new JLabel("5");
           JLabel l6 = new JLabel("6");
           JLabel l7 = new JLabel("7");
           JLabel l8 = new JLabel("8");
           JLabel l9 = new JLabel("");
           
           JLabel moves = new JLabel("Moves : ");
           JLabel num = new JLabel();
           GridLayout grid = new GridLayout(3,3,5,5); 
       
           public void init() {
               
               moves.setHorizontalAlignment(JLabel.CENTER);
               newgame.setHorizontalAlignment(JButton.CENTER);
           
               GridLayout grid = new GridLayout(3,3,10,10);
               panel.setLayout(grid);
            
               Font f = new Font("SansSerif", Font.BOLD,76);
               l1.setFont(f);
               l2.setFont(f);
               l2.setFont(f);
               l3.setFont(f);
               l4.setFont(f);
               l5.setFont(f);
               l6.setFont(f);
               l7.setFont(f);
               l8.setFont(f);
            
      
               panels.add(p1);
               panels.add(p2);
               panels.add(p3);
               panels.add(p4);
               panels.add(p5);
               panels.add(p6);  
               panels.add(p7);
               panels.add(p8);
               panels.add(p9); 
           
          
               panel.setBackground(Color.black);
               p9.setBackground(Color.black);
               p8.setBackground(Color.gray);
               p7.setBackground(Color.gray);
               p6.setBackground(Color.gray);
               p5.setBackground(Color.gray);
               p4.setBackground(Color.gray);
               p3.setBackground(Color.gray);
               p2.setBackground(Color.gray);
               p1.setBackground(Color.gray);
           
               p1.add(l1);
               p2.add(l2);
               p3.add(l3);
               p4.add(l4);
               p5.add(l5);
               p6.add(l6);
               p7.add(l7);
               p8.add(l8);
               p9.add(l9);
           
               clk.add(moves);
               clk.add(num);
           
               add(p1);
               add(p2);
               add(p3);
               add(p4);
               add(p5);
               add(p6);
               add(p7);
               add(p8);
               add(p9);
               add(clk);
               buttonpanel.add(newgame);
          
         
               panel.add(p1);
               panel.add(p2);
               panel.add(p3);
               panel.add(p4);
               panel.add(p5);
               panel.add(p6);
               panel.add(p7);
               panel.add(p8);
               panel.add(p9);           
   
         
               BorderLayout bord = new BorderLayout();
               setLayout(bord);
               add(buttonpanel,"North");
               add(panel, BorderLayout.CENTER);
               add(clk, BorderLayout.SOUTH);
          
       
               setVisible(true);      
       
               newgame.addActionListener(this);
            
               p1.addMouseListener(this);
               p2.addMouseListener(this);
               p3.addMouseListener(this);
               p4.addMouseListener(this);
               p5.addMouseListener(this);
               p6.addMouseListener(this);
               p7.addMouseListener(this);
               p8.addMouseListener(this);
           }
            
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
      
            public void mouseClicked(MouseEvent ev) {
                Object source = ev.getSource();
    
                int p = panels.indexOf(source);    
                 
                int pan= panels.indexOf(p9); 
                JPanel temp1= panels.get(p);
                JPanel temp2= panels.get(pan);
       
                switch(p){
                   case 2:
                    if((pan==1)||(pan==5)){
                        panels.set(pan,temp1);
                        panels.set(p,temp2);
                        clicks++;
                        num.setText(Integer.toString(clicks));
                        for(JPanel obj : panels)
                            { panel.add(obj);}
                        validate();
                    }
                    break;
                   case 3:
                    if((pan==0)||(pan==4)||(pan==6)){
                        panels.set(pan,temp1);
                        panels.set(p,temp2);
                        clicks++;
                        num.setText(Integer.toString(clicks));
                        for(JPanel obj : panels)
                            { panel.add(obj);}
                        validate();
                    }
                    break;
                   case 5:
                    if((pan==2)||(pan==4)||(pan==8)){
                         panels.set(pan,temp1);
                         panels.set(p,temp2);
                         clicks++;
                         num.setText(Integer.toString(clicks));                              
                         for(JPanel obj : panels)
                            { panel.add(obj);}
                         validate();
                    }
                     break;
                   case 6:
                    if((pan==3)||(pan==7)){
                         panels.set(pan,temp1);
                         panels.set(p,temp2);
                         clicks++;
                         num.setText(Integer.toString(clicks));
                         for(JPanel obj : panels)
                            { panel.add(obj);}
                         validate();
                    }
                     break;
        
                   default :
                    if((p==pan+1)||(p==pan-1)||(p==pan-3)||(p==pan+3)){
                         panels.set(pan,temp1);
                         panels.set(p,temp2);
                         clicks++;
                         num.setText(Integer.toString(clicks));
                         for(JPanel obj : panels)
                            { panel.add(obj);}
                         validate();
                    }
               }
               
               if((panels.get(0)==p1)&&(panels.get(1)==p2)&&(panels.get(2)==p3)&&(panels.get(3)==p4)&&(panels.get(4)==p5)&&(panels.get(5)==p6)&&(panels.get(6)==p7)&&(panels.get(7)==p8)&&(panels.get(8)==p9)){
                   JOptionPane.showMessageDialog(null,"Συγχαρητήρια");            
                }
            }         

            public void actionPerformed(ActionEvent ev) {
                Object source = ev.getSource();
                if(source == newgame) 
                {                 
                    for (int x=0; x<100; x++){
                         int position1= r1.nextInt(9);
                         int position2= r1.nextInt(9);
                         JPanel temppanel1=panels.get(position1);
                         JPanel temppanel2= panels.get(position2);
                         panels.set(position1,temppanel2);
                         panels.set(position2,temppanel1);             
                    }                 
                
                    for(JPanel obj : panels)
                        { panel.add(obj);}                        
                    validate();
                }
            }
        }