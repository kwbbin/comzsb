package Interceptor;

import bean.Admin;
import bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import service.RegisterServiceImpl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor  implements HandlerInterceptor {
    @Autowired
    RegisterServiceImpl service;


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getSession().getAttribute("student")==null&&request.getSession().getAttribute("admin")==null){
            String userNumber=null;
            String password=null;
            String AdminNumber=null;
            String AdminPassword=null;
            Cookie[] cookies = request.getCookies();
            if (null==cookies) {
                return true;
            } else {
                for(Cookie cookie : cookies){
                    if("loginStudentPhone".equals(cookie.getName())){
                        userNumber=cookie.getValue();
                    }
                    if("loginStudentPassword".equals(cookie.getName())){
                        password=cookie.getValue();
                    }

                    if("loginAdminPhone".equals(cookie.getName())){
                        AdminNumber=cookie.getValue();
                    }
                    if("loginAdminPassword".equals(cookie.getName())){
                        AdminPassword=cookie.getValue();
                    }
                }
                if(AdminNumber!=null||AdminPassword!=null){
                    Admin admin=service.getAdminByPhoneAndPass(new Admin(AdminNumber,AdminPassword));
                    request.getSession().setAttribute("admin", admin);
                }else if(userNumber!=null||password!=null){
                    Student student=service.getStudentByPhoneAndPass(new Student(userNumber,password));
                    request.getSession().setAttribute("student", student);
                }
            }
        }
        return true;
    }



    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
