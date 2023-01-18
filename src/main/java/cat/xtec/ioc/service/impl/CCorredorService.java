
package cat.xtec.ioc.service.impl;

import cat.xtec.ioc.domain.Corredor;
import cat.xtec.ioc.domain.repository.impl.CCorredorRepository;
import cat.xtec.ioc.service.ICorredorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MSI
 */
@Service
public class CCorredorService implements ICorredorService{
    
    @Autowired
    private CCorredorRepository corredorRepository;
    

    @Override
    public Corredor getCorredorByCodi(String codi) {
        return corredorRepository.getCorredorByCodi(codi);
    }

    @Override
    public Corredor getCorredorByDorsal(String dorsal) {
        return corredorRepository.getCorredorByDorsal(dorsal);
    }
    
 
    @Override
    public List<Corredor> getAllCorredors() {
       return corredorRepository.getAllCorredors();
    }

    @Override
    public List<Corredor> getCorredorsByCategory(String categoria) {
        return corredorRepository.getCorredorsByCategory(categoria);
    }
    
    @Override
    public void addCorredor(Corredor corredor) {
        corredorRepository.addCorredor(corredor);
    }

    @Override
    public List<List<Corredor>> getCorredorsByCategoriaAndTemps() {
       return corredorRepository.getCorredorsByCategoriaAndTemps();
    }
    
}
