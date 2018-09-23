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
			readObj();//对象的序列化。
	}
		
		/*public static void writeObj() throws IOException {
			//1,明确存储对象的文件。
			FileOutputStream fos = new FileOutputStream("e:\\h.txt");
			//2，给操作文件对象加入写入对象功能。
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//3，调用了写入对象的方法。
			oos.writeObject(new Person("wangcai",20));
			//关闭资源。
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

