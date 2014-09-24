/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Sep 24, 2014
 */
package com.supun.thymeleaf.web.controller;

import java.util.Calendar;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

public class HomeController implements IGTVGController
{

	public HomeController()
	{
		super();
	}

	public void process( final HttpServletRequest request, final HttpServletResponse response, final ServletContext servletContext, final TemplateEngine templateEngine ) throws Exception
	{

		WebContext ctx = new WebContext( request, response, servletContext, request.getLocale() );
		ctx.setVariable( "today", Calendar.getInstance() );

		templateEngine.process( "home", ctx, response.getWriter() );

	}

}
