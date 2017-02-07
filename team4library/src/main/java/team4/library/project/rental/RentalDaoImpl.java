package team4.library.project.rental;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RentalDaoImpl implements RentalDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private String RENTAL_NS="team4.library.project.rental.RentalMapper.";
	@Override
	public int rentalAdd(Rental rental) {
		// TODO Auto-generated method stub
		return sqlSession.insert(RENTAL_NS+"Addrental", rental);
	}

	@Override
	public Rental rentalSelect(int bookCode) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(RENTAL_NS+"Selectrental", bookCode);
	}

	@Override
	public int rentalReturn(Rental rental) {
		// TODO Auto-generated method stub
		return sqlSession.update(RENTAL_NS+"Returnrental", rental);
	}



	

}
