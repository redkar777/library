package team4.library.project;

import java.util.List;

public interface LibraryDao {
	int LibraryAdd(Library library);
	List<Local> localSelect();
}
