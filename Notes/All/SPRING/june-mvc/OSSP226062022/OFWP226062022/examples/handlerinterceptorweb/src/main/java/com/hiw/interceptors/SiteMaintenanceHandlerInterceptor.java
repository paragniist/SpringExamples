package com.hiw.interceptors;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class SiteMaintenanceHandlerInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LocalDateTime now = LocalDateTime.now();
		if (now.getHour() >= 20 && now.getHour() <= 22) {
			response.sendRedirect("site-maintenance.jsp");
			return false;
		}
		return true;
	}

}
