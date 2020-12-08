package edu.sumdu.monopoly;

public class FreeParkingCell extends Cell {

    protected Player owner;
    private boolean available = true;

    public FreeParkingCell() {
		setName("Free Parking");
	}

	public void playAction() {
		return;
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
