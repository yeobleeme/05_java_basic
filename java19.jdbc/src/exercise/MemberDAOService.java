package exercise;

import java.util.ArrayList;

public interface MemberDAOService {
	
	void createMember();
	ArrayList<MemberVO> listMember();
	MemberVO viewMember(String member_name);
	void updateMember(String member_name);
	void deleteMember(String member_name);
	
	ArrayList<MemberVO> findByNameMember(String member_name);
	ArrayList<MemberVO> findByEmailMember(String member_email);

}
