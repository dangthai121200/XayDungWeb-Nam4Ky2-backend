package app.netlify.laptopso1vn.MODEL;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import app.netlify.laptopso1vn.ENTITY.UserEntity;

public class UserModel {


	private int makh;
	private String ho;
	private String ten;
	private String diachi;
	private String email;
	private String sdt;
	
	public UserModel(UserEntity userEntity) {
		this.makh = userEntity.getMakh();
		this.ho = userEntity.getHo();
		this.ten = userEntity.getTen();
		this.diachi = userEntity.getDiachi();
		this.email = userEntity.getEmail();
		this.sdt = userEntity.getSdt();
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
