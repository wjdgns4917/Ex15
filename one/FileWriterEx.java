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
			fout=new FileWriter("c:\\Temp\\test.txt"); //���ϰ� ����� ��¹��� ��Ʈ�� ����
			while (true) {
				String line=sc.nextLine(); //��ĭ�� �����Ͽ� �����б�
				if (line.length()==0) //���ٿ� ����Ű�� �Է��� ���
					break;
				fout.write(line,0,line.length()); //���� ���ڿ��� ���Ͽ� ����
				fout.write("\r\n", 0, 2); //���� ��� ���� \r\n�� ���Ͽ� ����
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		sc.close();		
	}
}
