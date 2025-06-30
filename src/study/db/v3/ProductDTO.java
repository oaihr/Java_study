package study.db.v3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDTO {

	

	int pcode;
	String pname;
	int pPrice;

	public ProductDTO() {
	}

	public ProductDTO(int pcode, String pname, int pPrice) {
		this.pcode = pcode;
		this.pname = pname;
		this.pPrice = pPrice;
	}
	
	@Override
	public String toString() {
		return "ProductDTO [pcode=" + pcode + ", pname=" + pname + ", pPrice=" + pPrice + "]";
	}
	
	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

}
