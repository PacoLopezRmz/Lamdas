
package com.oracle.consultas.controler;

import com.oracle.consultas.dao.DoctorDao;
import com.oracle.consultas.dao.DoctorDaoImpl;
import com.oracle.consultas.model.Doctor;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped
public class DoctorBean {
    
  private Doctor doctor = new Doctor();

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
  
    public void registrar(){
        DoctorDao dao = new DoctorDaoImpl();
        dao.crearDoctor(this.doctor);
    }
}
