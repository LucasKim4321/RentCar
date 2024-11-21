package rentCarProgram.car.dao;

import java.sql.SQLException;
import java.util.List;

import rentCarProgram.car.vo.CarVO;
import rentCarProgram.member.vo.MemberVO;

public interface CarDAO {
	// 차량 정보 조회 기능 처리하는 인터페이스
	public List<CarVO> selectCar(CarVO carVO) throws Exception;
	// 차량 정보 등록 기능 처리하는 인터페이스
	public int insertCar(CarVO carVO) throws Exception;
	// 차량 정보 수정 기능 처리하는 인터페이스
	public int updateCar(CarVO carVO) throws Exception;
	// 차량 정보 삭제 기능 처리하는 인터페이스
	public int deleteCar(CarVO carVO) throws Exception;
	
	// 차량 번호 정보 조회
	public CarVO checkNum(String carNumber) throws Exception;
}