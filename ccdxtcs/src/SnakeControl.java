import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 
 * ¼üÅÌ¿ØÖÆÆ÷
 * 
 */
public class SnakeControl extends KeyAdapter {

	Snake snake;
	
	
	
	public void resnake(Snake a){
		snake = a;
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		int a = e.getKeyCode();
		
		
		switch (a) {
		case 37:
			//×ó
			snake.now = Snake.LEFT;
			
			break;
		case 38:
			//ÉÏ
			snake.now = Snake.UP;
			break;
		case 39:
			//ÓÒ
			snake.now = Snake.RIGHT;
			break;
		case 40:
			//ÏÂ
			snake.now = Snake.DOWN;
			break;
		case 97:
			snake.speed --;
			break;

		}
	}

}
