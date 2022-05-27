package com.olx.masterdata.Controller;
import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.olx.masterdata.Service.CategoriesServices;

	

	@RestController
	@RequestMapping(value = "/advertise")
	public class categoriecontroller {
		
		@Autowired
		CategoriesServices catService;
		
		
		@GetMapping("/categories")
		public List<categorie> allCategories() {
			List<categorie> categories = catService.allcategorie();
			return categories;
		}

	}

