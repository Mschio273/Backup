package br.com.estudos.teste.repository;

import br.com.estudos.teste.model.Produto;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

//DAO - data access object

@Mapper
public interface ProdutoMapper{

    @Select("SELECT * FROM TB_PRODUTO")
    List<Produto> getAll();

    @Select("SELECT * FROM TB_PRODUTO WHERE id=#{id}")
    Optional<Produto> getById(Long id);

    @Update("UPDATE TB_PRODUTO SET nome=#{nome}, quantidade=#{quantidade}, valor=#{valor} WHERE id=#{id}")
    int update(Produto produto);

    @Insert("INSERT INTO TB_PRODUTO (nome, quantidade, valor) VALUES (#{nome},#{quantidade},#{valor})")
    @Options(keyColumn = "id", keyProperty = "id", useGeneratedKeys = true)
    Produto insert(Produto produto);

    @Delete("DELETE FROM tb_produto WHERE id =#{id}")
    int delete(Long id);
}