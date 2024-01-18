package xls;
// www.qtpselenium.com.downloads/poi.rar
public class ManagingXLS {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir")+"//Data.xlsx";
		Xls_Reader xls = new Xls_Reader(path);
		// counting rows
		int rows = xls.getRowCount("LoginTest");
		System.out.println(rows);
		// counting cols
		int cols = xls.getColumnCount("LoginTest");
		System.out.println(cols);
		// reading
		String data = xls.getCellData("LoginTest", "Browser", 3);
		System.out.println(data);
		data = xls.getCellData("LoginTest", 3, 4);
		System.out.println(data);
		
		// writing
		xls.setCellData("LoginTest", "Browser", 20, "Hello");
		
		
		// logic to read complete contents
	}

}
