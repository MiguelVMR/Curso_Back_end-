package com.teste.primeiro_exemplo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.primeiro_exemplo.model.Produto;
import com.teste.primeiro_exemplo.repository.ProdutoRpositorio;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRpositorio produtoRepositorio;
     /**
     * Método para retornar uma lista de produtos 
     * @return lista de produtos 
     * 
    */
    public List<Produto> obterTodos(){
        // Colocar regra caso tenha. 
        return produtoRepositorio.obterTodos();
    }
    /**
      * Método que retorna o produto encontrado pelo seu Id.
      * @param id do produto que sera localizado.
      * @return Retorna um produto que seja  encontrado.
      */
      public Optional <Produto> obterPorId(Integer id){
        return produtoRepositorio.obterPorId(id);
      
    } 

}
