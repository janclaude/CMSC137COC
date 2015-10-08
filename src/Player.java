import java.net.InetAddress;
import java.util.ArrayList;

public class Player {
	private InetAddress add;
	private int port;
	private int playerId;
	private String playerName;
	private int posX;
	private int posY;
	private int mapHeight;
	private int mapWidth;
	private int orientation;
	private ArrayList<Troop> troop;
	private int troopCount = 0;
	
	//constructor
	public Player(){

	}

	//start
	public Player(InetAddress add, int port){
		this.add = add;
		this.port = port;
	}

	//server
	public Player(int playerId, String playerName, int posX, int posY, int mapHeight, int mapWidth, InetAddress add, int port){
		this.playerId = playerId;
		this.playerName = playerName;
		this.posX = posX;
		this.posY = posY;
		this.mapHeight = mapHeight;
		this.mapWidth = mapWidth;
		this.add = add;
		this.port = port;
	}

	//client
	public Player(int playerId, String playerName, int posX, int posY, int mapHeight, int mapWidth, int orientation){
		this.playerId = playerId;
		this.playerName = playerName;
		this.posX = posX;
		this.posY = posY;
		this.mapHeight = mapHeight;
		this.mapWidth = mapWidth;
		this.orientation = orientation;
	}

	public InetAddress getAdd() {
		return add;
	}

	public void setAdd(InetAddress add) {
		this.add = add;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getMapHeight() {
		return mapHeight;
	}

	public void setMapHeight(int mapHeight) {
		this.mapHeight = mapHeight;
	}

	public int getMapWidth() {
		return mapWidth;
	}

	public void setMapWidth(int mapWidth) {
		this.mapWidth = mapWidth;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
	
	public String info(){
		String s = "";
		s+="Player ";
		s+=playerName+" ";
		s+=posX+" ";
		s+=posY+" ";
		s+=mapHeight+" ";
		s+=mapWidth+" ";
		s+=orientation;
		return s;
	}
}
