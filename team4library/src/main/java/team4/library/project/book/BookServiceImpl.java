package team4.library.project.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookDao bookDao;
	
	@Override
	public int AddBooks(Book book) {
		
		return bookDao.BooksAdd(book);
	}

	@Override
	public List<Genre> selectGenre() {
		// TODO Auto-generated method stub
		return bookDao.genreSelect();
	}

	@Override
	public int Adddisposal(Disposal disposal) {
		// TODO Auto-generated method stub
		return bookDao.disposalAdd(disposal);
	}

	@Override
	public int UpdateState(Book book) {
		// TODO Auto-generated method stub
		return bookDao.stateUpdate(book);
	}

	
	
	
}
