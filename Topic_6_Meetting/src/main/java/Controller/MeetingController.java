/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Frederic
 */
@Controller
public class MeetingController {

    @RequestMapping("/welcome")
    protected ModelAndView handleRequestInternal(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
       ModelAndView modelandview= new ModelAndView("index");
       modelandview.addObject("welcomeMessage", "Hi user, welcome to the first MVC app");
       
       return modelandview;
    }
    
}
