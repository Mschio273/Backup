package br.com.estudos.teste.service;

import br.com.estudos.teste.exception.BadRequestException;
import br.com.estudos.teste.model.Produto;
import br.com.estudos.teste.repository.ProdutoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoMapper produtoMapper;

    public List<Produto> findAll(){
        List<Produto> produtos = this.produtoMapper.getAll();
        return produtos;
    }

    public Produto findByIdOrThrowException(Long id){
        return produtoMapper.getById(id).orElseThrow(() -> new BadRequestException("id não encontrado"));
    }

    public ResponseEntity<?> updateProduto(Produto produto){
        this.produtoMapper.update(produto);
        return ResponseEntity.ok(produto);
    }

    public void insertProduto(Produto produto) {
         this.produtoMapper.insert(produto);
    }

    public void deletaProduto(Long id){
        this.produtoMapper.delete(id);
    }
}