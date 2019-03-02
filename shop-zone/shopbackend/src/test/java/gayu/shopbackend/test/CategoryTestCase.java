package gayu.shopbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import gayu.shopbackend.dao.CategoryDAO;
import gayu.shopbackend.dto.category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private category category;
	
	@BeforeClass
	
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("gayu.shopbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	@Test
	public void testAddCategory()
	{
		category = new category();
		
		category.setName("handbag");
		category.setDescription("Micheal kors is the most desired brand of 2k18 and is loved by almost all girls");
		category.setImageURL("img2.png");

		assertEquals("successfully added",true,categoryDAO.add(category));
	}
	
	
	
}


