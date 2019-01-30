package com.hackerrank.challenges;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/*Important points about Java ArrayList 
 *  class can contain duplicate elements.
	class maintains insertion order.
 	class is non synchronized.
	Allows random access because array works at the index basis.
	manipulation is slow because a lot of shifting needs to occur if any element is removed from the array list.
 */
public class ArrayListSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductBean pb1 = new ProductBean("P001","Pussay","don't know",0.45);
		ProductBean pb2 = new ProductBean("P002","Pussay","don't know",0.55);
		ProductBean pb3 = new ProductBean("P003","Pussay","don't know",0.65);
		
		try {
			//serialization
			FileOutputStream foos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(foos);
			oos.writeObject(pb1);
			oos.writeObject(pb2);
			oos.writeObject(pb3);
			oos.close();
			foos.close();
			//desrialization
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ProductBean[] pBean = (ProductBean[])ois.readObject();
//			for (ProductBean productBean : pBean) {
//				System.out.println(productBean.getProdName());
//				System.out.println(productBean.getProdPrice());
//			}
			System.out.println(pBean.length);
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
