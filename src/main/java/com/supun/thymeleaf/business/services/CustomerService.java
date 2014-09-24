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

import com.supun.thymeleaf.business.entities.Customer;
import com.supun.thymeleaf.business.entities.repositories.CustomerRepository;

public class CustomerService
{

	public CustomerService()
	{
		super();
	}

	public List<Customer> findAll()
	{
		return CustomerRepository.getInstance().findAll();
	}

	public Customer findById( final Integer id )
	{
		return CustomerRepository.getInstance().findById( id );
	}

}
