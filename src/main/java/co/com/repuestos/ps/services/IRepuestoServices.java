package co.com.repuestos.ps.services;

import co.com.repuestos.ps.modelo.Repuesto;

import java.util.List;

public interface IRepuestoServices {
    Repuesto guardar(Repuesto repuesto) throws Exception;
    Repuesto consultar(Long id)throws Exception;
    Repuesto actualizar(Repuesto persona)throws Exception;
    Repuesto borrar(long id)throws Exception;
    List<Repuesto> buscarTodos() throws Exception;
}