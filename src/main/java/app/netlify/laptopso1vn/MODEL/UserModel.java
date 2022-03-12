package app.netlify.laptopso1vn.MODEL;


import java.util.ArrayList;
import java.util.List;

import app.netlify.laptopso1vn.ENTITY.KhachHangEntity;
import app.netlify.laptopso1vn.UTIL.Laptopso1vnUtil;

public class UserModel {


	private int makh;
	private String ho;
	private String ten;
	private String diachi;
	private String email;
	private String sdt;
	private String username;
	private List<String> roles = new ArrayList<String>();
	
	public UserModel(KhachHangEntity userEntity) {
		this.makh = userEntity.getMakh();
		this.ho = userEntity.getHo();
		this.ten = userEntity.getTen();
		this.diachi = userEntity.getDiachi();
		this.email = userEntity.getEmail();
		this.sdt = userEntity.getSdt();
		this.username = userEntity.getUsername();
		roles.add(Laptopso1vnUtil.ADMIN_ROLE);
	}
	
	public UserModel(int makh, String ho, String ten, String diachi, String email, String sdt) {
		super();
		this.makh = makh;
		this.ho = ho;
		this.ten = ten;
		this.diachi = diachi;
		this.email = email;
		this.sdt = sdt;
	}
	
	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getMakh() {
		return makh;
	}
	public void setMakh(int makh) {
		this.makh = makh;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	
	
}
