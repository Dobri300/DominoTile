package edu.school.problems;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class DominoTableView extends JComponent
{
	private DominoTable table;
	private TileView tileView = new TileView();
	public DominoTableView(DominoTable t)
	{
		this.table = t;
		table.addTableEventListener(new TableEventListener() {

			@Override
			public void onTableChanged(DominoTable table) {
				// TODO Auto-generated method stub
				DominoTableView.this.repaint();
			}
			
		});
	}
	
	@Override
	public void paintComponent(Graphics graphics)
	{
		Graphics2D g = (Graphics2D)graphics.create();
		g.setColor(Color.lightGray);
		g.fill(new Rectangle2D.Double(0, 0, 500, 500));
		int x = 60;
		int y = 220;
		Iterator<DominoTile> it = table.getDominoTable().getIterator();
		while(it.hasNext())
		{
			g.translate(x, y);
			paintTile(g, it.next());
			g.translate(-x,  -y);
			x += 120;
		}
		/*for(DominoTile t : table.getDominoTable())
		{
			if(t == null)
				continue;
			g.translate(x, y);
			paintTile(g, t);
			g.translate(-x,  -y);
			x += 120;
		}*/
	}
	
	
	private void paintTile(Graphics2D g, DominoTile t)
	{
		tileView.paintTile(g, t);
	}
	
	

}
