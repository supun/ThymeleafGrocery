/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Sep 24, 2014
 */
package com.supun.thymeleaf.web.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;

public interface IGTVGController
{

	public void process( HttpServletRequest request, HttpServletResponse response, ServletContext servletContext, TemplateEngine templateEngine ) throws Exception;

}
