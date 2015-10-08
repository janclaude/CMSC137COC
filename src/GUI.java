import java.awt.*;
import java.util.*;
import javax.swing.*;


public class GUI extends JFrame implements Constants{
	private String name; //game name
	/**
	 * gamepanel - panel on the left; contains characterPanl, commandPanel, mapPanel
	 * characterPanel - panel containing character buttons
	 * commandPanel - panel containing command buttons
	 * mapPanel - panel containing the main game
	 * chatPanel - panel containing chatText and chatBox 
	 **/
	private JPanel gamePanel, chatPanel, characterPanel, commandPanel, mapPanel, main;
	/**
	 * 2d array for the game map 
	 **/
	private int[][] map;
	private JButton[][] mapUI;
	/**
	 * buttons for the characters and commands 
	 **/
	private JButton barbarian, archer, mage, dragon, hogrider, giant, wallbreaker, attack, move, upgrade;
	/**
	 * text field where the user inputs messages 
	 **/
	private JTextField chatText;
	/**
	 * box where conversations are posted 
	 **/
	private JTextArea chatBox;
	
	public GUI(){
		
	}
	
	public GUI(String name) {
		super(name);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setComponents();
		this.setContentPane(main);
		this.setSize(900, 600);
		this.setVisible(true);
		this.setResizable(false);
		this.pack();
	}
	
	public void setComponents() {
		main = new JPanel();
		main.setPreferredSize(new Dimension(1000,700));
		gamePanel = new JPanel(new BorderLayout());
		gamePanel.setPreferredSize(new Dimension(750, 700));
		chatPanel = new JPanel(new BorderLayout());
		chatPanel.setPreferredSize(new Dimension(250, 700));
		mapPanel = new JPanel();
		characterPanel = new JPanel(new GridLayout(7,0));
		commandPanel = new JPanel(new GridLayout(0,3));
		
		//barbarian
		barbarian = new JButton();
		barbarian.setName("barbarian");
		barbarian.setIcon(new ImageIcon("barbarian.png"));
		barbarian.setBorder(null);
		
		//archer
		archer = new JButton();
		archer.setName("archer");
		archer.setIcon(new ImageIcon("archer.png"));
		archer.setBorder(null);
		
		//mage
		mage = new JButton();
		mage.setName("mage");
		mage.setIcon(new ImageIcon("mage.png"));		
		mage.setBorder(null);
		
		//giant
		giant = new JButton();
		giant.setName("giant");
		giant.setIcon(new ImageIcon("giant.png"));
		giant.setBorder(null);
		
		//wallbreaker
		wallbreaker = new JButton();
		wallbreaker.setName("wallbreaker");
		wallbreaker.setIcon(new ImageIcon("wallbreaker.png"));
		wallbreaker.setBorder(null);
		
		//hogrider
		hogrider = new JButton();
		hogrider.setName("hogrider");
		hogrider.setIcon(new ImageIcon("hogrider.png"));
		hogrider.setBorder(null);
		
		//dragon
		dragon = new JButton();
		dragon.setName("dragon");
		dragon.setIcon(new ImageIcon("dragon.png"));
		dragon.setBorder(null);
		
		//command buttons
		attack = new JButton("Attack");
		attack.setName("attack");
		move = new JButton("Move");
		move.setName("move");
		upgrade = new JButton("Upgrade");
		upgrade.setName("upgrade");
		
/*		mapUI = new JButton[GAHEIGHT][GAWIDTH];
		for(int i=0; i<GAHEIGHT; i+=1){
			for(int j=0; j<GAWIDTH; j+=1){
				mapUI[i][j] = new JButton();
				mapUI[i][j].setName("button");
				mapPanel.add(mapUI[i][j]);
			}
		}
*/				
		characterPanel.add(barbarian);
		characterPanel.add(archer);
		characterPanel.add(mage);
		characterPanel.add(giant);
		characterPanel.add(hogrider);
		characterPanel.add(wallbreaker);
		characterPanel.add(dragon);
		commandPanel.add(attack);
		commandPanel.add(move);
		commandPanel.add(upgrade);
		
		gamePanel.add(characterPanel, BorderLayout.WEST);
		gamePanel.add(commandPanel, BorderLayout.SOUTH);
		gamePanel.add(mapPanel, BorderLayout.CENTER);

		chatText = new JTextField("",20);
		chatText.setName("chatText");
		chatBox = new JTextArea(8,20);
		chatBox.setEditable(false);

		chatPanel.add(chatText, BorderLayout.SOUTH);
		chatPanel.add(chatBox, BorderLayout.CENTER);

		main.add(gamePanel);
		main.add(chatPanel);
		
		chatText.addActionListener(new Action(chatText,chatPanel));
	}

	public JButton[][] getMapUI() {
		return mapUI;
	}

	public void setMapUI(JButton[][] mapUI) {
		this.mapUI = mapUI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JPanel getGamePanel() {
		return gamePanel;
	}

	public void setGamePanel(JPanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	public JPanel getChatPanel() {
		return chatPanel;
	}

	public void setChatPanel(JPanel chatPanel) {
		this.chatPanel = chatPanel;
	}

	public JPanel getCharacterPanel() {
		return characterPanel;
	}

	public void setCharacterPanel(JPanel characterPanel) {
		this.characterPanel = characterPanel;
	}

	public JPanel getCommandPanel() {
		return commandPanel;
	}

	public void setCommandPanel(JPanel commandPanel) {
		this.commandPanel = commandPanel;
	}

	public JPanel getMain() {
		return main;
	}

	public void setMain(JPanel main) {
		this.main = main;
	}

	public int[][] getMap() {
		return map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}

	public JButton getBarbarian() {
		return barbarian;
	}

	public void setBarbarian(JButton barbarian) {
		this.barbarian = barbarian;
	}

	public JButton getArcher() {
		return archer;
	}

	public void setArcher(JButton archer) {
		this.archer = archer;
	}

	public JButton getMage() {
		return mage;
	}

	public void setMage(JButton mage) {
		this.mage = mage;
	}

	public JButton getDragon() {
		return dragon;
	}

	public void setDragon(JButton dragon) {
		this.dragon = dragon;
	}

	public JButton getHogrider() {
		return hogrider;
	}

	public void setHogrider(JButton hogrider) {
		this.hogrider = hogrider;
	}

	public JButton getGiant() {
		return giant;
	}

	public void setGiant(JButton giant) {
		this.giant = giant;
	}

	public JButton getWallbreaker() {
		return wallbreaker;
	}

	public void setWallbreaker(JButton wallbreaker) {
		this.wallbreaker = wallbreaker;
	}

	public JButton getAttack() {
		return attack;
	}

	public void setAttack(JButton attack) {
		this.attack = attack;
	}

	public JButton getMove() {
		return move;
	}

	public void setMove(JButton move) {
		this.move = move;
	}

	public JButton getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(JButton upgrade) {
		this.upgrade = upgrade;
	}

	public JTextField getChatText() {
		return chatText;
	}

	public void setChatText(JTextField chatText) {
		this.chatText = chatText;
	}

	public JTextArea getChatBox() {
		return chatBox;
	}

	public void setChatBox(JTextArea chatBox) {
		this.chatBox = chatBox;
	}
}
