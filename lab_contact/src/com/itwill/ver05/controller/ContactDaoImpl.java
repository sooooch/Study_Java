package com.itwill.ver05.controller;

import java.util.ArrayList;
import java.util.List;

import com.itwill.ver05.model.Contact;
import com.itwill.ver05.util.FileUtil;
// import static 문장: 클래스에서 public static 으로 선언된 멤버 (필드,메서드)의 이름 가져
import static com.itwill.ver05.util.FileUtil.*;

public class ContactDaoImpl implements ContactDao {
	private static ContactDaoImpl instance = null;

	private ContactDaoImpl() {
		// 데이터 폴더 초기화: 폴더가 없으면 새로 만듦

		initializeDataDir();

		// 연락처 데이터 초기화: 데이터 파일에서 리스트를 읽어오거나, 빈 리스트를 생성
		contacts = initializeData();
	}

	public static ContactDaoImpl getInstance() {
		if (instance == null) {
			instance = new ContactDaoImpl();
		}
		return instance;

	}

	private List<Contact> contacts;

	/**
	 * 인덱스가 연락처 리스트의 유효한 범위 안에 있는지를 리턴
	 * 
	 * @param index 검사할 인덱스
	 * @return 유효한 인덱스이면 true/false
	 */
	public boolean isValidIndex(int index) {
		return (index >= 0) && (index < contacts.size());
	}

	@Override
	public int create(Contact contact) {

		contacts.add(contact); // 리스트(메모리)에 추가.

		writeDataToFile(contacts); // 파일에 씀.

		return 1;
	}

	@Override
	public List<Contact> read() {

		return contacts;
	}

	@Override
	public Contact read(int index) {

		if (isValidIndex(index)) {

			return contacts.get(index);
		} else {
			return null;

		}

	}

	@Override
	public int update(int index, Contact contact) {
		if (!isValidIndex(index)) {

			return 0;
		} else {
			contacts.set(index, contact);
			writeDataToFile(contacts);
			return 1;
		}
	}

	@Override
	public int delete(int index) {
		if (isValidIndex(index)) {
			contacts.remove(index);
			writeDataToFile(contacts);
			return 1;
		}
		return 0;
	}

	@Override
	public List<Contact> search(String keyword) {
		List<Contact> result = new ArrayList<Contact>();
		
		for (Contact c : contacts) {
			if (c.getName().toLowerCase().contains(keyword.toLowerCase())||
			c.getPhone().toLowerCase().contains(keyword.toLowerCase())||
				c.getEmail().toLowerCase().contains(keyword.toLowerCase())) {
					result.add(c);
		}
		
		
		
	}
		return result;

}
}
