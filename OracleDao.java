package sec03.exam03;

public class OracleDao implements DataAccessObject{
	
	@Override
	public void select() {
		System.out.println("Orecle DB���� �˻�");
	}
	
	@Override
	public void insert() {
		System.out.println("Orecle DB�� ����");
	}
	
	@Override
	public void update() {
		System.out.println("Orecle DB�� ����");
	}
	
	@Override
	public void delete() {
		System.out.println("Orecle DB���� ����");
	}

}
