package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookInsert {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      Class.forName("oracle.jdbc.OracleDriver");

      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";
      con = DriverManager.getConnection(url, user, password);

      // INSERT INTO BOOKTBL (code, title, writer, price)
      // VALUES(1000,'자바 프로그래밍 입문, 박은종, 20800');

      String sql =
        "INSERT INTO BOOKTBL (code, title, writer, price)VALUES(1000,'자바 프로그래밍 입문', '박은종', 20800)";
      pstmt = con.prepareStatement(sql);

      int result = pstmt.executeUpdate();

      if (result > 0) {
        System.out.println("입력 성공");
      } else {
        System.out.println("입력 실패");
      }
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if (pstmt != null) {
          pstmt.close();
        }
        if (con != null) {
          con.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
