package app.netlify.laptopso1vn.ENTITY;

import java.math.BigDecimal;

import javax.persistence.AttributeConverter;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import app.netlify.laptopso1vn.ENUM.CategoryProduct;

@Table(name = "laptop")
@Entity(name = "LaptopEntity")
public class LaptopEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "masp")
	private int maSp;
	
	@Column(name = "tensp")
	private String tenSp;
	
	@Column(name = "mota")
	private String moTa;
	
	@Column(name = "soluong")
	private int soLuong;
	
	@Column(name = "hinh")
	private String hinh;
	
	@Column(name = "gia")
	private BigDecimal gia;
	
	@Column(name = "loaisp")
	@Convert(converter = CategoryProductCovert.class)
	private CategoryProduct loaiSp;
	
	@Column(name = "tinhtrang")
	private String tinhTrang;
	
	@Column(name = "trongluong")
	private String trongLuong;
	
	@Column(name = "manhinh")
	private String manHinh;
	
	@Column(name = "ocung")
	private String oCung;
	
	@Column(name = "vga")
	private String vga;
	
	@Column(name = "ram")
	private String ram;
	
	@Column(name = "cpu")
	private String cpu;
	
	

	public LaptopEntity() {
	}

	public LaptopEntity(int maSp, String tenSp, String moTa, int soLuong, String hinh, BigDecimal gia,
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

	@Override
	public String toString() {
		return "LaptopEntity [maSp=" + maSp + ", tenSp=" + tenSp + ", moTa=" + moTa + ", soLuong=" + soLuong + ", hinh="
				+ hinh + ", gia=" + gia + ", loaiSp=" + loaiSp + ", tinhTrang=" + tinhTrang + ", trongLuong="
				+ trongLuong + ", manHinh=" + manHinh + ", oCung=" + oCung + ", vga=" + vga + ", ram=" + ram + ", cpu="
				+ cpu + "]";
	}
	
	
	
	
}

@Converter
class CategoryProductCovert implements AttributeConverter<CategoryProduct, String>{

	@Override
	public String convertToDatabaseColumn(CategoryProduct categoryProduct) {
		if(categoryProduct == CategoryProduct.ACCESSORY) {
			return categoryProduct.getTile();
		}else if(categoryProduct == CategoryProduct.LAPTOP) {
			return categoryProduct.getTile();
		}
		return null;
	}

	@Override
	public CategoryProduct convertToEntityAttribute(String categoryProduct) {
		if(categoryProduct.equals(CategoryProduct.ACCESSORY.getTile())) {
			return CategoryProduct.ACCESSORY;
		}else if(categoryProduct.equals(CategoryProduct.LAPTOP.getTile())) {
			return CategoryProduct.LAPTOP;
		}
		return null;
	}
	
}
