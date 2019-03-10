import java.sql.DriverManager;
import javax.sql.DataSource;


public static void main(String[]args){


        String url="jdbc:h2:file:E:/GitHUB/OOP_Viktor/Datenbank/DB/ProjektDB."
        try(Connection con=DriverManager.getConnection(url,"sa","");
        Statement stmt=con.createStatement()){

        // Tabelle CUSTOMER fehlt? Dann anlegen
        if(!con.getMetaData().getTablets(null,null,"CUSTOMER",null).next()){
        String[]sqlStmts={
        "CREATE TABLE CUSTOMER(ID INTEGER NOT NULL PRIMARY KEY, FIRSTNAME VARCHAR(255),"
        +"LASTNAME VARCHAR(255), STREET VARCHAR(255), CITY VARCHAR(255))",
        "INSERT INTO CUSTOMER VALUES(0,'Carina','Stoppel','Tirschenreuther Ring 8A','12279 Berlin')",
        "INSERT INTO CUSTOMER VALUES(1,'Martina','Feuring',Tirschenreuther Ring 20','12279 Berlin')",
        "INSERT INTO CUSTOMER VALUES(2,'Angela','Klein','Tirschenreuther Ring 20','12279 Berlin')"};
        for(String sql:sqlStmts)
        stmt.executeUpdate(sql);
        System.out.println("Tabelle und Daten neu angelegt");
        }

        // Tabelle abfragen
        try(ResultSet rs=stmt.executeQuery("SELECT * FROM CUSTOMER")){
        while(rs.next())
        // Zugriff auf FIRSTNAME, LASTNAME, STREET
        System.out.printf("%s, %s %s%n",rs.getString(1),
        rs.getString(2),rs.getString(3));
        }
        }
        catch(SQLException e){
        e.printStackTrace();
        }
        }