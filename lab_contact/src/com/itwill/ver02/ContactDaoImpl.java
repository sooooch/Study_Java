package com.itwill.ver02;

import com.itwill.ver01.Contact;

public class ContactDaoImpl implements ContactDao {

	private final int MAX_LENGTH = 3;

	private static ContactDaoImpl instance = null;

	private ContactDaoImpl() {
	}

	public static ContactDaoImpl getInstance() {
		if (instance == null) {
			instance = new ContactDaoImpl();
		}
		return instance;

	}

	// 연락처 정보를 저장할 배열 선언
	private Contact[] contacts = new Contact[MAX_LENGTH];

	int count = 0;

	//

	@Override
	public int create(Contact contact) {

		if (count < MAX_LENGTH) {
			contacts[count] = contact;
			count++;
			return 1;
		} else {

			return 0;
		}

	}

	@Override
	public Contact[] read() {
		Contact[] result = new Contact[count];
		for (int i = 0; i < count; i++) {
			result[i] = contacts[i];
		}

		return result;
	}

	@Override
	public Contact read(int index) {
		if (0 <= index && index < count) {
			return contacts[index];
		} else {
			return null;

		}

	}

	@Override
	public int update(int index, Contact contact) {
		if (0 <= index && index < count) {
			
			contacts[index] = contact;
			return 1;

		} else {
			return 0;
		}
	}
}
