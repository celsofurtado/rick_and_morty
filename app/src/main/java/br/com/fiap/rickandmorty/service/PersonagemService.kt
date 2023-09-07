package br.com.fiap.rickandmorty.service

import br.com.fiap.rickandmorty.model.ListaDePersonagens
import br.com.fiap.rickandmorty.model.Personagem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PersonagemService {

  @GET("character")
  fun getPersonagens(): Call<ListaDePersonagens>

  @GET("character/{id}")
  fun getPersonagemPeloId(@Path("id") codigo: Int): Call<Personagem>

}