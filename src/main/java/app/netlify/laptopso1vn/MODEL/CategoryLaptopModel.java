package app.netlify.laptopso1vn.MODEL;

import java.util.ArrayList;
import java.util.List;

import app.netlify.laptopso1vn.ENTITY.LaptopEntity;
import app.netlify.laptopso1vn.ENTITY.LoaiMayEntity;



public class CategoryLaptopModel {

	private int maLoaiMay;
	private String tenLoai;
	private List<LaptopModel> laptopList = new ArrayList<>();
	
	public CategoryLaptopModel() {
	}


	public CategoryLaptopModel(int maLoaiMay, String tenLoai, List<LaptopModel> laptopList) {
		super();
		this.maLoaiMay = maLoaiMay;
		this.tenLoai = tenLoai;
		this.laptopList = laptopList;
	}
	
	public CategoryLaptopModel(LoaiMayEntity loaiMayEntity) {
		this.maLoaiMay = loaiMayEntity.getMaLoaiMay();
		this.tenLoai = loaiMayEntity.getTenLoai();
		for (LaptopEntity laptopEntity : loaiMayEntity.getLaptopList()) {
			this.laptopList.add(new LaptopModel(laptopEntity));
		}
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
	public List<LaptopModel> getLaptopList() {
		return laptopList;
	}
	public void setLaptopList(List<LaptopModel> laptopList) {
		this.laptopList = laptopList;
	}
	
	
	
}
