package Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LimitInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("student")== null && request.getRequestURI().indexOf("denglu.jsp") == -1//未登陆、当前不是登陆的Jsp、也不是登陆的.do
                && request.getRequestURI().indexOf("index.do") == -1) {//判断条件可以酌情添加
            String location = "/index.do";//定义当访客非法访问不被允许的地址时跳转的界面
            request.getRequestDispatcher(location).forward(request, response);//跳转至指定界面
            response.setHeader("Cache-Control", "no-store");
            response.setDateHeader("Expires", 0);
            response.setHeader("Pragma", "no-cache");
            return false;
        }else{
            return true;
        }

    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
