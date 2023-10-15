package br.com.alura.musicasBD.principal

import br.com.alura.musicasBD.dados.AlbunsDAO
import br.com.alura.musicasBD.dados.Banco
import br.com.alura.musicasBD.dados.BandasDAO
import br.com.alura.musicasBD.modelos.Album
import br.com.alura.musicasBD.modelos.Banda

fun main(){

    val manager = Banco.getEntityManager()
    var bandasDAO = BandasDAO(manager)
    var albunsDAO = AlbunsDAO(manager)

    val titas = bandasDAO.recuperarPeloId(1)
    val goBack = Album(titas, "Go Back")
    val cabecaDinossauro = Album(titas, "Cabeça Dinossauro")

//    bandasDAO.adicionar(titas)

    println(titas)
    println(goBack)
    println(cabecaDinossauro)

    albunsDAO.adicionar(goBack)
    albunsDAO.adicionar(cabecaDinossauro)



    manager.close()
}