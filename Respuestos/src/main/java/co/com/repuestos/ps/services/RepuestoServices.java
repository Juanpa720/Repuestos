package co.com.repuestos.ps.services;

import co.com.repuestos.ps.modelo.Repuesto;
import co.com.repuestos.ps.repository.RepuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepuestoServices implements IRepuestoServices {

    @Autowired
    RepuestoRepository repuestoRepository;

    public Repuesto consultar(Long id) throws Exception {


        if(id < 0){
            throw new Exception("El numero ID no puede ser menor a 0");
        }
        if (id == null){
            throw new Exception("No envio el numero esperado.");
        }

        Optional<Repuesto> repuestoOpt = repuestoRepository.findById(id);

        if (!repuestoOpt.isPresent()){
            throw  new Exception("No se encontro el Repuesto");
        }
        return  repuestoOpt.get();
    }

    public  Repuesto guardar(Repuesto repuesto) throws Exception{
        if(repuesto.getNombre()== null  || repuesto.getNombre().equals("")){
            throw new Exception("El nombre no debe estar vacio");
        }

        if(repuesto.getModelo()== null  || repuesto.getModelo().equals("")){
            throw new Exception("El Modelo no debe estar vacio");
        }



        return  repuestoRepository.save(repuesto);
    }


    @Override
    public Repuesto actualizar(Repuesto repuesto) throws Exception {
        Repuesto resultado= consultar(repuesto.getId());

        if (repuesto.getModelo()!= null){
            resultado.setModelo(repuesto.getModelo());
        }

        if (repuesto.getMarca()!= null){
            resultado.setMarca(repuesto.getMarca());
        }

        if (repuesto.getColor()!= 0){
            resultado.setColor(repuesto.getColor());
        }


        return repuestoRepository.save(resultado);
    }

    @Override
    public Repuesto borrar(long id) throws Exception {
        return null;
    }

    @Override
    public List<Repuesto> buscarTodos() throws Exception {
        return repuestoRepository.findAll();
    }
}
