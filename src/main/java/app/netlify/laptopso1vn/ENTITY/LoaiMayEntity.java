package app.netlify.laptopso1vn.ENTITY;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "LoaiMayEntity")
@Table(name = "loaimay")
public class LoaiMayEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maloaimay")
	private int maLoaiMay;
	
	@Column(name = "tenloai")
	private String tenLoai;
	
	

	@JsonbTransient
	@OneToMany(mappedBy = "loaiMayEntity", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<LaptopEntity> laptopList = new ArrayList<>();
	
	

	public LoaiMayEntity() {
	}
	
	

	public LoaiMayEntity(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public LoaiMayEntity(int maLoaiMay, String tenLoai, List<LaptopEntity> laptopList) {
		super();
		this.maLoaiMay = maLoaiMay;
		this.tenLoai = tenLoai;
		this.laptopList = laptopList;
	}

	public int getMaLoaiMay() {
		return maLoaiMay;
	}

	public void setMaLoaiMay(int maLoaiMay) {
		this.maLoaiMay = maLoaiMay;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public List<LaptopEntity> getLaptopList() {
		return laptopList;
	}

	public void setLaptopList(List<LaptopEntity> laptopList) {
		this.laptopList = laptopList;
	}

	
	//Phải chuyển lại dạng json để gửi vào model laptop nếu không sẽ xảy ra lỗi StackException
	public Map<String,String> covertToJson(){
		Map<String,String> loaiMayJson = new HashMap<String, String>();
		loaiMayJson.put("maLoai", String.valueOf(maLoaiMay));
		loaiMayJson.put("tenLoai", tenLoai);
		return loaiMayJson;
		
	}

	@Override
	public String toString() {
		return "LoaiMayEntity [maLoaiMay=" + maLoaiMay + ", tenLoai=" + tenLoai + ", laptopList=" + laptopList + "]";
	}




	
	
	
	
}
