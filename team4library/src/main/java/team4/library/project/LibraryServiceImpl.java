package team4.library.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	private LibraryDao libraryDao;
	
	@Override
	public int addLibrary(Library library) {
		// TODO Auto-generated method stub
		return libraryDao.LibraryAdd(library);
	}

	@Override
	public List<Local> selectLocal() {
		
		return libraryDao.localSelect();
	}

	@Override
	public Library libraryLogin(Library library) {
		
		return libraryDao.loginLibrary(library);
	}

	

}
