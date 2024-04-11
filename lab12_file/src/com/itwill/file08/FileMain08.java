package com.itwill.file08;

import java.io.File;

/*
 * 파일, 폴더(디렉토리) 관리 - 정보, 생성, 삭제.
 * 
 * 현재 작업 폴더(CWD): 
 *   현재 프로그램(프로세스)가 실행되는 폴더 위치.
 * 	 이클립스에서 자바 프로그램을 실행(Run as Java application)할 때, 현재 작업폴더의 위치는 프로젝트 폴더.
 * 
 * 절대 경로(absolute path):
 * - 시스템의 루트(C:\, D:\, ...)부터 파일 또는 폴더가 있는 위치까지를 찾아가는 방식.
 * - (Windows 예) C:\Users\itwill\git\Study_Java\lab12_file\data
 * - (MacOS, Linux 예) /users/itwill/documents/hello.txt
 * 
 * 상대 경로(relative path):
 * - 현재 작업 폴더를 기준으로 파일 또는 폴더 위치를 찾아가는 방식.
 * - (Windows 예) data\hello.txt
 * - (MacOS, Linux 예) documents/hello.txt
 * - 현재 폳더: .  (예) .\data\hello.txt
 * - 상위 폴더: .. (예) ..\src\com\itwill\file08\FileMain.java
 * 
 * 
 * 파일 구분자(file separator):
 * - 상위 폴더와 하위 폴더, 폴더와 파일을 구분하기 위한 기호(문자).
 * - Windows: \(backslash)
 * - Windows를 제외한 다른 OS: /(slash)
 * - 문자열("") 안에서 백슬래쉬는 특별한 의미(escape 문자)
 *   - "\n": new line
 *   - "\t": tab
 *   - "\s": 공백
 *   - "\\": backslash
 * - MS Windows에서 경로를 문자열로 표현: "C:\\study\\workspace\\lab12"
 * - 다른 OS에서 경로를 문자열로 표현: "/wsers/itwill/docoments"
 * 
 */

public class FileMain08 {

	public static void main(String[] args) {
		// 이클립스에서 자바 프로그램이 실행되는 현재 작업 디렉토리(CWD)
		String cwd = System.getProperty("user.dir");
		System.out.println("CWD : " + cwd);

		String path = "C:\\Users\\itwill\\git\\Study_Java\\lab12_file"; // Windows 절대 경로 표현법
		System.out.println(path);

		// String path2 = "data\\hello.txt"; // Windows에서 상대 경로
		String path2 = "data" + File.separator + "hello.txt"; // OS에 무관한 상대 경로
		System.out.println(path2);

		// File 클래스:
		// 파일(txt, jpg, mp4, pptx, ...)과 폴더(디렉토리)에 관련된 기능들을 가지고 있는 클래스.
		// File 타입 객체 생성 - 파일(파일&폴더)을 관리하는 객체 생성.

		File f = new File(path2);
		System.out.println("경로: " + f.getPath());
		System.out.println("절대경로: " + f.getAbsolutePath());
		System.out.println("존재 여부: " + f.exists());
		System.out.println("파일 여부: " + f.isFile());
		System.out.println("폴더 여부: " + f.isDirectory());
		System.out.println("파일 크기: " + f.length() + "바이트");
		
		// 새 폴더 만들기
        File testFolder = new File("test"); // new File(상위폴더, 하위폴더/파일)
        if (testFolder.exists()) {
            System.out.println("폴더가 이미 존재합니다...");
        } else {
        	testFolder.mkdir(); // make directory
            System.out.println("폴더 생성 성공");
        }
       
        // 폴더 삭제
        if (testFolder.exists()) {
        	testFolder.delete();
        	System.out.println("폴더 삭제 성공");
        } else {
        	System.out.println("폴더가 존재하지 않습니다");
        }
		

	}

}
