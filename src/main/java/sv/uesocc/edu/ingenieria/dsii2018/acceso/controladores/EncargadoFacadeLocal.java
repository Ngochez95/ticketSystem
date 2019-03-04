/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.dsii2018.acceso.controladores;

import java.util.List;
import javax.ejb.Local;
import sv.uesocc.edu.ingenieria.dsii2018.acceso.definiciones.Encargado;

/**
 *
 * @author katiro
 */
@Local
public interface EncargadoFacadeLocal {

    boolean create(Encargado encargado);

    boolean edit(Encargado encargado);

    boolean remove(Encargado encargado);

    Encargado find(Object id);

    List<Encargado> findAll();

    List<Encargado> findRange(int[] range);
    
    Encargado FindBySolicitudE(int idSolicitud, int idDirectorio);

    int count();

    void change();

}
