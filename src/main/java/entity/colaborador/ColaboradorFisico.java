package entity.colaborador;

import entity.donacion.TipoDonacion;
import entity.formulario.Formulario;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;


@Getter
@Setter
public class ColaboradorFisico extends Colaborador{
    private String nombre;
    private String apellido;


    public ColaboradorFisico(){
        this.donacionesRealizadas = new ArrayList<>();
        this.formasDeDonar = new HashSet<>();
        setearContribuciones();
        this.activo = false;
        this.puntos = 0;
    }

    @Override
    public void cargarColaborador(Formulario formulario){
        this.nombre = formulario.obtenerValor("nombre");
        this.apellido = formulario.obtenerValor("apellido");

    }

    private void setearContribuciones(){
        this.formasDeDonar.add(TipoDonacion.DINERO);
        this.formasDeDonar.add(TipoDonacion.DONACION_VIANDAS);
        this.formasDeDonar.add(TipoDonacion.REDISTRIBUCION_VIANDAS);
    }
}
