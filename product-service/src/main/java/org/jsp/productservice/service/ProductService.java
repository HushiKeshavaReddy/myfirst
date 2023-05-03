package org.jsp.productservice.service;

import java.util.List;

import org.jsp.productservice.entity.ProductEntity;

public interface ProductService 
{
    public ProductEntity saveProduct(ProductEntity entity);
	
	public ProductEntity findProductById(Long id);
	
	public List<ProductEntity> findAllProduct();
	
	public Integer findProductQuantityById(Long id);
	
	public ProductEntity deleteProductByid(Long id);
	
	public ProductEntity Product(ProductEntity entity);
	
	public List<ProductEntity> FindAllProductSortedByName();

}
