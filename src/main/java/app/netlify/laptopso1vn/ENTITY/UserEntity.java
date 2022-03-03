package app.netlify.laptopso1vn.ENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "UserEntity")
@Table(name = "khachhang")
public class UserEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "makh")
	private int makh;
	
	@Column(name = "ho")
	private String ho;
	
	@Column(name = "ten")
	private String ten;
	
	@Column(name = "diachi")
	private String diachi;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "sdt")
	private String sdt;
	
	public UserEntity() {

	}

	public UserEntity(int makh, 
			String ho, 
			String ten, 
			String diachi, 
			String email, 
			String username, 
			String password,
			String sdt) {
		this.makh = makh;
		this.ho = ho;
		this.ten = ten;
		this.diachi = diachi;
		this.email = email;
		this.username = username;
		this.password = password;
		this.sdt = sdt;
	}

	public UserEntity(String ho, 
			String ten, 
			String diachi, 
			String email, 
			String username, 
			String password,
			String sdt) {
		this.ho = ho;
		this.ten = ten;
		this.diachi = diachi;
		this.email = email;
		this.username = username;
		this.password = password;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Override
	public String toString() {
		return "UserEntity [makh=" + makh + ", ho=" + ho + ", ten=" + ten + ", diachi=" + diachi + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", sdt=" + sdt + "]";
	}
	
	
	
	
}
