package edu.sumdu.monopoly;

public class GoCell extends Cell {
    protected Player owner;
    private boolean available = true;

    public GoCell() {
		super.setName("Go");
	}

	public void playAction() {
	}
	
	void setName(String name) {
	}

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
