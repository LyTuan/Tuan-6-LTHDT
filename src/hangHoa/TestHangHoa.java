package hangHoa;

import java.util.LinkedList;
import java.util.Scanner;

public class TestHangHoa {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		LinkedList <Item>listItem= new LinkedList<>();
		listItem.add(new Item("Shoes",100));
		listItem.add(new Item("T-Shirt",50));
		listItem.add(new Item("Jean",150));
		listItem.add(new Item("Shirt",40));
		listItem.add(new Item("Jacket",250));
		int dem=0;
		System.out.println("STT"+"\t\t"+"Ten"+"\t\t"+"Don gia");
		for(Item item:listItem){
			System.out.println(dem+"\t\t"+item.getMaHang()+"\t\t"+item.getDonGia());
			dem++;
		}
		dem =1;
		System.out.println("Nhap so loai hang can mua:");
		int soHangCanMua =Integer.parseInt(input.nextLine());
		Invoice khachHang1 = new Invoice();
		System.out.println("Nhap don hang:"+"\n"+"Enter the Ctr+z to stop.");
		
		while(dem!=soHangCanMua){
			System.out.println("Mat hang #"+dem);
			String tenHang =input.nextLine();
			System.out.println("So luong");
			int soLuong = Integer.parseInt(input.nextLine());
			Item temp=null;
			for(Item item:listItem){
				if(item.getMaHang().equals(tenHang)){
					temp =item;
					break;
				}
			}
			InvoiceLineItem invoiceLineItem = new InvoiceLineItem(temp, soLuong);
			khachHang1.addInvoiceLineItem(invoiceLineItem);
			dem++;
		}
		
		System.out.println("In hoa don:");
		System.out.println("STT"+"\t\t"+"Ten"+"\t\t"+"So luong"+"\t"+"Thanh tien");
		khachHang1.printListChoose();
		System.out.println("\t\t\t\t"+"Tong tien\t"+khachHang1.getTotal());
	}
}
