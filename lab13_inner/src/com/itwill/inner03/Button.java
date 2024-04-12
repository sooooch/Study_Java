package com.itwill.inner03;

public class Button {
	// public static 내부 인터페이스 -> static 은 생략 가능
	 public interface OnClickListener{
		 void onClick(); // public abstract 메서드
	 }
	 
	 private String btnName;
	 private OnClickListener listener;	 
	 
	 public Button(String btnName)	{
		 this.btnName = btnName;
	 }
	 
	// setter
	 public void setOnClickListener(OnClickListener listener) {
		 this.listener = listener;
	 }
	 
	 
	 public void click() {
		 System.out.print(btnName + " 버튼: ");
		 listener.onClick();
	 }
}

