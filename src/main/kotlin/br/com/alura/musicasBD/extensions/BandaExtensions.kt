package br.com.alura.musicasBD.extensions

import br.com.alura.musicasBD.dados.BandaEntity
import br.com.alura.musicasBD.modelos.Banda

fun Banda.toEntity(): BandaEntity {
    return BandaEntity(this.id, this.nome, this.descricao)
}

fun BandaEntity.toModel(): Banda {
    return Banda(this.nome, this.descricao, this.id)
}
