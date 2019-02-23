package gayu.shopbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gayu.shopbackend.dao.CategoryDAO;
import gayu.shopbackend.dto.category;

@Repository("categoryDAO")

public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	private static List<category> categories = new ArrayList<category>();

	static {
		category category = new category();

		category.setId(1);
		category.setName("watch");
		category.setDescription("Royal oak is the most desired brand of 2k18 and is loved by almost all girls");
		category.setImageURL("img.png");

		categories.add(category);

		category = new category();

		category.setId(2);
		category.setName("handbag");
		category.setDescription("Micheal kors is the most desired brand of 2k18 and is loved by almost all girls");
		category.setImageURL("img2.png");

		categories.add(category);

		category = new category();

		category.setId(3);
		category.setName("dress");
		category.setDescription("H&M is the most desired brand of 2k18 and is loved by almost all girls");
		category.setImageURL("img3.png");

		categories.add(category);
	}

	public List<category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	public category get(int id) {

		// enhanced for loop

		for (category category : categories) {

			if (category.getId() == id)
				return category;

		}

		return null;

	}

@Transactional

public boolean add(category category) {

		try {
sessionFactory.getCurrentSession().persist(category);
			return true;
		} 
		catch (Exception ex) {

			ex.printStackTrace();
			return false;
		}
		
	}
}