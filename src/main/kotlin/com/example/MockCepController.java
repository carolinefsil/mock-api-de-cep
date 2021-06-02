package com.example;


import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

    @Controller("/cep/{cep}")
public class MockCepController {

    @Get
    public HttpResponse<Object> buscaEndereco (@PathVariable String cep)

     if (cep.startsWith("0")){
         return HttpResponse.notFound();
    }

    if(cep.startsWith("-")){
        return HttpResponse.badRequest();

    }

    if(cep)
 }
