import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 
 * ���̿�����
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
			//��
			snake.now = Snake.LEFT;
			
			break;
		case 38:
			//��
			snake.now = Snake.UP;
			break;
		case 39:
			//��
			snake.now = Snake.RIGHT;
			break;
		case 40:
			//��
			snake.now = Snake.DOWN;
			break;
		case 97:
			snake.speed --;
			break;

		}
	}

}
