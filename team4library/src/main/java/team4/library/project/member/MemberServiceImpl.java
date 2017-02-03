package team4.library.project.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao memberDao;

	@Override
	public int addMember(Member member) {
		// TODO Auto-generated method stub
		return memberDao.memberAdd(member);
	}

	@Override
	public List<Memberlevel> Selectlevel() {
		// TODO Auto-generated method stub
		return memberDao.levelSelect();
	}

}
