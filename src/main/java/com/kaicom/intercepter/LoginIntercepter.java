package com.kaicom.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginIntercepter implements HandlerInterceptor{
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2) throws Exception {
		logger.info("****************************方法执行前********************************");
		String uri = req.getRequestURI();
		if(!uri.contains("login")){
			String login_user = (String)req.getSession().getAttribute("LOGIN_USER");
			if(null == login_user){
				resp.sendRedirect(req.getContextPath()+"/login.jsp");
				return false ;
			}
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		logger.info("****************************方法执行后********************************");
	}
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		logger.info("****************************页面渲染后********************************");
	}

}
