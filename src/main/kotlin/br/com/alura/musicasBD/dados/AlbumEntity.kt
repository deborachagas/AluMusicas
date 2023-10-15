package br.com.alura.musicasBD.dados

import br.com.alura.musicasBD.dados.BandaEntity
import javax.persistence.*

@Entity
@Table(name = "albuns")
class AlbumEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    @ManyToOne
    val banda: BandaEntity = BandaEntity(),
    val titulo: String = "Titulo do album"
) {
}