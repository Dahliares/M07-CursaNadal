/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.domain.repository.impl;

import cat.xtec.ioc.domain.Corredor;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import cat.xtec.ioc.domain.repository.ICorredorRepository;
import java.util.Comparator;

/**
 *
 * @author dahliares
 */
@Repository
public class CCorredorRepository implements ICorredorRepository {

    private List<Corredor> listaDeCorredores = new ArrayList<Corredor>();

    public CCorredorRepository() {

        Corredor corredor1 = new Corredor("01", "001", "Ares", "Fernández", "Junior", 7);
        Corredor corredor2 = new Corredor("02", "002", "Dahlia", "Fernández", "Junior", 11);
        Corredor corredor3 = new Corredor("03", "003", "Sara", "Ortega", "Senior", 40);
        Corredor corredor4 = new Corredor("04", "004", "Carlos", "Pacheco", "Senior", 37);
        Corredor corredor5 = new Corredor("05", "005", "Daniel", "Ortega", "Federats", 32);
        Corredor corredor6 = new Corredor("06", "006", "Antonio", "Martinez", "Senior", 63);

        Corredor corredor7 = new Corredor("07", "007", "Irene", "López", "Federats", 38);
        corredor7.setTempsHHMISS("1:33:00");
        corredor7.setTemps(corredor7.fromHHMISS("1:33:00"));
        Corredor corredor8 = new Corredor("08", "008", "Amelie", "Fuentes", "Junior", 13);
        corredor8.setTempsHHMISS("2:00:55");
        corredor8.setTemps(corredor7.fromHHMISS("2:00:55"));
        Corredor corredor9 = new Corredor("09", "009", "Julieta", "Fuentes", "Senior", 7);
        corredor9.setTempsHHMISS("2:25:25");
        corredor9.setTemps(corredor7.fromHHMISS("2:25:25"));
        Corredor corredor10 = new Corredor("10", "010", "Chema", "Bonete", "Federats", 47);
        corredor10.setTempsHHMISS("0:59:25");
        corredor10.setTemps(corredor7.fromHHMISS("0:59:25"));
        Corredor corredor11 = new Corredor("11", "011", "Pau", "Comas", "Junior", 17);
        corredor11.setTempsHHMISS("1:45:22");
        corredor11.setTemps(corredor7.fromHHMISS("1:45:22"));
        Corredor corredor12 = new Corredor("12", "012", "Alba", "Comas", "Junior", 6);
        corredor12.setTempsHHMISS("1:50:22");
        corredor12.setTemps(corredor7.fromHHMISS("1:50:22"));

        listaDeCorredores.add(corredor1);
        listaDeCorredores.add(corredor2);
        listaDeCorredores.add(corredor3);
        listaDeCorredores.add(corredor4);
        listaDeCorredores.add(corredor5);
        listaDeCorredores.add(corredor6);
        listaDeCorredores.add(corredor7);
        listaDeCorredores.add(corredor8);
        listaDeCorredores.add(corredor9);
        listaDeCorredores.add(corredor10);
        listaDeCorredores.add(corredor11);
        listaDeCorredores.add(corredor12);

    }

    @Override
    public List<Corredor> getAllCorredors() {

        return listaDeCorredores;

    }

    @Override
    public Corredor getCorredorByCodi(String codi) {

        Corredor corr = new Corredor();

        for (Corredor corredor : listaDeCorredores) {

            if (corredor.getCodi().equals(codi)) {

                corr = corredor;
                break;
            }

        }

        return corr;

    }

    @Override
    public Corredor getCorredorByDorsal(String dorsal) {
        
        Corredor corr = new Corredor();
        for (Corredor corredor : listaDeCorredores) {

            if (corredor.getDorsal().equals(dorsal)) {

                corr = corredor;
                break;
            }

        }

        return corr;
    }

    @Override
    public List<Corredor> getCorredorsByCategory(String categoria) {
        List<Corredor> corredorsPerCategoria = new ArrayList<Corredor>();
        for (Corredor corredor : listaDeCorredores) {
            if (categoria.equalsIgnoreCase(corredor.getCategoria())) {
                corredorsPerCategoria.add(corredor);
            }
        }
        return corredorsPerCategoria;

    }

    @Override
    public void addCorredor(Corredor corredor) {
        listaDeCorredores.add(corredor);

    }

    @Override
    public List<List<Corredor>> getCorredorsByCategoriaAndTemps() {
        
        //creamos las list
        List<List<Corredor>> listaGlobal = new ArrayList<List<Corredor>>();
        List<Corredor> listaJuniors = new ArrayList<Corredor>();
        List<Corredor> listaSeniors = new ArrayList<Corredor>();
        List<Corredor> listaFederats = new ArrayList<Corredor>();

        //recorremos los corredores que tengan tiempo y los
        //separamos por categoria, cada uno en su list
        for (Corredor corredor : listaDeCorredores) {

           if (corredor.getTempsHHMISS()!= null) {
               
               //hacemos que temps esté calculado
               corredor.setTemps(corredor.fromHHMISS(corredor.getTempsHHMISS()));
               
               //separamos por categoria
                switch (corredor.getCategoria()) {
                    case "Junior":
                        listaJuniors.add(corredor);
                        break;
                    case "Senior":
                        listaSeniors.add(corredor);
                        break;
                    case "Federats":
                        listaFederats.add(corredor);
                        break;
                }
            }       
        }
        
      //ordenamos las listas por tiempo de llegada       
       listaJuniors.sort(new Comparator<Corredor>() {
            @Override
            public int compare(Corredor o1, Corredor o2) {
               return o1.getTemps() - o2.getTemps();
            }
       });
       listaSeniors.sort(new Comparator<Corredor>() {
            @Override
            public int compare(Corredor o1, Corredor o2) {
               return o1.getTemps() - o2.getTemps();
            }
       });
       listaFederats.sort(new Comparator<Corredor>() {
            @Override
            public int compare(Corredor o1, Corredor o2) {
               return o1.getTemps() - o2.getTemps();
            }
       });
       
        //añadirmos las listas ya ordenadas a la lista global 
        listaGlobal.add(listaJuniors);
        listaGlobal.add(listaSeniors);
        listaGlobal.add(listaFederats);

        return listaGlobal;
    }

}
