package edu.school.problems;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class DominoPlayerDeckView {

	private DominoPlayer player;
	private TileView tileView = new TileView();
	
	public DominoPlayerDeckView()
	{
		this.player = new DominoPlayer("Default Player", null, 0, null);
	}
	
	public DominoPlayerDeckView(DominoPlayer player)
	{
		this.player = new DominoPlayer("Default Player", null, 0, null);
	}
	
	public void drawDeck(Graphics graphics)
	{
		Graphics2D g = (Graphics2D)graphics.create();
		g.setColor(Color.lightGray);
		g.fill(new Rectangle2D.Double(0, 0, 500, 500));
		int x = 20;
		int y = 300;

		for (int i = 0; i < player.getTiles().length; i++) {
			
			g.translate(x, y);
			tileView.paintTile(g, player.getTiles()[i]);
			g.translate(-x,  -y);
			x += 120;
		}

		
	}
	
	
}
