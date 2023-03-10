package com.teste.primeiro_exemplo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.teste.primeiro_exemplo.model.Produto;

@Repository
public class ProdutoRpositorio {
     private List <Produto> produtos = new ArrayList<Produto>();
     private Integer ultimoId  = 0;

    /**
     * Método para retornar uma lista de produtos 
     * @return lista de produtos 
     * 
    */
     public List <Produto> obterTodos(){
        return produtos;

     }
     /**
      * Método que retorna o produto encontrado pelo seu Id.
      * @param id do produto que sera localizado.
      * @return Retorna um produto que seja  encontrado.
      */
    public Optional <Produto> obterPorId(Integer id){
        return produtos
        .stream()
        .filter(produto -> produto.getId() == id)
        .findFirst();

    }
    /**
     * Método para adcionar produto na lista 
     * @param produto que será adcionado
     * @return produto que será adcionado na lista
     */
    public Produto adicionar (Produto produto){
        ultimoId ++;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
    }
}
