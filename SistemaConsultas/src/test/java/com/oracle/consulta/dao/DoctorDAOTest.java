
package com.oracle.consulta.dao;

import com.oracle.consultas.dao.DoctorDao;
import com.oracle.consultas.dao.DoctorDaoImpl;
import com.oracle.consultas.model.Doctor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DoctorDAOTest {
    @Test
    public void crearDoctorTest(){
      DoctorDao doctorDao = new DoctorDaoImpl();
      
      Doctor simi = new Doctor();
      simi.setCodigo(1);
      simi.setNombre("Dr. Simi");
      simi.setApellido("Juarez");
      simi.setEspecialidad("Generico");
      
      doctorDao.crearDoctor(simi);
    }
   
}
