package br.com.estudos.teste.repository;

import br.com.estudos.teste.model.Produto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Sql(value = "/banco.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
@TestPropertySource("classpath:application-test.properties")
@DisplayName("Teste")
class ProdutoMapperTest {
    @Autowired
    private ProdutoMapper produtoMapper;

    @Test
    @DisplayName("Save produto when successful")
    void save_PersistProduto_WhenSuccessful(){
        Produto produto = createProduto();
        Produto produto1 = this.produtoMapper.insert(produto);
        Assertions.assertThat(produto1).isNotNull();
        Assertions.assertThat(produto1.getId()).isNotNull();
        Assertions.assertThat(produto1.getNome()).isEqualTo(produto.getNome());
    }

    private Produto createProduto(){
        return Produto.builder()
                .nome("Iphone 8")
                .quantidade(5)
                .valor(3000)
                .build();
    }
}