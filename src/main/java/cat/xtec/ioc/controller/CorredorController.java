package cat.xtec.ioc.controller;

import cat.xtec.ioc.domain.Corredor;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import cat.xtec.ioc.service.ICorredorService;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CorredorController {

    @Autowired
   private ICorredorService corredorService;
   

    @RequestMapping(value = "/corredors/all", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("corredors");
        modelview.getModelMap().addAttribute("corredors", corredorService.getAllCorredors());

        return modelview;
    }

    @RequestMapping(value = "/corredors/corredor", method = RequestMethod.GET)
    public ModelAndView getCorredorByCodi(@RequestParam(value="codi", required=false) String codi,@RequestParam(value="dorsal", required=false) String dorsal,HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {
      
        ModelAndView modelview = new ModelAndView("corredor");
       
        if(codi != null){
        modelview.getModelMap().addAttribute("corredor", corredorService.getCorredorByCodi(codi));
        } else if(!dorsal.equals("")){
        modelview.getModelMap().addAttribute("corredor", corredorService.getCorredorByDorsal(dorsal));
        }
        
        
        return modelview;
    }

    
    @RequestMapping(value = "/corredors/{categoria}", method = RequestMethod.GET)
    public ModelAndView getCorredorsByCategory(@PathVariable("categoria") String categoria, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        ModelAndView modelview = new ModelAndView("corredors");
        modelview.getModelMap().addAttribute("corredors", corredorService.getCorredorsByCategory(categoria));

        return modelview;
    }
    
    @RequestMapping(value = "/corredors/qryDorsal", method = RequestMethod.GET)
    public ModelAndView getFormDorsal(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        ModelAndView modelview = new ModelAndView("qryDorsal");
        return modelview;
    }
    
    @RequestMapping(value = "/corredors/add", method = RequestMethod.POST)
    public String processAddNewCorredor(@ModelAttribute("newCorredor") Corredor newCorredor) {
        corredorService.addCorredor(newCorredor);
        
        return "redirect:/corredors/all";
       
    }
    
    @RequestMapping(value = "/corredors/add", method = RequestMethod.GET)
    public ModelAndView getAddForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ModelAndView modelview = new ModelAndView("addCorredor");
        Corredor newCorredor = new Corredor();
        
        modelview.getModelMap().addAttribute("newCorredor", newCorredor);
        return modelview;
          
    }
    
    @RequestMapping(value = "/corredors/meta", method = RequestMethod.GET)
    public ModelAndView getCorredorByCodi(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {
      
        ModelAndView modelview = new ModelAndView("meta");
        
        modelview.getModelMap().addAttribute("corredors", corredorService.getAllCorredors());
        modelview.getModelMap().addAttribute("listaGlobal", corredorService.getCorredorsByCategoriaAndTemps());
        
        return modelview;
    }
    
    @RequestMapping(value = "/corredors/addTemps", method = RequestMethod.GET)
    public ModelAndView getTempsForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {
      
        ModelAndView modelview = new ModelAndView("addTemps");
       
        return modelview;
    }
    
    @RequestMapping(value = "/corredors/addTemps", method = RequestMethod.POST)
    public String processAddTemps(String dorsal, String temps) {
        Corredor corredor = corredorService.getCorredorByDorsal(dorsal);
        corredor.setTempsHHMISS(temps);
       return "redirect:/corredors/meta";
       
    }
    
    

}
