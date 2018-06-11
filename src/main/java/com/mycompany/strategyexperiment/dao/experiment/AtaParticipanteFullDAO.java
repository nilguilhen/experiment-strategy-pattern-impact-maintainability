package com.mycompany.strategyexperiment.dao.experiment;

import com.mycompany.strategyexperiment.dao.experiment.buscar.Buscar;
import com.mycompany.strategyexperiment.dao.experiment.buscar.BuscarAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.excluir.Excluir;
import com.mycompany.strategyexperiment.dao.experiment.excluir.ExcluirAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.listar.Listar;
import com.mycompany.strategyexperiment.dao.experiment.listar.ListarAtaParticipante;
import com.mycompany.strategyexperiment.dao.experiment.salvar.Salvar;
import com.mycompany.strategyexperiment.dao.experiment.salvar.SalvarAtaParticipante;

public class AtaParticipanteFullDAO extends AbstractFullDAO {
    
    public AtaParticipanteFullDAO (Salvar salvar, Listar listar, Buscar buscar, Excluir excluir) {
        this.salvar = salvar;
        this.listar = listar;
        this.buscar = buscar;
        this.excluir = excluir;
    }

    AtaParticipanteFullDAO(SalvarAtaParticipante salvarAtaParticipante, ListarAtaParticipante listarAtaParticipante, BuscarAtaParticipante buscarAtaParticipante, ExcluirAtaParticipante excluirAtaParticipante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
