package co.com.repuestos.ps.controller;


import co.com.repuestos.ps.dto.ResponseErrorDTO;
import co.com.repuestos.ps.modelo.Usuario;
import co.com.repuestos.ps.services.IUsuarioServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    IUsuarioServices iUsuarioServices;

    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @GetMapping("/v1/{id}")
    public ResponseEntity<?> getUsuario(@PathVariable("id") Long id) {
        try {
            Usuario resultado = iUsuarioServices.consultar(id);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    new ResponseErrorDTO(
                            HttpStatus.BAD_REQUEST.toString(),
                            e.getCause() + "",
                            e.getMessage()));
        }
    }

    @PostMapping("/v1")
    public ResponseEntity<?> saveUsuario(@RequestBody Usuario usuario) {
        try {
            Usuario resultado = iUsuarioServices.guardar(usuario);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    new ResponseErrorDTO(
                            HttpStatus.BAD_REQUEST.toString(),
                            e.getCause() + "",
                            e.getMessage()));
        }
    }

    @PutMapping("/v1")
    public ResponseEntity<?> updateUsuario(@RequestBody Usuario usuario) {
        try {
            Usuario resultado = iUsuarioServices.actualizar(usuario);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    new ResponseErrorDTO(
                            HttpStatus.BAD_REQUEST.toString(),
                            e.getCause() + "",
                            e.getMessage()));
        }
    }

    @DeleteMapping("/v1")
    public ResponseEntity<?> deleteUsuario(@PathVariable Long id) {
        try {
            Usuario resultado = iUsuarioServices.borrar(id);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    new ResponseErrorDTO(
                            HttpStatus.BAD_REQUEST.toString(),
                            e.getCause() + "",
                            e.getMessage()));
        }
    }
}