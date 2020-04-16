package com.two;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		File src=new File("c:\\Users\\Public\\Pictures\\Sample Pictures\\desert.jpg"); //�������� ��θ�
		File dest=new File("c:\\Temp\\copyimg.jpg"); // �������� ��θ�
		long start=System.currentTimeMillis(); //���� ������
		try {
			FileInputStream fi=new FileInputStream(src); //���� �Է� ����Ʈ ��Ʈ�� ����
			FileOutputStream fo=new FileOutputStream(dest); // ���� ��� ����Ʈ ��Ʈ�� ����
			byte[]buf=new byte [1024*10]; //10kb ����
			while (true) {
				int n=fi.read(buf); //���� ũ�⸸ŭ �б�. n�� ���� ���� ����Ʈ
				fo.write(buf, 0, n); //buf[0]���� n����Ʈ ����
				if (n<buf.length)
					break; // ���� ũ�⺸�� �۰� �о��� ������ ���ϳ��� ����. ��������
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
