package br.com.alura.musicasBD.extensions

import br.com.alura.musicasBD.dados.AlbumEntity
import br.com.alura.musicasBD.modelos.Album

fun Album.toEntity(): AlbumEntity {
    return AlbumEntity(this.id, this.banda.toEntity(), this.titulo)
}

fun AlbumEntity.toModel(): Album {
    return Album(this.banda.toModel(), this.titulo, this.id)
}