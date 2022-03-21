package app.netlify.laptopso1vn.MODEL;

import app.netlify.laptopso1vn.ENTITY.LoaiPhuKienEntity;

public class CategoryAccessoryModel {
	
	
	private int maloaipk;
	private String tenloai;
	
	public CategoryAccessoryModel(int maloaipk, String tenloai) {
		this.maloaipk = maloaipk;
		this.tenloai = tenloai;
	}
	
	public CategoryAccessoryModel() {
	}
	
	public CategoryAccessoryModel(LoaiPhuKienEntity loaiPhuKienEntity) {
		this.maloaipk = loaiPhuKienEntity.getMaloaipk();
		this.tenloai = loaiPhuKienEntity.getTenloai();
	}

	public int getMaloaipk() {
		return maloaipk;
	}
	public void setMaloaipk(int maloaipk) {
		this.maloaipk = maloaipk;
	}
	public String getTenloai() {
		return tenloai;
	}
	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}
	
	
}
