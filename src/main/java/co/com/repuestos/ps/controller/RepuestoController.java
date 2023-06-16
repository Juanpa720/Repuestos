package co.com.repuestos.ps.controller;

import co.com.repuestos.ps.dto.ResponseErrorDTO;
import co.com.repuestos.ps.modelo.Repuesto;
import co.com.repuestos.ps.services.IRepuestoServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/repuesto")
public class RepuestoController {
    @Autowired
    IRepuestoServices iRepuestoServices;

    private static final Logger logger = LoggerFactory.getLogger(RepuestoController.class);

    @GetMapping("/v1/{id}")
    public ResponseEntity<?> getRepuesto(@PathVariable("id") long id){
        try {
            Repuesto resultado = iRepuestoServices.consultar(id);
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
    public ResponseEntity<?> saveRepuesto(@RequestBody Repuesto repuesto){
        try {
            Repuesto resultado = iRepuestoServices.guardar(repuesto);
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
    public ResponseEntity<?> updateRepuesto(@RequestBody Repuesto repuesto){
        try {
            Repuesto resultado = iRepuestoServices.actualizar(repuesto);
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
    public ResponseEntity<?> deleteRepuesto(@PathVariable long id){
        try {
            Repuesto resultado = iRepuestoServices.borrar(id);
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