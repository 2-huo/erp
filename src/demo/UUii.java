package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UUii {
	public static void main(String[] args) throws Exception {
		/*	writeObj();*/
			readObj();//��������л���
	}
		
		/*public static void writeObj() throws IOException {
			//1,��ȷ�洢������ļ���
			FileOutputStream fos = new FileOutputStream("e:\\h.txt");
			//2���������ļ��������д������ܡ�
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//3��������д�����ķ�����
			oos.writeObject(new Person("wangcai",20));
			//�ر���Դ��
			oos.close();
		}
	*/
		
		public static void readObj() throws Exception {
			FileInputStream fis =  new FileInputStream("e:\\h.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
			Object  p= ois.readObject();
				System.out.println(p.toString());
				ois.close();
		}
	


		}

