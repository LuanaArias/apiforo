package forohub.apiforo.topico;


public record DatosActualizacionTopico(
    String titulo, 
    String mensaje, 
    String autor, 
    String curso
) {
    public DatosActualizacionTopico(Topico topico) {
        this(
            topico.getId(),
            topico.getTitulo(),
            topico.getMensaje(),
            topico.getFechaDeCreacion(),
            topico.getAutor(),
            topico.getCurso()
        );
    }
}
