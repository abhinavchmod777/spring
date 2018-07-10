package com.spring.InterceptorClasses;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekAccessInterceptor extends HandlerInterceptorAdapter 
{
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception
	{
		Calendar cal = Calendar.getInstance();
		int day = cal.get(cal.DAY_OF_WEEK);
		if(day==3)
		{
			response.getWriter().write("The website is closed today");
			return false;
		}
		return true;
		
	}
}
