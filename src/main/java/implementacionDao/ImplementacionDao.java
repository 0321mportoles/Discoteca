package implementacionDao;

import java.util.ArrayList;
import java.util.List;

import DI2021.Discoteca.dao.DAO;
import DI2021.Discoteca.models.Album;


public class ImplementacionDao implements DAO{
	private static List <Album> albums = new ArrayList<>();
	
	@Override
	public Object get(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List getAll() {
		return albums;
	}
	
	@Override
	public void save(Object t) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(Object t, String[] params) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(Object t) {
		((ImplementacionDao) albums).delete(t);
		
	}
}

