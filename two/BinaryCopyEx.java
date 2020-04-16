package com.two;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {
	public static void main(String[] args) {
		File src=new File("c:\\Users\\Public\\Pictures\\Sample Pictures\\desert.jpg"); //�������� ��θ�
		File dest=new File("c:\\Temp\\copyimg.jpg"); // �������� ��θ�
		int c;
		long start=System.currentTimeMillis(); //���� ������
		try {
			FileInputStream fi=new FileInputStream(src); //���� �Է� ����Ʈ ��Ʈ�� ����
			FileOutputStream fo=new FileOutputStream(dest); // ���� ��� ����Ʈ ��Ʈ�� ����
			
			while ((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			long end=System.currentTimeMillis(); //���� �Ϸ����
			System.out.println("����ð� : "+(end-start));
			System.out.println(src.getPath()+"�� "+dest.getPath()+"�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���Ϻ��� ����");		
		}
	}
}
