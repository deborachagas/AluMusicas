package br.com.alura.musicasBD.modelos

class Album(
    val banda: Banda = Banda(),
    val titulo: String = "Título do álbum",
    val id: Int = 0
) {
    override fun toString(): String {
        return "$titulo ($id) - $banda"
    }
}