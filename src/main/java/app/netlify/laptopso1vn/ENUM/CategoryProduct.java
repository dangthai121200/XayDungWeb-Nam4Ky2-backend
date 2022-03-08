package app.netlify.laptopso1vn.ENUM;

public enum CategoryProduct {
	
	LAPTOP("laptop"),ACCESSORY("phukien");
	
	private String tile;
	private CategoryProduct(String tile) {
		this.tile = tile;
	}

	public String getTile() {
		return tile;
	}

	public void setTile(String tile) {
		this.tile = tile;
	}
	
}
