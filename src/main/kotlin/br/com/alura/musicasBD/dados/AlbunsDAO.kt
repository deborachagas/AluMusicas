package br.com.alura.musicasBD.dados

import br.com.alura.musicasBD.extensions.toEntity
import br.com.alura.musicasBD.extensions.toModel
import br.com.alura.musicasBD.modelos.Album
import javax.persistence.EntityManager

class AlbunsDAO(manager: EntityManager): DAO<Album, AlbumEntity>(manager, AlbumEntity::class.java){
    override fun toEntity(objeto: Album): AlbumEntity {
        return objeto.toEntity()
    }

    override fun toModel(entity: AlbumEntity): Album {
        return entity.toModel()
    }
}