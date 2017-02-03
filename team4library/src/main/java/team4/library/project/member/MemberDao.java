package team4.library.project.member;

import java.util.List;

public interface MemberDao {
	int memberAdd(Member member);
	List<Memberlevel> levelSelect();
}
