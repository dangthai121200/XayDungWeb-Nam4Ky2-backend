package app.netlify.laptopso1vn.ENTITY;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import app.netlify.laptopso1vn.COVERENUM.CategoryProductCovert;
import app.netlify.laptopso1vn.ENUM.CategoryProduct;


@Table(name = "phukien")
@Entity(name = "PhuKienEntity")
public class PhuKienEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "masp")
	private int masp;
	
	@Column(name = "tensp")
	private String tensp;
	
	@Column(name = "mota")
	private String mota;
	
	@Column(name = "soluong")
	private String soluong;
	
	@Column(name = "hinh")
	private String hinh;
	
	@Column(name = "gia")
	private BigDecimal gia;
	
	@Column(name = "loaisp")
	@Convert(converter = CategoryProductCovert.class)
	private CategoryProduct loaiSp;
	
	@Column(name = "tinhtrang")
	private String tinhtrang;
	
	@Column(name = "mahang")
	private int mahang;
	
	
	@ManyToOne
	@JoinColumn(name = "maloaipk", table = "phukien")
	private LoaiPhuKienEntity loaiLoaiPhuKienEntity;
	
	public PhuKienEntity(int masp, String tensp, String mota, String soluong, String hinh, BigDecimal gia,
			String tinhtrang, int mahang) {
		super();
		this.masp = masp;
		this.tensp = tensp;
		this.mota = mota;
		this.soluong = soluong;
		this.hinh = hinh;
		this.gia = gia;
		this.tinhtrang = tinhtrang;
		this.mahang = mahang;
	}

	public PhuKienEntity() {
		super();
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
	
	
	

	public CategoryProduct getLoaiSp() {
		return loaiSp;
	}

	public void setLoaiSp(CategoryProduct loaiSp) {
		this.loaiSp = loaiSp;
	}

	public LoaiPhuKienEntity getLoaiLoaiPhuKienEntity() {
		return loaiLoaiPhuKienEntity;
	}

	public void setLoaiLoaiPhuKienEntity(LoaiPhuKienEntity loaiLoaiPhuKienEntity) {
		this.loaiLoaiPhuKienEntity = loaiLoaiPhuKienEntity;
	}

	@Override
	public String toString() {
		return "PhuKienEntity [masp=" + masp + ", tensp=" + tensp + ", mota=" + mota + ", soluong=" + soluong
				+ ", hinh=" + hinh + ", gia=" + gia + ", loaiSp=" + loaiSp + ", tinhtrang=" + tinhtrang + ", mahang="
				+ mahang + ", loaiLoaiPhuKienEntity=" + loaiLoaiPhuKienEntity.getTenloai() + "]";
	}

	
	
	
	
	
	
	
	
}
