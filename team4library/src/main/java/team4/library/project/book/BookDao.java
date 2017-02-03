package team4.library.project.book;

import java.util.List;


public interface BookDao {
	int BooksAdd(Book book);
	List<Genre> genreSelect();
	int disposalAdd(Disposal disposal);
	int stateUpdate(Book book);
}
