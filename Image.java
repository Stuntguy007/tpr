import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.management.timer.Timer;


//KeyListener: listener voor toetsenbordinvoer
public class Image extends Frame implements WindowListener,ActionListener,KeyListener {
        TextField text = new TextField(20);
        Button b;
        private int numClicks = 0;

        public static void main(String[] args)
        {
                Image myWindow = new Image("Button opdracht");
                myWindow.setSize(420,420);
                myWindow.setVisible(true);
        }

        public Image(String title)
        {

                super(title);
                setLayout(new FlowLayout());
                addWindowListener(this);
                
                addKeyListener(this); //Voeg de KeyListener toe op het Frame
                b = new Button("Click Here!");
                b.setFocusable(false);
                add(b);

                b.addActionListener(this);
                
        }

        public void actionPerformed(ActionEvent e) {
                System.out.println("Dont Touch Me");

        }

        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

        public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}
        
        //Eventfunctie voor het indrukken van een toets
		@Override
		public void keyPressed(KeyEvent e) {
			//e.getKeyCode(): krijg de code van de toets die is ingedrukt
			//KeyEvent.VK_<toets> is de code van <toets>
			if(e.getKeyCode() == KeyEvent.VK_SPACE) System.out.println("SPATIOE");
		}
		
		//Eventfunctie voor het loslaten van een toets
		@Override
		public void keyReleased(KeyEvent e) {
			
		}
		
		//Eventfunctie voor het typen van een toets (werkt slecht)
		@Override
		public void keyTyped(KeyEvent e) {
			
		}

}
