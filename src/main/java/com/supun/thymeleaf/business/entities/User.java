/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Sep 24, 2014
 */
package com.supun.thymeleaf.business.entities;

public class User
{

	private String firstName = null;
	private String lastName = null;
	private String nationality = null;
	private Integer age = null;

	public User( final String firstName, final String lastName, final String nationality, final Integer age )
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		this.age = age;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public String getName()
	{
		return this.firstName + " " + this.lastName;
	}

	public String getNationality()
	{
		return this.nationality;
	}

	public Integer getAge()
	{
		return this.age;
	}

}
