package com.itwill.ver02;

import java.util.Scanner;

import com.itwill.ver01.Contact;
import com.itwill.ver01.ContactMain;

public class ContactMain02 {
	private static final int MAX_LENGTH = 3;
	private Scanner scanner = new Scanner(System.in);
	private Contact[] contacts = new Contact[MAX_LENGTH];
	private int count = 0;
	private ContactDao dao = ContactDaoImpl.getInstance();
	
	// MVC 아키텍쳐에서 View 역할
	public static void main(String[] args) {
		ContactDao dao = ContactDaoImpl.getInstance();
		System.out.println("*** 연락처 프로그램 v0.2 ***");
		ContactMain02 app = new ContactMain02();
		
		boolean run = true; // 프로그램 계속 실행(return=true) 또는 종료(run=false) 여부를 저장하기 위한 변수.
		while (run) {
			int menu = app.showMainMenu();

			switch (menu) {
			case 0:
				run = false;
				break;
			case 1:
				app.saveNewContact();
				break;
			case 2:
				app.readAllContacts();
				break;
			case 3:
				app.readContactByIndex();
				break;
			case 4:
				app.updateContactByIndex();
				break;
			default:
				System.out.println("메뉴 번호(0 - 4)를 확인하세요.");
			}
		}

		System.out.println(" >>> 프로그램 종료 >>>");
	}
	private void updateContactByIndex() {
		System.out.println("\n--- 인덱스 수정 ---");
		System.out.print("인덱스 입력 : ");
		int index = Integer.parseInt(scanner.nextLine());
		if (count <= index || index < 0) {
			System.out.println("검색한 연락처가 없습니다");

		} else {
			System.out.println("수정 전: " + "[" + index + "] " + contacts[index].toString());
			System.out.print("이름 수정 : ");
			String name = scanner.nextLine();

			System.out.print("전화번호 수정 : ");
			String phone = scanner.nextLine();

			System.out.print("이메일 수정 : ");
			String email = scanner.nextLine();

			// 입력한 내욧ㅇ으로 배열의 내용을 업데이트
			contacts[index].setName(name);
			contacts[index].setPhone(phone);
			contacts[index].setEmail(email);
//				contacts[index] = new Contact(name, phone, email);

			System.out.println("수정 후: " + "[" + index + "] " + contacts[index].toString());
		}
	}

	private void readContactByIndex() {
		System.out.println("\n--- 인덱스 검색 ---");
		System.out.print("인덱스 입력 : ");
		int index = Integer.parseInt(scanner.nextLine());
		if (count <= index || index < 0) {
			System.out.println("검색한 연락처가 없습니다");
			// 해당 인덱스의 연락처를 출력
		} else {
			System.out.println("[" + index + "]" + contacts[index].toString());

		}
	}

	private void readAllContacts() {
		System.out.println("\n--- 연락처 목록 ---");
		for (int i = 0; i < count; i++) {
			System.out.println("[" + i + "] " + contacts[i].toString());
		}
	}

	private void saveNewContact() {
		
		if (((ContactDaoImpl)dao).isMemoryFull()) {
			System.out.println("저장 가능한 연락처를 초과 했습니다");
			return;          // 메서드 종료 - > 사용하면 else 없이 할 수 있음 if count == MAX_LENGTH 해야함
		}
			System.out.println("\n--- 새 연락처 저장 ---");
			System.out.print("이름 입력 : ");
			String name = scanner.nextLine();

			System.out.print("전화번호 입력 : ");
			String phone = scanner.nextLine();

			System.out.print("이메일 입력 : ");
			String email = scanner.nextLine();

			Contact contact = new Contact(name, phone, email);
			  int result = dao.create(contact);
		        if (result == 1) {
		            System.out.println(">>> 연락처 저장 성공");
		        } else {
		            System.out.println(">>> 연락처 저장 실패");
		        }
			// Contact 타입 객체를 연락처 배열 인덱스 count에 저장
			contacts[count] = contact;
			// 배열에 저장 후에는 연락처 저장 개수(인덱스)를 증가
			count++;

		}
	

	private int showMainMenu() {
		System.out.println("\n--------------------------------------------");
		System.out.println("[0]종료 [1]저장 [2]목록 [3]인덱스검색 [4]수정");
		System.out.println("\n--------------------------------------------");
		System.out.print("선택 : ");
		
		int menu = inputInteger();
		return menu;

	}
	private int inputInteger() {
		
		 int result = 0;
	        
	        while(true) {
	            try {
	                result = Integer.parseInt(scanner.nextLine());
	                break;
	            } catch (NumberFormatException e) {
	                System.out.println("입력값은 정수여야 합니다.");
	                System.out.print("정수 입력>> ");
	            }
	        }
	        
	        return result;
	}
}