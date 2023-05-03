package org.jsp.productservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Product_Details_info")
public class ProductEntity implements Serializable
{
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "alt_key")
	private Long altkey;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="description")
	private String description;

	public Long getAltkey() {
		return altkey;
	}

	public void setAltkey(Long altkey) {
		this.altkey = altkey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductEntity [altkey=" + altkey + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", description=" + description + ", getAltkey()=" + getAltkey() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + ", getDescription()="
				+ getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
