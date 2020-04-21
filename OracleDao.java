package sec03.exam03;

public class OracleDao implements DataAccessObject{
	
	@Override
	public void select() {
		System.out.println("Orecle DB에서 검색");
	}
	
	@Override
	public void insert() {
		System.out.println("Orecle DB에 삽입");
	}
	
	@Override
	public void update() {
		System.out.println("Orecle DB를 수정");
	}
	
	@Override
	public void delete() {
		System.out.println("Orecle DB에서 삭제");
	}

}
