package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.algorithms.anexo.AnexoDeleteDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.anexo.AnexoReadDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.anexo.AnexoUpdateDAO;

public class AnexoDAO extends FullDAO {

    public AnexoDAO(AnexoUpdateDAO update, AnexoReadDAO read, AnexoDeleteDAO delete) {
        this.read = read;
        this.update = update;
        this.delete = delete;
    }
}
