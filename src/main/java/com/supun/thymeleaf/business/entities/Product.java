/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Sep 24, 2014
 */
package com.supun.thymeleaf.business.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product
{

	private Integer id = null;
	private String name = null;
	private BigDecimal price = null;
	private boolean inStock = false;
	private List<Comment> comments = new ArrayList<Comment>();

	public Product()
	{
		super();
	}

	public Integer getId()
	{
		return id;
	}

	public void setId( Integer id )
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice( BigDecimal price )
	{
		this.price = price;
	}

	public boolean isInStock()
	{
		return inStock;
	}

	public void setInStock( boolean inStock )
	{
		this.inStock = inStock;
	}

	public List<Comment> getComments()
	{
		return comments;
	}

	public void setComments( List<Comment> comments )
	{
		this.comments = comments;
	}

}
