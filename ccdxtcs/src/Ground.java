import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 * ’œ∞≠ŒÔ
 * 
 */
public class Ground implements MyDraw {

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fill3DRect(0, 2 * GamePanel.cell, GamePanel.width * GamePanel.cell,
				GamePanel.cell, true);
		g.fill3DRect(0, 0, GamePanel.cell, GamePanel.height * GamePanel.cell,
				true);
		g.fill3DRect((GamePanel.width - 1) * GamePanel.cell, 0, GamePanel.cell,
				GamePanel.height * GamePanel.cell, true);
		g.fill3DRect(0, (GamePanel.height - 1) * GamePanel.cell,
				GamePanel.width * GamePanel.cell, GamePanel.cell, true);

	}

}
