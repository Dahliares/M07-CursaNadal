/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.xtec.ioc.service;

import cat.xtec.ioc.domain.Corredor;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MSI
 */
public interface ICorredorService {
    

    
    List <Corredor> getAllCorredors();
    
    Corredor getCorredorByCodi(String codi);
    
    Corredor getCorredorByDorsal(String dorsal);
    
    List<Corredor> getCorredorsByCategory(String categoria);
    
    void addCorredor(Corredor corredor);
    
    List<List<Corredor>> getCorredorsByCategoriaAndTemps();
    
 
    

    
}
