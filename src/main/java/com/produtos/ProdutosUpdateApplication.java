/*
 * Copyright 2017 Nome : ProdutosUpdateApplication.java Autor : valdomiro Data :
 * 18/05/2017 Empresa : valdomiro
 */
package com.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(value = "com.produtos")
public class ProdutosUpdateApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProdutosUpdateApplication.class, args);
  }
}
