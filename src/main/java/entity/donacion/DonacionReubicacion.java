package entity.donacion;

import entity.colaborador.Colaborador;

public class DonacionReubicacion implements Donacion{
    @Override
    public void donar(Colaborador colaborador) {

    }

    @Override
    public TipoDonacion tipo() {
        return TipoDonacion.REDISTRIBUCION_VIANDAS;
    }
}
