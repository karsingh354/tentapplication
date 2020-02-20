package com.tentbookingdetails.tentbookingdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DetailsController {

	@Autowired
	private DetailsService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Details> listdetails = service.listAll();
		model.addAttribute("listdetails", listdetails);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Details details = new Details();
		model.addAttribute("details", details);
		
		return "new_details";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("details") Details details) {
		//details.setCustomerid(0L);
		service.save(details);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{customerid}")
	public ModelAndView showEditProductPage(@PathVariable(name = "customerid") int customerid) {
		ModelAndView mav = new ModelAndView("edit_details");
		Details details = service.get(customerid);
		mav.addObject("details", details);
		
		return mav;
	}
	
	@RequestMapping("/delete/{customerid}")
	public String deleteProduct(@PathVariable(name = "customerid") int customerid) {
		service.delete(customerid);
		return "redirect:/";		
	}
}

