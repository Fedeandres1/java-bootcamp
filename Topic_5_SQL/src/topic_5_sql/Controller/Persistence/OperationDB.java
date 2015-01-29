package topic_5_sql.Controller.Persistence;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Federico
 */
public class OperationDB {

    public Object [][] select(String table, String fields, String where, String orderby, Connection con) {
        int record=0;
        String colname[] = fields.split(",");
       
        //Consultas SQL
        String q = "SELECT " + fields + " FROM " + table ;
        String q2 = "SELECT count(*) as total FROM " + table;
        if(where.compareTo("")!=0){
            
            q+=" WHERE " + where;
            q2+= " WHERE " + where;
        }
        if(orderby.compareTo("")!=0){
        q+= " ORDER BY "+orderby; //Order by the orderby value in the head of the method
        }
        try{ 
            PreparedStatement pstm = con.prepareStatement(q2);
            ResultSet res= pstm.executeQuery();
            res.next();
            record =res.getInt("total");
            res.close();
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
        //Create a matrix with many row and colum we needed, look the record variable it count the many row of the table in the
        //data base and the fields.split separate the colum introducen in the head method(fields), then create
        // the matrix with this values.
        Object [][] data = new String[record][fields.split(",").length];
        //realizamos la consulta sql y llenamos los datos en la matriz "Object"
        try{
            PreparedStatement pstm= con.prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while(res.next()){
                for(int j=0;j<=fields.split(",").length-1;j++){
                    data[i][j] = res.getString(colname[j].trim() );
                }
                i++;}
                res.close();
            }catch(SQLException e){
                System.out.println(e);
                
            
        }
        return data;

        
    }

    public boolean insert(String table, String fields, String values, Connection con) {
//this method is simple create the query in string q and execute.
        boolean res = false;
        //se arma la consulta
        String q = " INSERT INTO " + table + " ( " + fields + " ) VALUES ( " + values + ")";
        try {
            PreparedStatement pstm = con.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
            //JOptionPane.showMessageDialog(null, "Insertado Correctamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
        return res;

    }
//create the query and execute
    public boolean delete(String table, String where, Connection con) {
        boolean res = false;
        String q = " DELETE FROM " + table + " WHERE " + where;
        try {
            PreparedStatement pstm = con.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
        return res;

    }
//create the query and execute 
    public boolean Update(String table, String change, String where, Connection con) {
        boolean res = false;

        String q = "UPDATE " + table + " SET " + change + " WHERE " + where;
        try {
            PreparedStatement pstm = con.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }

        return res;
    }
}
