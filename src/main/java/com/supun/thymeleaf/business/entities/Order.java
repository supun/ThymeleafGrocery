/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Sep 24, 2014
 */
package com.supun.thymeleaf.business.entities;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

public class Order
{

	private Integer id = null;
	private Calendar date = null;
	private Customer customer = null;
	private Set<OrderLine> orderLines = new LinkedHashSet<OrderLine>();

	public Order()
	{
		super();
	}

	public Integer getId()
	{
		return this.id;
	}

	public void setId( final Integer id )
	{
		this.id = id;
	}

	public Calendar getDate()
	{
		return this.date;
	}

	public void setDate( final Calendar date )
	{
		this.date = date;
	}

	public Customer getCustomer()
	{
		return this.customer;
	}

	public void setCustomer( final Customer customer )
	{
		this.customer = customer;
	}

	public Set<OrderLine> getOrderLines()
	{
		return this.orderLines;
	}

}
