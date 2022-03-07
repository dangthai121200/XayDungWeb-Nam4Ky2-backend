package app.netlify.laptopso1vn.ENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "DotKhuyenMaiEntity")
@Table(name = "dotkhuyenmai")
public class DotKhuyenMaiEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "makm")
	private int maKm;
	
	@Column(name = "tenkm")
	private String tenKm;
	
	@Column(name = "mota")
	private String moTa;
	
	@Column(name = "giatrigiam")
	private String giaTriGiam;
	
	@Column(name = "ngaybd")
	private Date ngayBd;
	
	@Column(name = "ngaykt")
	private Date ngayKt;
	
	@Column(name = "hinh")
	private String hinh;
	
	
	public DotKhuyenMaiEntity(int maKm, String tenKm, String moTa, String giaTriGiam, Date ngayBd, Date ngayKt,
			String hinh) {
		super();
		this.maKm = maKm;
		this.tenKm = tenKm;
		this.moTa = moTa;
		this.giaTriGiam = giaTriGiam;
		this.ngayBd = ngayBd;
		this.ngayKt = ngayKt;
		this.hinh = hinh;
	}


	public DotKhuyenMaiEntity(String tenKm, String moTa, String giaTriGiam, Date ngayBd, Date ngayKt, String hinh) {
		super();
		this.tenKm = tenKm;
		this.moTa = moTa;
		this.giaTriGiam = giaTriGiam;
		this.ngayBd = ngayBd;
		this.ngayKt = ngayKt;
		this.hinh = hinh;
	}


	public int getMaKm() {
		return maKm;
	}


	public void setMaKm(int maKm) {
		this.maKm = maKm;
	}


	public String getTenKm() {
		return tenKm;
	}


	public void setTenKm(String tenKm) {
		this.tenKm = tenKm;
	}


	public String getMoTa() {
		return moTa;
	}


	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}


	public String getGiaTriGiam() {
		return giaTriGiam;
	}


	public void setGiaTriGiam(String giaTriGiam) {
		this.giaTriGiam = giaTriGiam;
	}


	public Date getNgayBd() {
		return ngayBd;
	}


	public void setNgayBd(Date ngayBd) {
		this.ngayBd = ngayBd;
	}


	public Date getNgayKt() {
		return ngayKt;
	}


	public void setNgayKt(Date ngayKt) {
		this.ngayKt = ngayKt;
	}


	public String getHinh() {
		return hinh;
	}


	public void setHinh(String hinh) {
		this.hinh = hinh;
	}
	
	
	
	
	
}
