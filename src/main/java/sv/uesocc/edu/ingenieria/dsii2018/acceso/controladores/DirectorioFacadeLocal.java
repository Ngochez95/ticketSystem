/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.uesocc.edu.ingenieria.dsii2018.acceso.controladores;

import java.util.List;
import javax.ejb.Local;
import sv.uesocc.edu.ingenieria.dsii2018.acceso.definiciones.Directorio;

/**
 *
 * @author katiro
 */
@Local
public interface DirectorioFacadeLocal {

    boolean create(Directorio directorio);

    boolean edit(Directorio directorio);

    boolean remove(Directorio directorio);

    Directorio find(Object id);

    List<Directorio> findAll();

    List<Directorio> findRange(int[] range);

    Directorio autenticar(Directorio usuario);
    
    int count();

    Directorio FindByEmail(String correo, String contrasenia);

    List<Directorio> findByTecFree(int idDirectorio);
    
    List<Directorio> findByAuditor(String auditor);

}
