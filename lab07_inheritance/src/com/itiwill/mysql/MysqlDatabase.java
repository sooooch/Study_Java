package com.itiwill.mysql;

import com.itiwill.database.Database;

public class MysqlDatabase implements Database {
//	public static final int VERSION = 1;
	
	@Override
	public int select() {
		System.out.println(">>> MySQL 테이블 검색");
		return 1;
	}
	
	@Override
	public int insert()	{
		System.out.println(">>>MySQL 테이블 자료 추가");
		return 1;
	}
	
}
