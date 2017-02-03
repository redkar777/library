package team4.library.project.member;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String MEMBER_NS="team4.library.project.member.MemberMapper.";
	@Override
	public int memberAdd(Member member) {
			
		return sqlSession.insert(MEMBER_NS+"memberAdd", member);
	}
	@Override
	public List<Memberlevel> levelSelect() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(MEMBER_NS+"levelSelect");
	}

}
