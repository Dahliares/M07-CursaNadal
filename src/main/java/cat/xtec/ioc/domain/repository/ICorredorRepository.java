/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.xtec.ioc.domain.repository;

import cat.xtec.ioc.domain.Corredor;
import java.util.List;

/**
 *
 * @author dahliares
 */
public interface ICorredorRepository {
    
    List <Corredor> getAllCorredors();
    
    Corredor getCorredorByCodi(String codi);
    
    Corredor getCorredorByDorsal(String dorsal);
    
    List<Corredor> getCorredorsByCategory(String categoria);
    
    void addCorredor(Corredor corredor);
    
    List<List<Corredor>> getCorredorsByCategoriaAndTemps();
    
    
    
}
