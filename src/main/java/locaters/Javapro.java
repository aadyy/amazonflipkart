package locaters;

	import java.sql.CallableStatement;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import pageClass.Base;

public class Javapro extends Base {
	
	static String dbURL = Base.getPropertyFile("database.properties","url");
	static String dbuser = Base.getPropertyFile("database.properties","user");
	static  String dbpassword = Base.getPropertyFile("database.properties","password");
	public static String otprecivedviUserID="";
	public static String otprecivedviaMobilenumber="";
	
			public static void main(String[] args) {
				getOtpviaMobilenumberFun("5118225331");
				System.out.println("OTP read"+otprecivedviaMobilenumber);
			}

			
		
			public static void getOtpviaMobilenumberFun(String mobilenumber) {
				try {
					Connection connection = DriverManager.getConnection(dbURL, dbuser, dbpassword);
					if (connection != null) {
						System.out.println("Connected to the database");
						try {
							CallableStatement pstmt = connection.prepareCall("{call PrcGetOtpLogForTestingTeam(?,?)}");
							pstmt.setObject("MobileNo", mobilenumber); 
							pstmt.setObject("PlainTextMobileNo", mobilenumber); 
							//System.out.println("Mobile no OTP Page: "+Mobile_no);
							ResultSet result = pstmt.executeQuery();

							while (result.next()) {					 
							otprecivedviaMobilenumber=String.valueOf(result.getObject(4));
							System.out.println("OTP is :"+otprecivedviaMobilenumber);	                
							}
							
						} finally {
							connection.close();
						}

					} 
				} catch (SQLException e) {
					System.out.println("Exception is:" + e.getMessage());
					e.printStackTrace();
					}
				}
			
}



