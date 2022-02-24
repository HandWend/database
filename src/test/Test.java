package test;

import java.sql.Timestamp;
import java.util.Date;

import dao.ExamDAO;
import domain.ExamVO;

public class Test {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		ExamVO vo = new ExamVO(0, "가변폭문자열", "고정폭문자열", 0.123, 
				new Date(), new Timestamp(System.currentTimeMillis()));
		
		dao.create();
	}

}
