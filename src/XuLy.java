
public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
         
		int x =20;
		int y =19;
		int KetQua = tinhTong(x, y);
		
		System.out.println("Kết quả là: " + KetQua);
	}
	
	public static int tinhTong(int a,int b) {
		int tong = a + b;
		return tong;
	}

}
