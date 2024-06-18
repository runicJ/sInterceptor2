package com.spring.sInterceptor2.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Level99Interceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {  // 가로 안 세션x, 부모 것 갖다 쓴것(오버라이드)
		
		HttpSession session = request.getSession();
		int level = session.getAttribute("sLevel")==null ? 99 : (int) session.getAttribute("sLevel");
		
		if(level == 99) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/message/hoewonNo");
			dispatcher.forward(request, response);
			return false;
		}
		
		return true;
	}
	
}
