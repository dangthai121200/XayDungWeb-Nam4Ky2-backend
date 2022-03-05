package app.netlify.laptopso1vn.ENUM;

public enum Status {
	
	PENDING("Chưa giao"),APPORVE("Đã giao");
	
	
	private String title;

	Status(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
