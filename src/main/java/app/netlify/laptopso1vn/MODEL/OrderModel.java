package app.netlify.laptopso1vn.MODEL;

import java.math.BigDecimal;
import java.util.Date;


import app.netlify.laptopso1vn.ENTITY.DonHangEntity;
import app.netlify.laptopso1vn.ENUM.Status;

public class OrderModel {

	private int maDon;
	
	private Date ngayTao;
	
	private String nguoiNhan;
	
	private String tinhTrang;
	
	private String sdt;
	
	private String diaChiGiao;
	
	private String ptThanhToan;
	
	private BigDecimal tongTien;
	
	public OrderModel(DonHangEntity donHangEntity) {
		this.maDon = donHangEntity.getMaDon();
		this.ngayTao = donHangEntity.getNgayTao();
		this.nguoiNhan = donHangEntity.getNguoiNhan();
		this.tinhTrang = donHangEntity.getTinhTrang().getTitle();
		this.sdt = donHangEntity.getSdt();
		this.diaChiGiao = donHangEntity.getDiaChiGiao();
		this.ptThanhToan = donHangEntity.getPtThanhToan();
		this.tongTien = donHangEntity.getTongTien();
	}

	
	
	@Override
	public String toString() {
		return "OrderModel [maDon=" + maDon + ", ngayTao=" + ngayTao + ", nguoiNhan=" + nguoiNhan + ", tinhTrang="
				+ tinhTrang + ", sdt=" + sdt + ", diaChiGiao=" + diaChiGiao + ", ptThanhToan=" + ptThanhToan
				+ ", tongTien=" + tongTien + "]";
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

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
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
