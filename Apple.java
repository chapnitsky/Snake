import java.awt.Color;
import java.awt.Graphics;

public class Apple {
	
private int xCoor, yCoor, width, height;
	
	
	public Apple(int x, int y, int titleSize) {
		this.xCoor = x;
		this.yCoor = y;
		this.width = titleSize;
		this.height = titleSize;
		
	}
	
	public void draw(Graphics g) {
		g.clearRect(0, 0, width, height);
		g.setColor(Color.RED);
		g.fillRect(xCoor * width, yCoor * height, width, height);
		
	}

	public int getxCoor() {
		return xCoor;
	}

	public void setxCoor(int xCoor) {
		this.xCoor = xCoor;
	}

	public int getyCoor() {
		return yCoor;
	}

	public void setyCoor(int yCoor) {
		this.yCoor = yCoor;
	}
	
	
}
