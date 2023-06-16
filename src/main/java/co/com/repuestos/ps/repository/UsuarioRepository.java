package co.com.repuestos.ps.repository;

import co.com.repuestos.ps.modelo.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
