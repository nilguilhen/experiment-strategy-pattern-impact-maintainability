
package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarAnexo;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirAnexo;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.listar.ListarAnexo;
import com.mycompany.strategyexperiment.dao.experiment.listar.ListarAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarAnexo;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarAtaParticipante;

public class FullDAOFactory {
    
        
    public AbstractFullDAO fullDAO(FullDAOEnum fullDaoEnum){
        switch(fullDaoEnum){
            case ATA:
                    return new AtaParticipanteFullDAO(new SalvarAtaParticipante() , new ListarAtaParticipante(), new BuscarAtaParticipante(), new ExcluirAtaParticipante());
            case ANEXO:
                    return new AnexoFullDAO(new SalvarAnexo(), new ListarAnexo(), new BuscarAnexo(), new ExcluirAnexo());
            default:
                    return null;
        }    

    }
}
