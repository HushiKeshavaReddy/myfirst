package org.jsp.productservice.dto;

public class ProductServiceDTO 
{
	    private Long altkey;
		
		private String name;
		
		private Double price;
		
		private Integer quantity;

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
			return "ProductServiceDTO [altkey=" + altkey + ", name=" + name + ", price=" + price + ", quantity="
					+ quantity + ", description=" + description + "]";
		}
}
