package forohub.apiforo.topico;


public record DatosActualizacionTopico(
    String titulo, 
    String mensaje, 
    String autor, 
    String curso
) {
    public DatosActualizacionTopico(Topico topico) {
        this(
            topico.getTitulo(),
            topico.getMensaje(),
            topico.getAutor(),
            topico.getCurso()
        );
    }
}
