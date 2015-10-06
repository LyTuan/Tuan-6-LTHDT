package hangHoa;

public class InvoiceLineItem {
	private Item item;
	private int soLuong;
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getSubTotal(){
		return soLuong*item.getDonGia();
	}
	public InvoiceLineItem(Item item, int soLuong){
		this.item =item;
		this.soLuong =soLuong;
	}
}
