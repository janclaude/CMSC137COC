import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Action implements Constants, ActionListener{
	private JPanel panel = new JPanel();
	private JButton button = new JButton();
	private JTextField textInput = new JTextField();
	private String name;
	private BufferedReader in;
	private PrintWriter out;
	private JButton[][] map;
	private int[][] prevMap, newMap;
	private int prevX, prevY, newX, newY;
	
	public Action(){
		
	}
	
	public Action(JButton button, JPanel panel){
		super();
		this.button = button;
		this.panel = panel;
		name = this.button.getName();
	}
	
	public Action(int prevX, int prevY, int newX, int newY, JButton button, JPanel panel){
		super();
		this.button = button;
		this.panel = panel;
		this.prevX = prevX;
		this.prevY = prevY;
		this.newX = newX;
		this.newY = newY;
		name = this.button.getName();
	}
	
	public Action(JTextField textInput, JPanel panel){
		super();
		this.textInput = textInput;
		this.panel = panel;
		name = this.textInput.getName();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch(name){
		case "barbarian":
			break;
		case "archer":
			break;
		case "mage":
			break;
		case "giant":
			break;
		case "wallbreaker":
			break;
		case "hogrider":
			break;
		case "dragon":
			break;
		case "attack":
			break;
		case "move":
			
			break;
		case "button":
			if(Game.gui.getMapUI()[newX][newY]!=null){
				System.out.println("COLLISION!");
				break;
			}
			map = Game.gui.getMapUI();
			prevMap = Game.gui.getMap();
			newMap = prevMap;
			
			newMap[prevX][prevY]-=1;
			newMap[newX][newY]+=1;
			this.setMapCoordinates(prevX, prevY, newX, newY, map);

			Game.gui.setMapUI(map);
			Game.gui.setMap(newMap);
			break;
		case "upgrade":
			break;
		case "chatText": 
			out.println(Game.gui.getChatBox().getText());
			Game.gui.getChatText().setText("");
			break;
		}
	}
	
	public void setMapCoordinates(int prevX, int prevY, int newX, int newY, JButton[][] map){
		this.map[prevX][prevY] = new JButton("0");
		this.map[newX][newY] = new JButton(new ImageIcon("barbarian.png"));
	}
}
