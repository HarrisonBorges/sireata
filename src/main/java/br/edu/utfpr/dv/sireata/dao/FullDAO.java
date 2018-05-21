package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.model.DAOEntity;
import br.edu.utfpr.dv.sireata.dao.algorithms.DeleteDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.ReadDAO;
import java.sql.SQLException;
import java.util.List;
import br.edu.utfpr.dv.sireata.dao.algorithms.UpdateDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.CreateDAO;

public abstract class FullDAO {

    protected CreateDAO create;
    protected ReadDAO read;
    protected UpdateDAO update;
    protected DeleteDAO delete;

    public void create(DAOEntity e) throws Exception {
        create.create(e);
    }

    public DAOEntity buscarPorId(int value) throws SQLException {
        return read.buscarPorId(value);
    }

    public List<? extends DAOEntity> listarPorAta(int value) throws SQLException {
        return read.listarPorAta(value);
    }

    public int salvar(DAOEntity newEntity) throws SQLException {
        return update.salvar(newEntity);
    }

    public void excluir(int value) throws SQLException {
        delete.excluir(value);
    }

}
