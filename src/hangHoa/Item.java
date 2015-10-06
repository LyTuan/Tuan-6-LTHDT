package hangHoa;

public class Item {
	private String tenHang;
	private int donGia;
	
	public String getMaHang() {
		return tenHang;
	}
	public void setMaHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	
	public Item(String tenHang, int donGia){
		this.tenHang = tenHang;
		this.donGia =donGia;
	}
}
