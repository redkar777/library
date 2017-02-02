package team4.library.project;

import java.util.List;

public interface LibraryService {
	int addLibrary(Library library);
	List<Local> selectLocal();
	Library libraryLogin(Library library);
}
