package kosta.orm.repository;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis 설정에 관련된 로드, 연결
 * */
public class Dbutil {

	private static SqlSessionFactory factory;
	
	static {
		// MyBatis 환경설정 문서 로딩하여 SqlSessionFactory를 생성한다.
		try {
			String resource = "config/SqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
//	public static void main(String[] args) {
//		System.out.println("되니??" + factory);
//	}
	
	/**
	 * CRUD 작업을 실행하기 위해서 필요한 SqlSession 객체 리턴
	 * */
	public static SqlSession getSession() {
		return factory.openSession();
	}
	
	/**
	 * 닫기 기능 (Select인 경우)
	 * */
	public static void sessionClose(SqlSession session) {
		if(session!=null) session.close();
	}
	
	/**
	 * 닫기 기능(insert, update, delete - DML)
	 * @param: boolean 형은 true이면 commit, false이면 rollback
	 * */
	public static void sessionClose(SqlSession session, boolean state) {
		if(session!=null) {
			if(state) session.commit();
			else session.rollback();
			
			session.close();
		}
	}
}