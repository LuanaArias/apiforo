package forohub.apiforo.domain.topico;

import java.time.LocalDate;

public record DatosDetalleTopico(
        Long id,
        String titulo,
        String mensaje,
        String autor,
        LocalDate fechaDeCreacion   
) {
    public DatosDetalleTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getAutor(),
                topico.getFechaDeCreacion()
        );
    }
}