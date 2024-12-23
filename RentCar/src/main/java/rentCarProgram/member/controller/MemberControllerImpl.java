package rentCarProgram.member.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import rentCarProgram.member.dao.MemberDAO;
import rentCarProgram.member.dao.MemberDAOImpl;
import rentCarProgram.member.vo.MemberVO;

public class MemberControllerImpl implements MemberController {
	
	public MemberDAO memberDAO;  // 이유?

	public MemberControllerImpl() {
		memberDAO = new MemberDAOImpl();
	}
	
	@Override
	public List<MemberVO> listMember(MemberVO memberVO) {
		// 회원 정보 조회하는 dao 호출
		List<MemberVO> memList = new ArrayList<MemberVO>();
		
		try {
			memList =  memberDAO.selectMember(memberVO);
			
		} catch (Exception e) {System.out.println(e.getMessage());	}
		return memList;
	}

	@Override
	public int regMember(MemberVO memberVO) {
		//회원 정보 등록 하는 dao 호출
		int result = 0;
		try {
			result = memberDAO.insertMember(memberVO);
		} catch (Exception e) { System.out.println(e.getMessage());	}
		
		return result;
	}

	@Override
	public int modMember(MemberVO memberVO) {
		//회원 정보 수정 하는 dao 호출
		int result = 0;
		try {
			result = memberDAO.updateMember(memberVO);
		} catch (Exception e) { System.out.println(e.getMessage());	}
		
		return result;
	}

	@Override
	public int removeMember(MemberVO memberVO) {
		//회원 정보 삭제 하는 dao 호출
		int result = 0;
		try {
			result = memberDAO.deleteMember(memberVO);
		} catch (Exception e) { System.out.println(e.getMessage());	}
		
		return result;
	}

	@Override
	public MemberVO checkId(String memId) {
		// 회원 등록시 중복 체크하는 dao 호출
		MemberVO vo = new MemberVO();
			try {
				vo = memberDAO.checkId(memId);  // 중복체크 : 찾아서 있으면 값이 들어있고 아니면 null
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}
		return vo;
	}

}