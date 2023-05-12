package com.marketing.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.entities.Real;
import com.marketing.services.RealService;
import com.marketing.util.EmailService;

@Controller
public class RealControl {

	@Autowired
	private RealService realService;
	//http://localhost:8080/create
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/create")
	public String viewCreateRealForm() {
		
		return "view_lead";
	}
	
	//http://localhost:8080/savereal
		@RequestMapping("/savereal")
		
		public String saveReal(@ModelAttribute("real")Real real,ModelMap model) {
			model.addAttribute("msg","Record is saved !!");
			emailService.sendEmail(real.getEmail(),"Welcome Email","Test");
			realService.saveOneReal(real);
			return "view_lead";
			
		}
		
		//http:localhost:8080/listall
		
		@RequestMapping("/listall")
		public String listReals(Model model) {
			List<Real> reals=realService.getAllReals();
			model.addAttribute("reals",reals);
			return "list_reals";
		}
		
		@RequestMapping("/delete")
		public String deleteOneReal(@RequestParam("id")long id,Model model) {   //when you have to read data from url use @RequestParam
			realService.deleteReal(id);
			List<Real>reals=realService.getAllReals();
			model.addAttribute("reals",reals);
			return "list_reals";
		}
		
		@RequestMapping("/update")
		public String updateOneReal(@RequestParam("id")long id,Model model) {
			Real real=realService.getRealById(id);
			model.addAttribute("real",real);
			return "update_real";
			
		}
		
		@RequestMapping("/updateReal")
		public String updateReal(@ModelAttribute("real")Real real,Model model) {
		
			realService.saveOneReal(real);
			List<Real>reals=realService.getAllReals();
			model.addAttribute("reals",reals);
			return "list_reals";
		}

}





