package com.niit.shoppingcart.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "CATEGORY")
@Component
public class Category<MultipartFile> {
	@Id
	private String id;
	private String name;
	private String description;
	@Transient
	private MultipartFile image;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getImage() {
		return image;
	}

public void setImage(MultipartFile image) {
	this.image = image;
}

@Override

public String toString() {

	return "Category [categoryId=" + id + ", categoryName=" + name + ", categoryDescription=" + description
				+ ", categoryImage=" + image + "]";

	}

	public Category()

{

		this.id = UUID.randomUUID().toString().substring(24).toUpperCase();

	}

}
