package com.proyectos.ForoHubCallenge.domain.topico;

import com.proyectos.ForoHubCallenge.domain.curso.NombreCurso;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull Long id,
        String mensaje,
        String titulo,
        NombreCurso nombreCurso
) {
}
