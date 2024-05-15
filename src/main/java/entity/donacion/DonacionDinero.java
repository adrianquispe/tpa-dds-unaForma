package entity.donacion;

import entity.colaborador.Colaborador;

import java.time.LocalDate;

public class DonacionDinero implements Donacion {
    private LocalDate fechaDonacion;
    private Integer monto;
    private Integer periodoDias;
    @Override
    public void donar(Colaborador colaborador) {

    }

    @Override
    public TipoDonacion tipo() {
        return TipoDonacion.DINERO;
    }
}
