package entity.colaborador;

import entity.donacion.Donacion;
import entity.donacion.TipoDonacion;
import entity.formulario.Formulario;
import entity.usuario.Usurio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColaboradorJuridico extends Colaborador{
    private String nombre;
    private String apellido;
    private Usurio usuario;
    private List<Donacion> donacionesRealizadas;
    private Set<TipoDonacion> donacionesDisponibles;

    public ColaboradorJuridico(){
        this.donacionesRealizadas = new ArrayList<>();
        this.donacionesDisponibles = new HashSet<>();
    }

    @Override
    public void cargarColaborador(Formulario formulario) {

    }
}
