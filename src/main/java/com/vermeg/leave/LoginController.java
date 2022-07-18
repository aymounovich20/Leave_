package com.vermeg.leave;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LoginController {
	
	@RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
    public ModelAndView login(ModelAndView mav) {
		  ModelAndView modelAndView = new ModelAndView();
	        modelAndView.setViewName("login");
	        return modelAndView;
	
	//UserInfo userInfo = userInfoService.findUserByEmail(auth.getName());

//	mav.addObject("userInfo", userInfo);
//	if (!(auth instanceof AnonymousAuthenticationToken)) {
//	    mav.setViewName("home");
//	    return mav;
//	}
//	mav.setViewName("login");
//	return mav;
    }

}
