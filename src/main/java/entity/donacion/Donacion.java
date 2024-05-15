package entity.donacion;

import entity.colaborador.Colaborador;

public interface Donacion {
    public void donar(Colaborador colaborador);
    public TipoDonacion tipo();
}
