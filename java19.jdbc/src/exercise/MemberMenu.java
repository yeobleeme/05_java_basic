package exercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MemberMenu {
	
	private double ver;
	
	public MemberMenu(double ver) {
		this.ver = ver;
	}
	
public void mainMenu() throws Exception {
		
		MemberDAOImpl mbdao = MemberFactory.getInstance();
		
		while(true) {
			mainMenuText();
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			switch((char)br.read()) {
			case '1': mbdao.createMember(); break;
			case '2': mbdao.listMember(); break;
			case '3': mbdao.viewMember(null); break;
			case '4': mbdao.updateMember(null); break;
			case '5': mbdao.deleteMember(null); break;
			case '6': mbdao.findByNameMember(null); break;
			case '7': mbdao.findByEmailMember(null); break;
			case '0': System.out.println("프로그램 종료"); System.exit(0);
			}
		}
	}


	public void mainMenuText() {
	
		StringBuffer sb = new StringBuffer();
		sb.append("***** 회원관리 프로그램 V" + ver + "*****\n");
		sb.append("1. 신규회원 등록\n");
		sb.append("2. 전체회원 조회\n");
		sb.append("3. 회원상세 조회\n");
		sb.append("4. 회원정보 수정\n");
		sb.append("5. 회원정보 삭제\n");
		sb.append("6. 이름으로 회원 조회\n");
		sb.append("7. 이메일로 회원 조회\n");
		sb.append("0. 종료\n");
		sb.append("===========================\n");
		sb.append("처리할 작업번호를 입력하세요");
		System.out.println(sb.toString());		
	}

	public void mainMemberMenu() {
		MemberDAOImpl mbdao = MemberFactory.getInstance();
		
		while(true) {
			int menuNo = mainMenuUi();
			
			switch(menuNo) {
			case 1: makeMember(mbdao); break;
			case 2: listMember(mbdao); break;
			case 3: memberView(mbdao); break;
			case 4: updateMember(mbdao); break;
			case 5: deleteMember(mbdao); break;
			case 6: findByName(mbdao); break;
			case 7: findByEmail(mbdao); break;
			case 0: System.out.println("프로그램 종료"); System.exit(0);
			}			
		}
		
	}
	

	private void findByName(MemberDAOImpl mbdao) {
		String member_name = JOptionPane.showInputDialog("조회할 회원의 이름을 입력하세요.");
		ArrayList<MemberVO> members = mbdao.findByNameMember(member_name);

		
		System.out.println("=====================================================================================");
		System.out.println("ID\t\tPW\t\tNAME\t\tAGE\t\tGENDER\t\tEMAIL");
		System.out.println("=====================================================================================");
		
		for(MemberVO member:members) {
			System.out.println(member.toString());
		}
		System.out.println();
		System.out.println("------- 회원 목록 출력 종료 --------\n\n");
	}
	

	private void findByEmail(MemberDAOImpl mbdao) {
		String member_email = JOptionPane.showInputDialog("조회할 회원의 이메일을 입력하세요!!");				
		ArrayList<MemberVO> members = mbdao.findByEmailMember(member_email);
		
		System.out.println("=====================================================================================");
		System.out.println("ID\t\tPW\t\tNAME\t\tAGE\t\tGENDER\t\tEMAIL");
		System.out.println("=====================================================================================");
		
		for(MemberVO member:members) {
			System.out.println(member.toString());
		}
		System.out.println();
		System.out.println("------- 회원 목록 출력 종료 --------\n\n");		
	}

	
	private void deleteMember(MemberDAOImpl mbdao) {
		String member_name = JOptionPane.showInputDialog("삭제할 회원의 이름을 입력하세요.");
		String sql = "delete from member where member_name =?";
		
		if((member_name == null) || (member_name.equals(""))) {
			return;
		} else {
			mbdao.deleteMember(member_name);
		}
	}

	
	private void updateMember(MemberDAOImpl mbdao) {
		String member_name = JOptionPane.showInputDialog("수정할 회원의 이름을 입력하세요.");
		
		if((member_name == null) || (member_name.equals(""))) {
			return;
		} else {
			mbdao.updateMember(member_name);
		}
		
	}

	
	private void memberView(MemberDAOImpl mbdao) {
		String member_name = JOptionPane.showInputDialog("상세 조회할 회원의 이름을 입력하세요.");
		ArrayList<MemberVO> members = mbdao.findByNameMember(member_name);
		
		System.out.println("=====================================================================================");
		System.out.println("ID\t\tPW\t\tNAME\t\tAGE\t\tGENDER\t\tEMAIL");
		System.out.println("=====================================================================================");
		
		for(MemberVO member:members) {
			System.out.println(member.toString());
		}
		System.out.println();
		System.out.println("------- 회원 정보 출력 종료 --------\n\n");	
		
	}
	

	private void listMember(MemberDAOImpl mbdao) {
		ArrayList<MemberVO> members = mbdao.listMember();	
		System.out.println("=====================================================================================");
		System.out.println("ID\t\tPW\t\tNAME\t\tAGE\t\tGENDER\t\tEMAIL");
		System.out.println("=====================================================================================");
		
		for(MemberVO member:members) {
			System.out.println(member.toString());
		}
		System.out.println();
		System.out.println("------- 회원 목록 출력 종료 --------\n\n");
	}

	
	private void makeMember(MemberDAOImpl mbdao) {
		mbdao.createMember();		
	}

	
	private int mainMenuUi() {
		String menuNo = JOptionPane.showInputDialog(
				"***** 회원관리 프로그램 V1.0 *****\n\n" +
				"1. 신규회원 등록\n" +                     
				"2. 전체회원 조회\n" +                     
				"3. 회원상세 조회\n" +                     
				"4. 회원정보 수정\n" +                     
				"5. 회원정보 삭제\n" +                     
				"6. 이름으로 회원 조회\n" +                  
				"7. 이메일로 회원 조회\n" +                  
				"0. 종료\n" +                          
				"===========================\n" +   
				"처리할 작업번호를 입력하세요"                
		);
		if((menuNo == null) || (menuNo.equals(""))) {
			return 0;
		} else {
			return Integer.parseInt(menuNo);			
		}
		
	}
}