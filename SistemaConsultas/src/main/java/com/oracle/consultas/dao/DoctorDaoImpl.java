
package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class DoctorDaoImpl extends Dao implements DoctorDao{

    private String crearSql= 
            "INSERT INTO DOCTOR (codigo,nombre,apellido,especialidad) values (?,?,?,?)";
    private Connection connection;
    @Override
    public void crearDoctor(Doctor doctor) {
    
    try{
        this.conectar();
        
   PreparedStatement pst = this.getConnection().prepareStatement(crearSql);
   pst.setInt(1, doctor.getCodigo());
   pst.setString(2, doctor.getNombre());
   pst.setString(3, doctor.getApellido());
   pst.setString(4, doctor.getEspecialidad());
   
   pst.executeUpdate();
   
    }catch(Exception e){
      e.printStackTrace();
    }finally{
        this.cerrarConexion();
        }
    }
    
    public void cerrarConexion(){
        try{
            if (connection != null){
                if(!connection.isClosed()){
                  connection.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public void eliminarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor buscarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Doctor> ListarDoctores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
