package org.jsp.productservice.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.jsp.productservice.entity.ProductEntity;
import org.jsp.productservice.service.imp.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class ProductController 
{
	@Autowired
	private ProductServiceImp productServiceImp;
	
	
	@PostMapping(value = "/saveproductdetails")
    public ProductEntity saveProduct(@RequestBody ProductEntity entity)
    {
    	return productServiceImp.saveProduct(entity);
    }
	
	
	@GetMapping(value = "/findproductdetailsbyid/{key}")
	public @ResponseBody ProductEntity findProductById(@PathVariable("key") Long id)
	{
		return productServiceImp.findProductById(id);
	}
	
	
	@GetMapping(value = "/findAllProduct")
	public @ResponseBody List<ProductEntity> findAllProduct()
	{
		return productServiceImp.findAllProduct();
	}
	
	
	@GetMapping(value = "/findproductquantity/{key}")
	public @ResponseBody Integer findProductQuantityById(@PathVariable("key") Long id)
	{
		return productServiceImp.findProductQuantityById(id);
	}
	
	
	@GetMapping(value = "/deleteproductbyid/{key}")
	public @ResponseBody ProductEntity deleteProductByid(@PathVariable("key") Long id)
	{
		return productServiceImp.deleteProductByid(id);
	}
	
	
	@GetMapping(value = "/FindAllProductSortedByName")
	public List<ProductEntity> FindAllProductSortedByName()
	{
		List<ProductEntity> findAllProduct = findAllProduct();
		       Comparator<ProductEntity> c1=(e1,e2)->
		       {
		    	   return e1.getName().compareToIgnoreCase(e2.getName());
		       };
		Collections.sort(findAllProduct,c1);
		return findAllProduct;
	}
}
