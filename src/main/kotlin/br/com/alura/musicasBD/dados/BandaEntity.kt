package br.com.alura.musicasBD.dados

import javax.persistence.*

@Entity
@Table(name = "bandas")
class BandaEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val nome: String = "Nome do banda",
    val descricao: String = "Descrição da banda"){
}