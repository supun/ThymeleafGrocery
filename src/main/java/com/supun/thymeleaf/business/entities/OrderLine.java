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

public class OrderLine
{

	private Product product = null;
	private Integer amount = null;
	private BigDecimal purchasePrice = null;

	public OrderLine()
	{
		super();
	}

	public Product getProduct()
	{
		return this.product;
	}

	public void setProduct( final Product product )
	{
		this.product = product;
	}

	public Integer getAmount()
	{
		return this.amount;
	}

	public void setAmount( final Integer amount )
	{
		this.amount = amount;
	}

	public BigDecimal getPurchasePrice()
	{
		return this.purchasePrice;
	}

	public void setPurchasePrice( final BigDecimal purchasePrice )
	{
		this.purchasePrice = purchasePrice;
	}

}
