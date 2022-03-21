package app.netlify.laptopso1vn.MODEL;

import java.math.BigDecimal;


import app.netlify.laptopso1vn.ENTITY.LoaiPhuKienEntity;
import app.netlify.laptopso1vn.ENTITY.PhuKienEntity;
import app.netlify.laptopso1vn.ENUM.CategoryProduct;

public class AccessoryModel {

	private int masp;
	private String tensp;
	private String mota;
	private String soluong;
	private String hinh;
	private BigDecimal gia;
	private CategoryProduct loaiSp;
	private String tinhtrang;
	private int mahang;
	private CategoryAccessoryModel categoryAccessoryModel;
	
	public AccessoryModel() {
	}

	public AccessoryModel(int masp, String tensp, String mota, String soluong, String hinh, BigDecimal gia,
			CategoryProduct loaiSp, String tinhtrang, int mahang, CategoryAccessoryModel categoryAccessoryModel) {
		super();
		this.masp = masp;
		this.tensp = tensp;
		this.mota = mota;
		this.soluong = soluong;
		this.hinh = hinh;
		this.gia = gia;
		this.loaiSp = loaiSp;
		this.tinhtrang = tinhtrang;
		this.mahang = mahang;
		this.categoryAccessoryModel = categoryAccessoryModel;
	}
	
	




	public AccessoryModel(PhuKienEntity phuKienEntity) {
		this.masp = phuKienEntity.getMasp();
		this.tensp = phuKienEntity.getTensp();
		this.mota = phuKienEntity.getMota();
		this.soluong = phuKienEntity.getSoluong();
		this.hinh = phuKienEntity.getHinh();
		this.gia = phuKienEntity.getGia();
		this.loaiSp = phuKienEntity.getLoaiSp();
		this.tinhtrang = phuKienEntity.getTinhtrang();
		this.mahang = phuKienEntity.getMahang();
		this.categoryAccessoryModel = new CategoryAccessoryModel(phuKienEntity.getLoaiLoaiPhuKienEntity());
	}

	public int getMasp() {
		return masp;
	}




	public void setMasp(int masp) {
		this.masp = masp;
	}




	public String getTensp() {
		return tensp;
	}




	public void setTensp(String tensp) {
		this.tensp = tensp;
	}




	public String getMota() {
		return mota;
	}




	public void setMota(String mota) {
		this.mota = mota;
	}




	public String getSoluong() {
		return soluong;
	}




	public void setSoluong(String soluong) {
		this.soluong = soluong;
	}




	public String getHinh() {
		return hinh;
	}




	public void setHinh(String hinh) {
		this.hinh = hinh;
	}




	public BigDecimal getGia() {
		return gia;
	}




	public void setGia(BigDecimal gia) {
		this.gia = gia;
	}




	public CategoryProduct getLoaiSp() {
		return loaiSp;
	}




	public void setLoaiSp(CategoryProduct loaiSp) {
		this.loaiSp = loaiSp;
	}




	public String getTinhtrang() {
		return tinhtrang;
	}




	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}




	public int getMahang() {
		return mahang;
	}




	public void setMahang(int mahang) {
		this.mahang = mahang;
	}




	public CategoryAccessoryModel getCategoryAccessoryModel() {
		return categoryAccessoryModel;
	}




	public void setCategoryAccessoryModel(CategoryAccessoryModel categoryAccessoryModel) {
		this.categoryAccessoryModel = categoryAccessoryModel;
	}
	
	
	
}
