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
public class KhachHangEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "makh")
	private int maKh;
	
	@Column(name = "ho")
	private String ho;
	
	@Column(name = "ten")
	private String ten;
	
	@Column(name = "diachi")
	private String diaChi;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "sdt")
	private String sdt;
	
	public KhachHangEntity() {

	}
	
	public KhachHangEntity(String email, String username, String password) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
	}



	public KhachHangEntity(int makh, 
			String ho, 
			String ten, 
			String diachi, 
			String email, 
			String username, 
			String password,
			String sdt) {
		this.maKh = makh;
		this.ho = ho;
		this.ten = ten;
		this.diaChi = diachi;
		this.email = email;
		this.username = username;
		this.password = password;
		this.sdt = sdt;
	}

	public KhachHangEntity(String ho, 
			String ten, 
			String diachi, 
			String email, 
			String username, 
			String password,
			String sdt) {
		this.ho = ho;
		this.ten = ten;
		this.diaChi = diachi;
		this.email = email;
		this.username = username;
		this.password = password;
		this.sdt = sdt;
	}

	public int getMakh() {
		return maKh;
	}

	public void setMakh(int makh) {
		this.maKh = makh;
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
		return diaChi;
	}

	public void setDiachi(String diachi) {
		this.diaChi = diachi;
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
		return "UserEntity [makh=" + maKh + ", ho=" + ho + ", ten=" + ten + ", diachi=" + diaChi + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", sdt=" + sdt + "]";
	}
	
	
	
	
}
