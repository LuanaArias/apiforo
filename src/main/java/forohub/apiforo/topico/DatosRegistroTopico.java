package forohub.apiforo.topico;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(
    @NotBlank String titulo, 
    @NotBlank String mensaje, 
    @NotBlank String autor, 
    @NotBlank String curso) {
        
    public DatosRegistroTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getAutor(), topico.getCurso());
    }
}
