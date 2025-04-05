package com.github.sipriano_dev.rest_java_springboot.model;
//Record é uma forma rápida e simples de criar objetos, usando o parametro pra
//colocar os atributos que serão gerenciados internamente
public record Greeting(Long id, String content) {}
