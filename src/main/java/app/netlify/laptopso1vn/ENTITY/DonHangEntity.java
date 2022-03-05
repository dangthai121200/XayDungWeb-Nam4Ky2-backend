package app.netlify.laptopso1vn.ENTITY;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import app.netlify.laptopso1vn.ENUM.Status;


@Entity(name = "DonHangEntity")
@Table(name = "donhang")
public class DonHangEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "madon")
	private int maDon;
	
	@Column(name = "ngaytao")
	private Date ngayTao;
	
	@Column(name = "nguoinhan")
	private String nguoiNhan;
	
	
	@Convert(converter = StatusCovert.class)
	@Column(name = "tinhtrang")
	private Status tinhTrang;
	
	@Column(name = "sdt")
	private String sdt;
	
	@Column(name = "diachigiao")
	private String diaChiGiao;
	
	@Column(name = "ptthanhtoan")
	private String ptThanhToan;
	
	@Column(name = "tongtien")
	private BigDecimal tongTien;
	
//	@Transient
//	private KhachHangEntity khachHangEntity;
//	@Transient
//	private DotKhuyenMaiEntity dotKhuyenMaiEntity;
	
	
	
	@Override
	public String toString() {
		return "DonHangEntity [maDon=" + maDon + ", ngayTao=" + ngayTao + ", nguoiNhan=" + nguoiNhan + ", tinhTrang="
				+ tinhTrang.getTitle() + ", sdt=" + sdt + ", diaChiGiao=" + diaChiGiao + ", ptThanhToan=" + ptThanhToan
				+ ", tongTien=" + tongTien + "]";
	}

	public DonHangEntity() {
	}
	
	public DonHangEntity(int maDon, Date ngayTao, String nguoiNhan, Status tinhTrang, String sdt, String diaChiGiao,
			String ptThanhToan, BigDecimal tongTien) {
		super();
		this.maDon = maDon;
		this.ngayTao = ngayTao;
		this.nguoiNhan = nguoiNhan;
		this.tinhTrang = tinhTrang;
		this.sdt = sdt;
		this.diaChiGiao = diaChiGiao;
		this.ptThanhToan = ptThanhToan;
		this.tongTien = tongTien;
	}
	
	public DonHangEntity(Date ngayTao, String nguoiNhan, Status tinhTrang, String sdt, String diaChiGiao,
			String ptThanhToan, BigDecimal tongTien) {
		this.ngayTao = ngayTao;
		this.nguoiNhan = nguoiNhan;
		this.tinhTrang = tinhTrang;
		this.sdt = sdt;
		this.diaChiGiao = diaChiGiao;
		this.ptThanhToan = ptThanhToan;
		this.tongTien = tongTien;
	}

	public int getMaDon() {
		return maDon;
	}

	public void setMaDon(int maDon) {
		this.maDon = maDon;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getNguoiNhan() {
		return nguoiNhan;
	}

	public void setNguoiNhan(String nguoiNhan) {
		this.nguoiNhan = nguoiNhan;
	}

	public Status getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(Status tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChiGiao() {
		return diaChiGiao;
	}

	public void setDiaChiGiao(String diaChiGiao) {
		this.diaChiGiao = diaChiGiao;
	}

	public String getPtThanhToan() {
		return ptThanhToan;
	}

	public void setPtThanhToan(String ptThanhToan) {
		this.ptThanhToan = ptThanhToan;
	}

	public BigDecimal getTongTien() {
		return tongTien;
	}

	public void setTongTien(BigDecimal tongTien) {
		this.tongTien = tongTien;
	}


	
}


@Converter
class StatusCovert implements AttributeConverter<Status, String>{

	@Override
	public String convertToDatabaseColumn(Status status) {
		
		if (status == Status.APPORVE) {
			return status.getTitle();
		} else if (status == Status.PENDING) {
			return status.getTitle();
		} else {
			return null;
		}
	}

	@Override
	public Status convertToEntityAttribute(String statusStr) {
		
		if (Status.APPORVE.getTitle().equals(statusStr)) {
			return  Status.APPORVE;
		} else if (Status.PENDING.getTitle().equals(statusStr)) {
			return Status.PENDING;
		} else {
			return null;
		}
		
	}
	
}
