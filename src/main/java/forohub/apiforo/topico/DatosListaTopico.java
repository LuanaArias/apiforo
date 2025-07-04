package forohub.apiforo.topico;

public record DatosListaTopico(Long id, String titulo, String autor) {
    public DatosListaTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getAutor());
    }
}