package org.jsp.productservice.repository.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.jsp.productservice.entity.ProductEntity;
import org.jsp.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImp implements ProductRepository
{
     @Autowired
     private SessionFactory sessionFactory;
	@Override
	public ProductEntity saveProduct(ProductEntity entity) 
	{
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    session.merge(entity);
	    transaction.commit();
	    session.close();
	    return entity;
	}

	@Override
	public ProductEntity findProductById(Long id) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("from ProductEntity where altkey=:n");
		Session session = sessionFactory.openSession();
		return session.get(ProductEntity.class,id);
		
	}

	@Override
	public List<ProductEntity> findAllProduct() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("from ProductEntity");
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(stringBuilder.toString());
		
		return query.getResultList();
	}

	@Override
	public Integer findProductQuantityById(Long id) 
	{
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		ProductEntity entity = session.get(ProductEntity.class, id);
		return entity.getQuantity();
	}

	@Override
	public ProductEntity deleteProductByid(Long id) {
		// TODO Auto-generated method stub
		ProductEntity findProductById = findProductById(id);
		Session session =sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.delete(findProductById);
		beginTransaction.commit();
		
		return findProductById;
	}

	@Override
	public ProductEntity Product(ProductEntity entity) 
	{
		// TODO Auto-generated method stub
		
		return null;
	}

}
