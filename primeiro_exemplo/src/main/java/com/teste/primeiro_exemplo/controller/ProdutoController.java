package com.teste.primeiro_exemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.primeiro_exemplo.model.Produto;
import com.teste.primeiro_exemplo.services.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    
   @Autowired
    private ProdutoService produtoService;
    
    @GetMapping
    public List <Produto> ObterTodos(){
       return produtoService.obterTodos();
    }
    

    @ PostMapping
    public Produto adionar (@RequestBody  Produto produto ){
        return produtoService.adicionar(produto);

    }


}
