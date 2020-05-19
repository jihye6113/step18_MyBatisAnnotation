package kosta.orm.repository;

import kosta.orm.domain.Employees;

public class MainApp {

	public static void main(String[] args) {
//		System.out.println("1. 사원 first_name 가져오기");
		EmpDAO dao = new EmpDAO();
//		dao.selectByName();
		
//		System.out.println("2. 등록하기");
//		dao.insert(new Employees(401, "haha", "haho@naver.com", null, null, 6000, null));
		
//		System.out.println("3. 삭제하기");
//		dao.delete(401);
		
//		System.out.println("4. 수정하기");
//		dao.update(new Employees(400, "queen", "qu@naver.com", null, null, 8000, null));
		
//		System.out.println("5. 전체검색하기");
//		dao.selectAll();
		
//		System.out.println("6. employeeId에 해당하는 검색");
//		dao.selectByEmpId(100);
		
//		System.out.println("7. 특정 컬럼을 기준으로 정렬하기");
//		dao.selectByEmpId("last_name");
		
//		System.out.println("8. salary 검색");
//		dao.selectWhereSalary(3000);
		
//		System.out.println("9. salary 최대 최소 사이 검색하기");
//		dao.selectByMinMax(2000, 2500);
		
//		System.out.println("10. KeyField와 KeyWord로 검색하기");
//		dao.selectByKeyField("last_name", "a");
		
		System.out.println("11. 동적 쿼리 테스트");
		dao.ifTest(new Employees(0, "King", null, null, null, 0, null));
	}

}