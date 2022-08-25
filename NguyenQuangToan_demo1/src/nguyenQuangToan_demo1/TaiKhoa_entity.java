package nguyenQuangToan_demo1;

public class TaiKhoa_entity {
	private String taikhoan;
	private String matkhau;
	public String getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	@Override
	public String toString() {
		return "TaiKhoa_entity [taikhoan=" + taikhoan + ", matkhau=" + matkhau + ", getTaikhoan()=" + getTaikhoan()
				+ ", getMatkhau()=" + getMatkhau() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public TaiKhoa_entity(String taikhoan, String matkhau) {
		super();
		this.taikhoan = taikhoan;
		this.matkhau = matkhau;
	}
	
}
