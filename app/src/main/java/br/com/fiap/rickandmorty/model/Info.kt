package br.com.fiap.rickandmorty.model

data class Info(
  var count: Int = 0,
  var pages: Int = 0,
  var next: String = "",
  var prev: String = ""
)
