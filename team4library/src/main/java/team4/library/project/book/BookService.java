package team4.library.project.book;

import java.util.List;

public interface BookService {
	int AddBooks(Book book);
	List<Genre> selectGenre();
	int Adddisposal(Disposal disposal);
	int UpdateState(Book book);
}
