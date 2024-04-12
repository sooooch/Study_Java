package com.itwill.file07;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/*
 * IO Stream: 바이트 스트림.  읽기/쓰기의 기본 단위는 byte 단위
 *   모든 종류의 파일(txt, jpg, mp4, pptx, pdf ...) 에서 사용 가능
 * InputStream
 * |__ FileInputStream, BurreredInputStream, ObjectInputStream ...
 * OutputStream
 * |__ FileOutputStream,BurreredOutputStream,ObjectOutputStream...
 * 
 * Reader/Writer: 문자 스트림. 읽기/쓰기의 기본 단위는 "문자(character)"
 */

public class FileMain07 {

	public static void main(String[] args) throws Exception {
		// 파일 이름
		final String utf8File = "data/utf8.txt"; // UTF-8 인코딩으로 저장한 파일
		final String ansiFile = "data/ansi.txt"; // ansi(ms949) 인코딩으로 저장한 파일

		// java 11 이전 버전에서 문자 스트림과 인코딩을 다루는 방법:
		// fileReader, FileWriter 클래스 생성자에서 인코딩 타입을 설정할 수 있는 방법이 없음

		// 1. FileInputStream(바이트 스트림) 객체를 생성
		FileInputStream in = new FileInputStream(ansiFile);
		// 2. 인코딩을 설정한 InputStreamReader(문자 스트림) 객체를 생성
		InputStreamReader isr = new InputStreamReader(in, "EUC-KR");                                //EUC-KR
		// 3. 읽기 속도를 빠르게 하기 위해서 버터(메모리)를 사용
		BufferedReader reader = new BufferedReader(isr);

		while (true) {
			int read = reader.read(); // 파일에서 1글자를 읽음
			if (read == -1) {
				break;
		
			}
			System.out.print((char) read);
		}
		System.out.println();
		reader.close();
		
		
		// Java 11 버전부터 FileReader, FileWriter 클래스에서 인코딩을 설정할 수 있는
		// 생성자를 제공하기 시작
		// 1. FileReader 객체를 생성할 때 인코딩 방식을 설정
		FileReader fr = new FileReader(utf8File, Charset.forName("UTF-8"));   //"UTF-8"
		// 2. 읽기 속도를 빠르게 하기 위해서 버퍼 사용
		BufferedReader br = new BufferedReader(fr);
		
//		while (true) {
//			int read = br.read();
//			if (read == -1) {
//				break;
//			}
		
		while (true) {
			
			 String line = br.readLine();
			 if (line == null) {
				 break;
			
			}
			 System.out.println(line);
		//	System.out.print((char)read);
		}
		System.out.println();
		
		br.close();
		
		
	}

}
