package team4.library.project.book;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BookDaoImpl implements BookDao{
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String BOOKS_NS="team4.library.project.book.BooksMapper.";
	@Override
	public int BooksAdd(Book book) {
		
		return sqlSession.insert(BOOKS_NS+"BooksAdd", book);
	}
	@Override
	public List<Genre> genreSelect() {
		
		return sqlSession.selectList(BOOKS_NS+"genreSelect");
	}
	@Override
	public int disposalAdd(Disposal disposal) {
		
		return sqlSession.insert(BOOKS_NS+"disposalAdd", disposal);
	}
	@Override
	public int stateUpdate(Book book) {
		// TODO Auto-generated method stub
		return sqlSession.update(BOOKS_NS+"stateUpdate", book);
	}


}
