package br.edu.utfpr.dv.sireata.dao.algorithms;

import br.edu.utfpr.dv.sireata.model.DAOEntity;
import java.sql.SQLException;

public interface UpdateDAO {

    public int salvar(DAOEntity newEntity) throws SQLException;

}
