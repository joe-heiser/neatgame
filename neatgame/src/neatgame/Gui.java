package neatgame;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends JFrame {
	
	public Gui() {

        initUI();
    }

    private void initUI() {
    	
    	Player p1 =  new Player("Jeffy",50,10);
    	Enemy e1 =  new Enemy("Nigger",50,10);

    	
    	JFrame frame = new JFrame("Kill Jeffy");
    	
    	JPanel panel = new JPanel(new GridLayout(4,4,4,4));
    	
    	JButton healButton = new JButton("Heal");
    	//healButton.setPreferredSize(new Dimension(50,60));
    	
    	JButton damageButton = new JButton("Damage 10 HP");
    	//healButton.setPreferredSize(new Dimension(50,60));
    	
    	JButton attackButton = new JButton("Attack Jeffy");
    	
    	JLabel health = new JLabel(p1.toString());
    	
    	
    	
    	healButton.addActionListener((ActionEvent event) -> {
            p1.heal();
            health.setText(p1.toString());
        });
    	
    	damageButton.addActionListener((ActionEvent event) -> {
            p1.takeDamage(10);
            health.setText(p1.toString());
        });
    	
    	attackButton.addActionListener((ActionEvent event) -> {
            e1.attack(p1);
            health.setText(p1.toString());
        });
    	
    	frame.addWindowListener(new WindowAdapter() {
    		  public void windowClosing(WindowEvent we) {
    		    System.exit(0);
    		  }
    		});
    	
    	panel.add(healButton);
    	panel.add(attackButton);
    	panel.add(damageButton);
    	panel.add(health);
    	frame.setPreferredSize(new Dimension(800,600));
    	frame.setContentPane(panel);
    	frame.pack();
    	frame.setVisible(true);
        
    }

    

}
