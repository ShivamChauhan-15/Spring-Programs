package configuration1;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class webXMLConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
        //register dispatcher-servlet config class to WebApplicationContext
        context.register(DispatcherServletConfig.class);

        //Create DispatcherServlet
        DispatcherServlet d=new DispatcherServlet(context);

        ServletRegistration.Dynamic ds = servletContext.addServlet("DS", d);
        ds.addMapping("/");
        ds.setLoadOnStartup(1);

    }
}
