import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * Éß
 * 
 */
public class Snake implements MyDraw {

	ArrayList body = new ArrayList();

	public static final int UP = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int RIGHT = 4;

	public int now = DOWN;
	
	public int speed = 500;
	
	public int code = 0;

	public Snake() {
		for (int i = 0; i < 5; i++) {
			int[] a = new int[2];
			a[0] = GamePanel.width / 2 - i;
			a[1] = GamePanel.height / 2;
			body.add(a);
		}
	}

	int[] tail;

	public void move() {
		int[] head = (int[]) body.get(0);
		int[] h = new int[2];

		switch (now) {
		case UP:
			h[0] = head[0];
			h[1] = head[1] - 1;
			break;
		case DOWN:
			h[0] = head[0];
			h[1] = head[1] + 1;
			break;
		case LEFT:
			h[0] = head[0] - 1;
			h[1] = head[1];
			break;
		case RIGHT:
			h[0] = head[0] + 1;
			h[1] = head[1];
			break;
		}

		body.add(0, h);
		tail = (int[]) body.get(body.size() - 1);
		body.remove(body.size() - 1);
	}

	Food food;

	public void refood(Food S) {
		food = S;
	}

	public void eat() {
		int[] head = (int[]) body.get(0);
		if (head[0] == food.food_x && head[1] == food.food_y) {
			food.makeFood();
			body.add(tail);
			speed = speed -20;
			code = code +10;
		}
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		for (int i = 0; i < body.size(); i++) {
			int[] a = (int[]) body.get(i);
			g.fill3DRect(a[0] * GamePanel.cell, a[1] * GamePanel.cell,
					GamePanel.cell, GamePanel.cell, true);
		}
	}

	public boolean die() {
		boolean k = false;
		int[] head = (int[]) body.get(0);
		for (int i = 1; i < body.size(); i++) {
			int[] b = (int[]) body.get(i);
			if (b[0] == head[0] && b[1] == head[1]) {
				k = true;
				return k;
			}
		}
		//
		if (head[0] == 0 || head[0] == GamePanel.width - 1 || head[1] == 2
				|| head[1] == GamePanel.height - 1) {
			return true;
		}
		return k;
	}

}
