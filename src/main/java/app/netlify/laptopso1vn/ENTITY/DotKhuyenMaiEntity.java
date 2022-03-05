package app.netlify.laptopso1vn.ENTITY;

import java.util.Date;

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
	private int maKm;
	private String tenKm;
	private String moTa;
	private String giaTriGiam;
	private Date ngayBd;
	private Date ngayKt;
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
	
	
	
	
	
}
