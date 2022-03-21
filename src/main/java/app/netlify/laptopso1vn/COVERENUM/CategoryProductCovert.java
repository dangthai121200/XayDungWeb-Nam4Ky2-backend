package app.netlify.laptopso1vn.COVERENUM;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import app.netlify.laptopso1vn.ENUM.CategoryProduct;

@Converter
public class CategoryProductCovert implements AttributeConverter<CategoryProduct, String>{

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
