package entity.colaborador;

import entity.donacion.Donacion;
import entity.donacion.TipoDonacion;
import entity.formulario.Formulario;
import entity.usuario.Usurio;

import java.util.List;
import java.util.Set;

public abstract class Colaborador {
    protected Usurio usuario;
    protected List<Donacion> donacionesRealizadas;
    protected Set<TipoDonacion> formasDeDonar;
    protected Boolean activo;
    protected Integer puntos;
    public void donar(Donacion donacion) {
        if(puedeDonar(donacion)){
            donacion.donar(this);
        }
    }

    public Boolean puedeDonar(Donacion unaDonacion){
        return formasDeDonar.contains(unaDonacion.tipo());
    }

    public abstract void cargarColaborador(Formulario formulario);

    public void darAlta(){
        if(this.usuario == null){
            this.usuario = new Usurio();
        }
        this.activo = true;
    }
    public void darBaja(){ this.activo = false; }

    public void agregarPuntos(Integer puntos){
        this.puntos += puntos;
    }
}
