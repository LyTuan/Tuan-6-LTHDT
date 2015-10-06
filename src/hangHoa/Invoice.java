package hangHoa;

import java.util.LinkedList;

public class Invoice {
	private LinkedList<InvoiceLineItem> arrayItem = new LinkedList<>();
	public void addInvoiceLineItem(InvoiceLineItem invoiceLineItem){
		arrayItem.add(invoiceLineItem);
	}
	public int getTotal(){
		int total=0;
		for(InvoiceLineItem in:arrayItem){
			total+=in.getSubTotal();
		}
		return total;
	}
	public void printListChoose(){
		int dem =1;
		for(InvoiceLineItem in: arrayItem){
			System.out.println(dem+"\t\t"+in.getItem().getMaHang()+"\t\t"+in.getSoLuong()+"\t\t"+in.getSubTotal());
			dem++;
		}
	}
}
