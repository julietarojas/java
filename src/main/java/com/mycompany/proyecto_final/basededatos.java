package com.mycompany.proyecto_final;
import java.sql.*; // sintaxis del sql
import java.sql.Connection; // conexion a la base base de datos
import java.sql.DriverManager; // el driver
import java.sql.Statement; //la ejecucion de la instruccion
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julieta
 */
//public class basededatos {
//    Connection c=null;
//    public boolean Conectar(){
//        boolean respuesta=true;
//        //toda base de datos exige un try catch
//        try{
//            
//            Class.forName("org.mysql.Driver");
//            c=DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/proyecto_POO",
//                    "root","Nomeacuerdo1");
//            
//        }catch(Exception e){
//            
//            System.out.println("Error:"+e.toString());
//            respuesta=false;
//        }
//        
//        return respuesta;
//    }
//    public boolean Desconectar(){
//        boolean respuesta=true;
//        try{
//            //se cierran todas las transacciones 
//            c.commit();
//            //se cierra la conexion
//            c.close();
//        }catch(Exception e){
//            respuesta=false;
//        }
//        return respuesta;
//    }
//    public ResultSet resultset(String sql){
//        ResultSet respuesta = null;
//        try{
//            Statement s = null;
//            c.setAutoCommit(false);
//            s = c.createStatement();
//            respuesta = s.executeQuery(sql);
//        }catch (Exception e){
//            System.out.println("error:" + e.toString());
//        }
//        return respuesta;
//    }
//    public boolean Query(String sql){
//        boolean respuesta = false;
//        try{
//            Statement s = null;
//            //uso la conexión
//            //commit es que yo manualmente actualizare
//            //las transacciones
//            c.setAutoCommit(false);
//            s = c.createStatement();
//            s.executeLargeUpdate(sql);
//            s.close();
//            respuesta = true;
//        }catch (Exception e){
//            System.out.println("error:"+e.toString());
//        }
//        return respuesta;
//    }
//}


public class basededatos {
    
    public static Connection getConnection(){
        
        Connection c = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/Proyecto_POO",
                    "root","Nomeacuerdo1");            
        }catch(Exception e){
            
            System.out.println(e.getMessage());

        }
        
        return c;
    }
}
        
