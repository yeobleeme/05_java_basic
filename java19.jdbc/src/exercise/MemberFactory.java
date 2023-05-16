package exercise;

public class MemberFactory {
	
	private MemberFactory() {}
	private static MemberDAOImpl dbdao = null;
	public static MemberDAOImpl getInstance() {
		if(dbdao == null) dbdao = new MemberDAOImpl();
		return dbdao;
	}

}
