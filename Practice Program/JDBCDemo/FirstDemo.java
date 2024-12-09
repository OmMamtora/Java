package Programs.JDBCDemo;

import java.sql.*;

public class FirstDemo {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "OmMysql@2024";
        String query = "select username from student where userid = 3 ";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        String name = rs.getString("username");

        System.out.println(name);

        st.close();
        con.close();

    }
}
