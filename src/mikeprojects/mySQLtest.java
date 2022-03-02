import java.sql.*;


public class mySQLtest {

    public static void main(String[] args) {
        try {
            System.out.println("test");
            // create our mysql database connection
            String myDriver = "com.mysql.jdbc.Driver";

            String myUrl = "jdbc:mysql://localhose:3306/mike_info";
            System.out.println("test2");
            // our SQL SELECT query.
            Class.forName(myDriver);
            System.out.println("test2");
            // our SQL SELECT query.
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mike_info", "root", "password123");
            System.out.println("test3");
            // our SQL SELECT query.
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM friendInfo";

            // create thSystem.out.println("test");e java statement
            Statement st = conn.createStatement();
            System.out.println("test");
            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {

                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");


                // print the results
                System.out.format(firstName,  lastName);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }

}
