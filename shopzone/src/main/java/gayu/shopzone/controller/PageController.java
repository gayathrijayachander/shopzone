package gayu.shopzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gayu.shopbackend.dao.CategoryDAO;
import gayu.shopbackend.dto.category;

@Controller

public class PageController {

	@Autowired
	
	private CategoryDAO categoryDAO;
	
	
	
	
@RequestMapping(value = {"/","/home","/index"})	

	public ModelAndView index()
	
	{
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","home");
	
	// PASSING THE LIST OF CATEGORIES
	mv.addObject("categories", categoryDAO.list());
	
	
	mv.addObject("userClickHome",true);
	return mv;
	
	}

@RequestMapping(value = "/about")	

public ModelAndView about()

{

ModelAndView mv = new ModelAndView("page");
mv.addObject("title","about");
mv.addObject("userClickAbout",true);
return mv;

}
@RequestMapping(value = "/contact")	

public ModelAndView contact()

{

ModelAndView mv = new ModelAndView("page");
mv.addObject("title","contact");
mv.addObject("userClickContact",true);
return mv;

}


/**
 * method to load all the products
 */

@RequestMapping(value = "show/all/products")	

public ModelAndView showAllProducts()

{

ModelAndView mv = new ModelAndView("page");
mv.addObject("title","All Products");

// PASSING THE LIST OF CATEGORIES
mv.addObject("categories", categoryDAO.list());


mv.addObject("userClickAllProducts",true);
return mv;

}

@RequestMapping(value = "show/category/{id}/products")	

public ModelAndView showCategoryProducts(@PathVariable("id") int id)

{

ModelAndView mv = new ModelAndView("page");

//categoryDAO to fetch a single category

category category = null;
category = categoryDAO.get(id);

mv.addObject("title",category.getName());

// PASSING THE LIST OF CATEGORIES
mv.addObject("categories", categoryDAO.list());

//PASSING THE single category
mv.addObject("category", category);

mv.addObject("userClickCategoryProducts",true);
return mv;

}














}



