package htw.berlin.addressbook.web;

import htw.berlin.addressbook.config.Endpoints;
import htw.berlin.addressbook.config.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {

    @GetMapping(path = Endpoints.INDEX)
    public ModelAndView showIndexPage(){
        return new ModelAndView(ViewNames.INDEX);
    }

    @GetMapping(path = Endpoints.GALLERY)
    public ModelAndView showGalleryPage(){
        return new ModelAndView(ViewNames.GALLERY);
    }

    @GetMapping(path = Endpoints.LOGIN)
    public ModelAndView showLoginPage(){
        return new ModelAndView(ViewNames.LOGIN);
    }

    @GetMapping(path = Endpoints.ADDRESSBOOK)
    public ModelAndView showAddressbookPage(){
        return new ModelAndView(ViewNames.ADDRESSBOOK);
    }

    @GetMapping(path=Endpoints.VUE)
     public ModelAndView showVue(){
        return new ModelAndView(ViewNames.VUE);
    }

    @GetMapping(path=Endpoints.VUEDYNAMIC)
    public ModelAndView showVueDynamic(){
        return new ModelAndView(ViewNames.VUEDYNAMIC);
    }
}
