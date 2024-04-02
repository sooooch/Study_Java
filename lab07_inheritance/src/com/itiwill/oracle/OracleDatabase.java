package com.itiwill.oracle;

import com.itiwill.database.Database;

public class OracleDatabase implements Database {
	//public static final int VERSION = 1; // 인터페이스에서 약속을해서 없어도 ㄱㅊ
	
	@Override
	public int select() {
		System.out.println("Oracle 테이블 검색");
		return 0;
	}
	
	@Override
	public int insert()	{
		System.out.println("Oracle 테이블 데이터 추가");
		return 0;
	}
	
	
}
