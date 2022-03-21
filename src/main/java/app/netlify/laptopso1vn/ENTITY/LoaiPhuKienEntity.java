package app.netlify.laptopso1vn.ENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "LoaiPhuKienEntity")
@Table(name = "loaiphukien")
public class LoaiPhuKienEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maloaipk")
	private int maloaipk;
	
	@Column(name = "tenloai")
	private String tenloai;
	
	
	
	public LoaiPhuKienEntity() {
		super();
	}

	public LoaiPhuKienEntity(int maloaipk, String tenloai) {
		super();
		this.maloaipk = maloaipk;
		this.tenloai = tenloai;
	}
	
	public int getMaloaipk() {
		return maloaipk;
	}
	public void setMaloaipk(int maloaipk) {
		this.maloaipk = maloaipk;
	}
	public String getTenloai() {
		return tenloai;
	}
	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}
	
	
	
}
