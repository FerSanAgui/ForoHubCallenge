package com.proyectos.ForoHubCallenge.domain.topico;

import com.proyectos.ForoHubCallenge.domain.curso.NombreCurso;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaCrecacion,
        Boolean estadoActivo,
        String autor,
        NombreCurso nombreCurso
) {
}
