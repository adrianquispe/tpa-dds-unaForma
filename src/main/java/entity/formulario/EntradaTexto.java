package entity.formulario;

import lombok.Getter;

@Getter
public class EntradaTexto extends Entrada{
    private String entrada;

    @Override
    public void cargarEntrada(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public String mostrarEntrada() {
        return this.entrada;
    }
}
