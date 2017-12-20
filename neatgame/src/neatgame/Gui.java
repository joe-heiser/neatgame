package neatgame;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

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
    	
    	JFrame frame = new JFrame("test");
    	
    	JPanel panel = new JPanel(new GridLayout(4,4,4,4));
    	
    	JButton healButton = new JButton("Heal");
    	healButton.setPreferredSize(new Dimension(50,50));
    	
    	JButton damageButton = new JButton("Damage");
    	healButton.setPreferredSize(new Dimension(50,50));
    	
    	JLabel health = new JLabel(p1.toString());
    	
    	
    	
    	healButton.addActionListener((ActionEvent event) -> {
            p1.heal();
            health.setText(p1.toString());
        });
    	
    	damageButton.addActionListener((ActionEvent event) -> {
            p1.takeDamage(10);
            health.setText(p1.toString());
        });
    	
    	panel.add(healButton);
    	panel.add(damageButton);
    	panel.add(health);
    	frame.setContentPane(panel);
    	frame.pack();
    	frame.setVisible(true);
    	       
        setTitle("Neat Game");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Gui ex = new Gui();
            ex.setVisible(true);
        });
    }

}
