package bai4_2ChamDiemNhieuBai;

import java.util.Scanner;

public class ChamDiemNhieuBai {
	public static void main(String args[]){
		String result[]={"B","C","D","B","A","D","C","D","A","B"};
		String doTest[][];
		Scanner input = new Scanner(System.in);
		System.out.println("Bao nhieu bai kiem tra:");
		int soBai = Integer.parseInt(input.nextLine());
		doTest = new String [soBai][10];
		System.out.println("Nhap cau tra loi cua thi sinh:");
		for(int pos=0; pos<soBai;pos++){
			System.out.println("Thi sinh thu #"+pos+":");
			for(int pos1 = 0; pos1<10; pos1++){
				System.out.println("Nhap cau tra loi thu "+(pos1+1)+": ");
				doTest[pos][pos1] = input.nextLine();	
			}
			System.out.println("---------------------------------");
			
		}
		int count[] = new int [soBai];
		for(int pos =0; pos<soBai;pos++){
			for(int pos1 =0; pos1<10;pos1++){
				if(doTest[pos][pos1].equals(result[pos1])){
					count[pos]++;
				}
			}
		}
		for(int pos=0; pos<soBai;pos++){
			System.out.println("Thi sinh #"+(pos+1)+":");
			System.out.println("Diem:"+count[pos]+"/10");
		}
		
	}

}
