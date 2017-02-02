package team4.library.project;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class LibraryDaoImpl implements LibraryDao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String LIBRARY_NS = "team4.library.project.LibraryMapper.";
	@Override
	public int LibraryAdd(Library library) {
		
		
		return sqlSession.insert(LIBRARY_NS+"libraryAdd", library);
	}
	@Override
	public List<Local> localSelect() {
		
		return sqlSession.selectList(LIBRARY_NS+"localSelect");
	}
	@Override
	public Library loginLibrary(Library library) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(LIBRARY_NS+"libraryLogin", library);
	}
	
	

}
