package co.com.repuestos.ps.repository;

import co.com.repuestos.ps.modelo.Repuesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepuestoRepository extends JpaRepository<Repuesto, Long> {



}