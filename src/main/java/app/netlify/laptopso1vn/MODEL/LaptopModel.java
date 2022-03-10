package app.netlify.laptopso1vn.MODEL;

import java.math.BigDecimal;
import java.util.Map;

import app.netlify.laptopso1vn.ENTITY.LaptopEntity;
import app.netlify.laptopso1vn.ENUM.CategoryProduct;

public class LaptopModel {


	private int maSp;
	private String tenSp;
	private String moTa;
	private int soLuong;
	private String hinh;
	private BigDecimal gia;
	private CategoryProduct loaiSp;
	private String tinhTrang;
	private String trongLuong;
	private String manHinh;
	private String oCung;
	private String vga;
	private String ram;
	private String cpu;
	private Map<String,String> categoryLaptop;
	
	public LaptopModel(int maSp, String tenSp, String moTa, int soLuong, String hinh, BigDecimal gia,
			CategoryProduct loaiSp, String tinhTrang, String trongLuong, String manHinh, String oCung, String vga,
			String ram, String cpu) {
		super();
		this.maSp = maSp;
		this.tenSp = tenSp;
		this.moTa = moTa;
		this.soLuong = soLuong;
		this.hinh = hinh;
		this.gia = gia;
		this.loaiSp = loaiSp;
		this.tinhTrang = tinhTrang;
		this.trongLuong = trongLuong;
		this.manHinh = manHinh;
		this.oCung = oCung;
		this.vga = vga;
		this.ram = ram;
		this.cpu = cpu;
	}
	
	public LaptopModel(int maSp, String tenSp, String moTa, int soLuong, String hinh, BigDecimal gia,
			CategoryProduct loaiSp, String tinhTrang, String trongLuong, String manHinh, String oCung, String vga,
			String ram, String cpu, Map<String,String> categoryLaptopModel) {
		super();
		this.maSp = maSp;
		this.tenSp = tenSp;
		this.moTa = moTa;
		this.soLuong = soLuong;
		this.hinh = hinh;
		this.gia = gia;
		this.loaiSp = loaiSp;
		this.tinhTrang = tinhTrang;
		this.trongLuong = trongLuong;
		this.manHinh = manHinh;
		this.oCung = oCung;
		this.vga = vga;
		this.ram = ram;
		this.cpu = cpu;
		this.categoryLaptop = categoryLaptopModel;
	}

	public LaptopModel() {
	}

	public LaptopModel(LaptopEntity laptopEntity) {
		
		this.maSp = laptopEntity.getMaSp();
		this.tenSp = laptopEntity.getTenSp();
		this.moTa = laptopEntity.getMoTa();
		this.soLuong = laptopEntity.getSoLuong();
		this.hinh = laptopEntity.getHinh();
		this.gia = laptopEntity.getGia();
		this.loaiSp = laptopEntity.getLoaiSp();
		this.tinhTrang = laptopEntity.getTinhTrang();
		this.trongLuong = laptopEntity.getTrongLuong();
		this.manHinh = laptopEntity.getManHinh();
		this.oCung = laptopEntity.getoCung();
		this.vga = laptopEntity.getVga();
		this.ram = laptopEntity.getRam();
		this.cpu = laptopEntity.getCpu();
		this.categoryLaptop = laptopEntity.getLoaiMayEntity().covertToJson();
	}

	public Map<String,String> getCategoryLaptop() {
		return categoryLaptop;
	}

	public void setCategoryLaptop(Map<String,String> categoryLaptopModel) {
		this.categoryLaptop = categoryLaptopModel;
	}
	
	public int getMaSp() {
		return maSp;
	}
	public void setMaSp(int maSp) {
		this.maSp = maSp;
	}
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
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
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public String getTrongLuong() {
		return trongLuong;
	}
	public void setTrongLuong(String trongLuong) {
		this.trongLuong = trongLuong;
	}
	public String getManHinh() {
		return manHinh;
	}
	public void setManHinh(String manHinh) {
		this.manHinh = manHinh;
	}
	public String getoCung() {
		return oCung;
	}
	public void setoCung(String oCung) {
		this.oCung = oCung;
	}
	public String getVga() {
		return vga;
	}
	public void setVga(String vga) {
		this.vga = vga;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	

}
