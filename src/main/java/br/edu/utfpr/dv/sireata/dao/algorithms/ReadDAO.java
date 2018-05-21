package br.edu.utfpr.dv.sireata.dao.algorithms;

import java.util.Set;
import br.edu.utfpr.dv.sireata.model.DAOEntity;
import java.sql.SQLException;
import java.util.List;

public interface ReadDAO {

    public DAOEntity buscarPorId(int value) throws SQLException;

    public List<? extends DAOEntity> listarPorAta(int value) throws SQLException;
    
}
