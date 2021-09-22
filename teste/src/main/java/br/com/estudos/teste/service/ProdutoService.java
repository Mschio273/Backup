package br.com.estudos.teste.service;

import br.com.estudos.teste.model.Produto;
import br.com.estudos.teste.repository.ProdutoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoMapper produtoMapper;

    public List<Produto> findAll(){
        List<Produto> produtos = this.produtoMapper.getAll();
        return produtos;
    }

    public Produto findById(Long id){
        return produtoMapper.getById(id).orElseThrow();
    }

    public void updateProduto(Produto produto){
        this.produtoMapper.update(produto);
    }

    public void insertProduto(Produto produto) {
         this.produtoMapper.insert(produto);
    }

    public void deletaProduto(Long id){
        this.produtoMapper.delete(id);
    }
}