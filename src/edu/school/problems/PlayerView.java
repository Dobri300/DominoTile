package edu.school.problems;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class PlayerView extends JComponent
{
	private DominoPlayer player;
	private DominoPlayerDeckView playerDeckView = new DominoPlayerDeckView();
	public PlayerView(DominoPlayer player)
	{
		this.player = player;
	}
	
	public void paintComponent(Graphics graphics) 
	{
		playerDeckView.drawDeck(graphics);
		
	}
	
	public void drawDeck(Graphics graphics) 
	{
	}
	

}
