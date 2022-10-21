package br.dev.mhc.teste.controllers;

import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/testes")
public class TesteController {

    private static Logger LOG = LoggerFactory.getLogger(TesteController.class);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Object post(@RequestBody Object teste) {
        LOG.info("Método POST");
        return teste;
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Object put(Object teste) {
        LOG.info("Método PUT");
        return teste;
    }

    @PatchMapping
    @ResponseStatus(HttpStatus.OK)
    public Object patch() {
        LOG.info("Método PATCH");
        return null;
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object delete(@RequestBody Object teste) {
        LOG.info("Método DELETE");
        return teste;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Object get(@RequestBody Object teste) {
        LOG.info("Método GET");
        return teste;
    }

}
