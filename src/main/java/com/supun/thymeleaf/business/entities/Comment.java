/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Sep 24, 2014
 */
package com.supun.thymeleaf.business.entities;

public class Comment
{
	private Integer id = null;
	private String text = null;

	public Comment()
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

	public String getText()
	{
		return this.text;
	}

	public void setText( final String text )
	{
		this.text = text;
	}
}
