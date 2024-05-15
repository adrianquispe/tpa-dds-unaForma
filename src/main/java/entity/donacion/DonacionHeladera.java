package entity.donacion;

import entity.colaborador.Colaborador;

public class DonacionHeladera implements Donacion{
    @Override
    public void donar(Colaborador colaborador) {

    }

    @Override
    public TipoDonacion tipo() {
        return TipoDonacion.HELADERA;
    }
}
