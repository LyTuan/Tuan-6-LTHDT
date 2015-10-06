package bai4_1ChamThiTuDong;

import java.util.Scanner;

public class ChamDiem {
	public static void main(String args[]){
		String result[]={"B","C","D","B","A","D","C","D","A","B"};
		String doTest[]= new String [10];
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap cau tra loi cua thi sinh:");
		for(int pos=0; pos<10;pos++){
			System.out.println("Nhap cau tra loi thu "+(pos+1)+": ");
			doTest[pos] = input.nextLine();
		}
		int count =0;
		for(int pos =0; pos<10;pos++){
			if(result[pos].equals(doTest[pos])){
				count++;
			}
		}
		System.out.println("Diem:"+count+"/10");
	}

}
