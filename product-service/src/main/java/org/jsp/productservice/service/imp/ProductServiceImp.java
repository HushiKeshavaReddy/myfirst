package org.jsp.productservice.service.imp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.jsp.productservice.entity.ProductEntity;
import org.jsp.productservice.repository.imp.ProductRepositoryImp;
import org.jsp.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService
{
	@Autowired
	private ProductRepositoryImp repositoryImp;

	@Override
	public ProductEntity saveProduct(ProductEntity entity) {
		// TODO Auto-generated method stub
		repositoryImp.saveProduct(entity);
		return entity;
	}

	@Override
	public ProductEntity findProductById(Long id) {
		// TODO Auto-generated method stub
		
		return repositoryImp.findProductById(id);
		
	}

	@Override
	public List<ProductEntity> findAllProduct() {
		// TODO Auto-generated method stub
		return repositoryImp.findAllProduct();
	}

	@Override
	public Integer findProductQuantityById(Long id) {
		// TODO Auto-generated method stub
		return repositoryImp.findProductQuantityById(id);
	}

	@Override
	public ProductEntity deleteProductByid(Long id) {
		// TODO Auto-generated method stub
		return repositoryImp.deleteProductByid(id);
	}

	@Override
	public ProductEntity Product(ProductEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductEntity> FindAllProductSortedByName() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
