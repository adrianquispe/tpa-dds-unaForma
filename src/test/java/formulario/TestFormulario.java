package formulario;

import entity.formulario.Campo;
import entity.formulario.Formulario;
import entity.formulario.TipoCampo;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestFormulario {

    @Test
    public void crearUnFormulario(){
        assertNotNull(new Formulario());
    }
    @Test
    public void asignar3CamposAFormulario(){
        Formulario form = new Formulario();
        form.agregarCampo("nombre", new Campo(TipoCampo.CAMPO_TEXTO));
        form.agregarCampo("apellido", new Campo(TipoCampo.CAMPO_TEXTO));
        form.agregarCampo("edad", new Campo(TipoCampo.CAMPO_NUMERICO));
        form.mostrarLabels();

        assertEquals(3, form.cantCampos());
    }

    @Test
    public void asignar3CamposYDarValores(){
        Formulario form = new Formulario();
        form.agregarCampo("nombre", new Campo(TipoCampo.CAMPO_TEXTO));
        form.agregarCampo("fecha", new Campo(TipoCampo.CAMPO_FECHA));
        form.agregarCampo("edad", new Campo(TipoCampo.CAMPO_NUMERICO));

        form.cargarValor("nombre", "el pepe");
        form.cargarValor("fecha", "2024-05-12");
        form.cargarValor("edad", "12");

        form.mostrarCampos();

        assertEquals("el pepe", form.obtenerValor("nombre"));
        assertEquals(LocalDate.parse("2024-05-12"), form.getCampo("fecha").getEntrada().mostrarFecha());
        assertEquals(12, form.getCampo("edad").getEntrada().mostrarNumero());
    }
}
