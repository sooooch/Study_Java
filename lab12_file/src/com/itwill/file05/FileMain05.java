package com.itwill.file05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.itwill.file04.Product;

public class FileMain05 {

	public static void main(String[] args) {
		// 파일에 쓸(wirte)더미 데이터
		ArrayList<Product> List = new ArrayList<Product>();
		for (int i = 0; i < 1_000_000; i++) {
			List.add(new Product(i,"name_"+i,i));
		}
		
		System.out.println(List.size());
		
		// ArrayList를 저장하는 파일 이름
		String fileName = "data/product_list.dat";
		
		
		// Product 타입 객체 1,000,000개를 저장하는 ArrayList를 파일 쓰기
		// FOS, BOS, OOS을 이용
		try (
				FileOutputStream out = new FileOutputStream(fileName);
			 BufferedOutputStream bos = new BufferedOutputStream(out);
					 ObjectOutputStream oos = new ObjectOutputStream(bos)){
			oos.writeObject(List);
			
		} catch (Exception e)	{
			e.printStackTrace();
		}
		
		
		
		// 파일에서 객체를 읽어서 ArrayList<Product>로 변환하기
		// FIS, BIS, OIS을 이용
		
		try (FileInputStream in = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(in);
				ObjectInputStream ois = new ObjectInputStream(bis))	
		
		{
			ArrayList<Product> p = (ArrayList<Product>)ois.readObject();
			
			System.out.println(p);
			
		} catch (Exception e)	{
			e.printStackTrace();
		}
		
		
	}

}
