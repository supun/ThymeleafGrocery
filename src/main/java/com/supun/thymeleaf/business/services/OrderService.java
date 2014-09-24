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

import com.supun.thymeleaf.business.entities.Order;
import com.supun.thymeleaf.business.entities.repositories.OrderRepository;

public class OrderService
{

	public OrderService()
	{
		super();
	}

	public List<Order> findAll()
	{
		return OrderRepository.getInstance().findAll();
	}

	public Order findById( final Integer id )
	{
		return OrderRepository.getInstance().findById( id );
	}

	public List<Order> findByCustomerId( final Integer customerId )
	{
		return OrderRepository.getInstance().findByCustomerId( customerId );
	}

}
