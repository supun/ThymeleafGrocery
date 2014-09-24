/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Sep 24, 2014
 */
package com.supun.thymeleaf.business.services;

import java.util.List;

import com.supun.thymeleaf.business.entities.Product;
import com.supun.thymeleaf.business.entities.repositories.ProductRepository;

public class ProductService
{

	public ProductService()
	{
		super();
	}

	public List<Product> findAll()
	{
		return ProductRepository.getInstance().findAll();
	}

	public Product findById( final Integer id )
	{
		return ProductRepository.getInstance().findById( id );
	}

}
