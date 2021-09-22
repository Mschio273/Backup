package br.com.estudos.teste.controller;

import br.com.estudos.teste.model.Produto;
import br.com.estudos.teste.service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//idempotencia de metodos - metodos idempotentes nao mudam o estado da aplicação
//metodo post não é idempotente
@RestController
@RequestMapping(value = "/api/v2/produto")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de produtos")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Produto> findAll(){
        return produtoService.findAll();
    }

    @GetMapping("/find/{id}")
    @ApiOperation(value = "Retorna um produto")
    @ResponseStatus(HttpStatus.OK)
    public Produto findById(@PathVariable ("id") Long id){
       return produtoService.findByIdOrThrowException(id);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation(value = "Atualiza um pr   oduto")
    public ResponseEntity<?> updateProduto(@RequestBody Produto produto){
        return produtoService.updateProduto(produto);
    }

    @ResponseStatus
    @PostMapping("/save")
    @ApiOperation(value = "Inseri um produto")
    public ResponseEntity<?> insertProduto(@RequestBody Produto produto){
        produtoService.insertProduto(produto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(produto);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Deleta um produto")
    public ResponseEntity<?> delete(@PathVariable ("id") Long id){
        produtoService.deletaProduto(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/delete2")
    @ApiOperation(value = "Deleta um produto retornando o produto deletado ")
    public ResponseEntity<?> delete2(@RequestParam Long id){
        Produto produto = produtoService.findByIdOrThrowException(id);
        produtoService.deletaProduto(id);
        return new ResponseEntity<String>(produto.toString(),HttpStatus.OK);
    }
}