import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;


/**
 * 
 * 游戏面板
 *
 */
public class GamePanel extends Frame  {
	
	/**
	 * 单元格宽度
	 */
	public final static int cell = 20;
	/**
	 * 横向距离
	 */
	public final static int width = 40;
	/**
	 * 纵向距离
	 */
	public final static int height = 30;
	
	
	Snake draw_snake = new Snake();
	Food draw_food = new Food();
	MyDraw draw_ground = new Ground();
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fill3DRect(0, 0, GamePanel.width*GamePanel.cell, GamePanel.height*GamePanel.cell, true);
		draw_snake.draw(g);
		draw_food.draw(g);
		draw_ground.draw(g);
	}
	
	
	public static void main(String[] args) {
		GamePanel f = new GamePanel();
		f.draw_snake.refood(f.draw_food);
		MyWindow w = new MyWindow();
		f.addWindowListener(w);
		SnakeControl control = new SnakeControl();
		
		control.resnake(f.draw_snake);
		
		f.addKeyListener(control);
		f.setSize(GamePanel.width*GamePanel.cell, GamePanel.height*GamePanel.cell);
		f.setVisible(true);
		
		boolean live = true;;
		
		while(live){
			f.draw_snake.move();
			if(f.draw_snake.die() == true){
				live = false;
			}
			f.draw_snake.eat();
			f.repaint();
			try {
				Thread.sleep(f.draw_snake.speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	

}
