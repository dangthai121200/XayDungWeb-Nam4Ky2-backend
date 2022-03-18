package app.netlify.laptopso1vn.MODEL;

import app.netlify.laptopso1vn.ENTITY.AdminEntity;

public class AdminModel {
	

	private String maad;
	private String ho;
	private String ten;
	private String diachi;
	private String sdt;
	private String email;
	private String username;
	private String password;
	
	public AdminModel() {
	}
	
	public AdminModel(AdminEntity adminEntity) {
		this.maad = adminEntity.getMaad();
		this.ho = adminEntity.getHo();
		this.ten = adminEntity.getTen();
		this.diachi = adminEntity.getDiachi();
		this.sdt = adminEntity.getSdt();
		this.email = adminEntity.getEmail();
		this.username = adminEntity.getUsername();
		this.password = adminEntity.getPassword();
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMaad() {
		return maad;
	}

	public void setMaad(String maad) {
		this.maad = maad;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}

