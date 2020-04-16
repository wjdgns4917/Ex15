package com.one;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FileWriter fout=null;
		int c;
		try {
			fout=new FileWriter("c:\\Temp\\test.txt"); //파일과 연결된 출력문자 스트림 생성
			while (true) {
				String line=sc.nextLine(); //빈칸을 포함하여 한줄읽기
				if (line.length()==0) //한줄에 엔터키만 입력한 경우
					break;
				fout.write(line,0,line.length()); //읽은 문자열을 파일에 저장
				fout.write("\r\n", 0, 2); //한줄 띄기 위해 \r\n을 파일에 저장
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();		
	}
}
