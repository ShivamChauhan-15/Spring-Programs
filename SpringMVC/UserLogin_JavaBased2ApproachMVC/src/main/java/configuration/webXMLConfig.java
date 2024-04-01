package configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class webXMLConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
       return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class []arr={DispatcherServletConfig.class};
        return arr;
    }

    @Override
    protected String[] getServletMappings() {
       String arrMaping[]={"/"};
       return arrMaping;
    }

}
