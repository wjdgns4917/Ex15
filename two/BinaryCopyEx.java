package com.two;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {
	public static void main(String[] args) {
		File src=new File("c:\\Users\\Public\\Pictures\\Sample Pictures\\desert.jpg"); //원본파일 경로명
		File dest=new File("c:\\Temp\\copyimg.jpg"); // 복사파일 경로명
		int c;
		long start=System.currentTimeMillis(); //복사 진행전
		try {
			FileInputStream fi=new FileInputStream(src); //파일 입력 바이트 스트림 생성
			FileOutputStream fo=new FileOutputStream(dest); // 파일 출력 바이트 스트림 생성
			
			while ((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			long end=System.currentTimeMillis(); //복사 완료시점
			System.out.println("경과시간 : "+(end-start));
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일복사 오류");		
		}
	}
}
