package edu.school.problems;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DominoGameTest extends JFrame
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(50, 50, 800, 500);
		f.setLayout(new BorderLayout());
		DominoTable t = new DominoTable();
		t.addLeft(new DominoTile(1, 2));
		t.addLeft(new DominoTile(3, 1));
		t.addLeft(new DominoTile(4, 3));
		t.addLeft(new DominoTile(5, 4));
		t.addLeft(new DominoTile(6, 5));
		t.addLeft(new DominoTile(0, 6));
		t.addRight(new DominoTile(2, 4));
		
		//t.print();
		DominoTableView v = new DominoTableView(t);
		DominoTile[] playerTiles = new DominoTile[]{new DominoTile(1, 2), new DominoTile(3, 1), new DominoTile(4, 3)};
		DominoPlayer player1 = new DominoPlayer("Dobri", playerTiles, 3, t);
		
		
		PlayerView playerView = new PlayerView(player1);
		f.add(v, BorderLayout.CENTER);
		f.setVisible(true);
		
		
	}

}
