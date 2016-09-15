package com.task1.object;


import java.sql.*;



public class Sturetrieve {
   
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

      String sql = "select * from student ";
      
      ResultSet rs = stmt.executeQuery(sql);
      
      while(rs.next()){
         
    	  Student student = new Student(rs.getString("stuID"),rs.getString("stuname"),rs.getString("stuaddress"));
    	  student.setStuid(rs.getString("stuID"));
         student.setStuname(rs.getString("stuname"));
         student.setStuaddress(rs.getString("stuaddress"));
         
        
         

 
      }
      rs.close();
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