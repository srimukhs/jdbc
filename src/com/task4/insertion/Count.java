package com.task4.insertion;


import java.sql.*;



public class Count {
   
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/task";

   
   static final String USER = "root";
   static final String PASS = "srimukh";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
  
   try{
     
      Class.forName("com.mysql.jdbc.Driver");

      
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
    
      String sql = "INSERT INTO empcount (empID,empname,empaddress,count) VALUES ('12','superman','metropolitian','0')ON DUPLICATE KEY UPDATE count=count+1;";
      
    
     stmt.executeUpdate(sql);
     System.out.println("data inserted" );
   }catch(SQLException se){
      
      se.printStackTrace();
   }catch(Exception e){
      
      e.printStackTrace();
   }finally{
     
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
  
}
}