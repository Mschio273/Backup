package br.com.estudos.teste.controller;

import br.com.estudos.teste.model.Produto;
import br.com.estudos.teste.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//idempotencia de metodos - metodos idempotentes nao mudam o estado da aplicação
//metodo post não é idempotente
@RestController
@RequestMapping(value = "/api/v1/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Produto> findAll(){
        return produtoService.findAll();
    }

    @GetMapping("/find/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto findById(@PathVariable ("id") Long id){
       return produtoService.findById(id);
    }

    @PutMapping
    public ResponseEntity<?> updateProduto(@RequestBody Produto produto){
        produtoService.updateProduto(produto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(produto);
    }

    @PostMapping("/save")
    public ResponseEntity<?> insertProduto(@RequestBody Produto produto){
        produtoService.insertProduto(produto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(produto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable ("id") Long id){
        produtoService.deletaProduto(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/delete2")
    public ResponseEntity<?> delete2(@RequestParam Long id){
        Produto produto = produtoService.findById(id);
        produtoService.deletaProduto(id);
        return new ResponseEntity<String>(produto.toString(),HttpStatus.OK);
    }
}