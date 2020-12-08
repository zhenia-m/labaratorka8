package edu.sumdu.monopoly;

public class JailCell extends Cell {
	public static int BAIL = 50;
    protected Player owner;
    private boolean available = true;

    public JailCell() {
		setName("Jail");
	}
	
	public void playAction() {
		
	}

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
