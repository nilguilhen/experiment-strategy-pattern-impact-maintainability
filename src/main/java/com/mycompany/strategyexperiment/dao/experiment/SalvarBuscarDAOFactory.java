
package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarCampus;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarComentario;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarDepartamento;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarCampus;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarComentario;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarDepartamento;

public class SalvarBuscarDAOFactory {
   
    public AbstractSalvarBuscarDAO salvarBuscarDAO(SalvarBuscarDAOEnum salvarBuscarDaoEnum){
        
        switch(salvarBuscarDaoEnum){
            case CAMPUS:
                    return new CampusSalvarBuscarDAO(new SalvarCampus(), new BuscarCampus());
            case COMENTARIO:
                    return new ComentarioSalvarBuscarDAO(new SalvarComentario(), new BuscarComentario());
                
            case DEPARTAMENTO:
                    return new DepartamentoSalvarBuscarDAO(new SalvarDepartamento(), new BuscarDepartamento());
            default:
                    return null;
        }
    }
}
