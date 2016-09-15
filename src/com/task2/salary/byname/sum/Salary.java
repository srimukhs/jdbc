package com.task2.salary.byname.sum;


import java.sql.*;



public class Salary {
   
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

      String sql = "select empid,empname,SUM(salary) from empsalary group by empname";
      
      ResultSet rs = stmt.executeQuery(sql);
      
      while(rs.next()){
         
    	  String id  = rs.getString(1);
          String name = rs.getString(2);
          String salary = rs.getString(3);

         
          System.out.print("ID: " + id);
          System.out.print(", name: " + name);
          System.out.println(", salary: " + salary);
    
         

 
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