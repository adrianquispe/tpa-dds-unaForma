package entity.donacion;

import entity.colaborador.Colaborador;

public class DonacionVianda implements Donacion{
    @Override
    public void donar(Colaborador colaborador) {

    }

    @Override
    public TipoDonacion tipo() {
        return TipoDonacion.DONACION_VIANDAS;
    }
}
