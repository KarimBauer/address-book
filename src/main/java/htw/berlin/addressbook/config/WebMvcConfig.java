package htw.berlin.addressbook.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController(Endpoints.INDEX).setViewName(ViewNames.INDEX);
        registry.addViewController(Endpoints.LOGIN).setViewName(ViewNames.LOGIN);
        registry.addViewController(Endpoints.ADDRESSBOOK).setViewName(ViewNames.ADDRESSBOOK);
        registry.addViewController(Endpoints.GALLERY).setViewName(ViewNames.GALLERY);
        registry.addViewController(Endpoints.GETADDRESSES).setViewName(ViewNames.GETADDRESSES);
    }
}
