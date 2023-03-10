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
    /**
     * Método para adcionar produto na lista 
     * @param produto que será adcionado
     * @return produto que será adcionado na lista
     */
    public Produto adicionar (Produto produto){
        // Poderia ter alguma regra de negocio para validar o produto.
        return produtoRepositorio.adicionar(produto);
    }
     /**
     * Metodo para deletar o produto por Id
     * @param id do produto a ser deletado
     */
    public void deletar (Integer id){
        // Aqui poderia ter alguma validação
        produtoRepositorio.deletar(id);
    }
     /**
     * Metodo para atualziar o produto na lista 
     * @param produto que sera atualizado
     * @return Reporna o produto apos atualziar a lista 
     */
    public Produto atualizar(Integer id, Produto produto){
        // Ter alguma validação
        produto.setId(id);

        return produtoRepositorio.atualizar(produto); 
    
    }



}
