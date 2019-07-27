import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * 
 * Ê³Îï
 * 
 */
public class Food implements MyDraw {

	int food_x;
	int food_y;

	public Food() {
		makeFood();
	}

	public void makeFood() {
		Random r = new Random();
		food_x = r.nextInt(GamePanel.width);
		food_y = r.nextInt(GamePanel.height);
		if (food_x <= 0 || food_x >= GamePanel.width - 1 || food_y <= 2
				|| food_y >= GamePanel.height - 1) {
			makeFood();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fill3DRect(food_x * GamePanel.cell, food_y * GamePanel.cell,
				GamePanel.cell, GamePanel.cell, true);
	}

}
