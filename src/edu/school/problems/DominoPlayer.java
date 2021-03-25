package edu.school.problems;

import javax.swing.JOptionPane;

public class DominoPlayer {
	private String nickname;
	private DominoTile[] tiles;
	private int tilesInHands;
	private DominoTable table;

	public DominoPlayer(String nicknameValue, DominoTile[] tilesValue, int tilesInHandsValue, DominoTable tableValue) {
		if (nicknameValue != null && !nicknameValue.isEmpty()) {
			this.nickname = nicknameValue;
		}

		this.tiles = tilesValue;
		this.tilesInHands = tilesInHandsValue;
		this.table = tableValue;
	}

	public String getNickname() 
	{
		return this.nickname;
	}

	public DominoTile[] getTiles() {
		return this.tiles;
	}

	public int getTilesInHands() {
		return this.tilesInHands;
	}

	public DominoTable getTable() {
		return this.table;
	}

	public void setNickname(String nicknameValue) {
		if (nicknameValue != null && !nicknameValue.isEmpty()) {
			this.nickname = nicknameValue;
		}
	}

	private int getTileIndex(DominoTile t) {
		for (int i = 0; i < this.tiles.length; i++) {
			if (this.tiles[i].equals(t))
				return i;
		}

		return -1;
	}

	public void addTileAtLeft(DominoTile t) {

		int i = this.getTileIndex(t);
		if (i == -1) {
			JOptionPane.showMessageDialog(null, "You do not have the tile in your deck.", "Error",
					JOptionPane.PLAIN_MESSAGE);
			return;
		} else {
			boolean wasAdded = this.table.addLeft(t);
			if (wasAdded == true) {
				this.tilesInHands--;
				for (int j = i; j < this.tiles.length - 1; j++) {
					this.tiles[j] = this.tiles[j + 1];
				}
			}
		}
	}

	public void addTileAtRight(DominoTile t) {
		int i = this.getTileIndex(t);
		if(i == -1)
		{
			JOptionPane.showMessageDialog(null, "You do not have the tile in your deck.", "Error",
					JOptionPane.PLAIN_MESSAGE);
			return;
		}
		else
		{
			boolean wasAdded = this.table.addRight(t);
			if(wasAdded == true) 
			{
				this.tilesInHands--;
				for(int j = i; j < this.tilesInHands - 1; j++)
				{
					this.tiles[j] = this.tiles[j + 1];
				}
			}
		}
	}
}
