package entity.formulario;

public interface GenerarEntrada {
    public static Entrada generar(TipoCampo tipo){
        switch (tipo){
            case CAMPO_TEXTO:
                return new EntradaTexto();
            case CAMPO_NUMERICO:
                return new EntradaNumerica();
            case CAMPO_FECHA:
                return new EntradaFecha();
            case CAMPO_MULTIPLE:
                return new EntradaMultiple();
            default:
                return null;
        }
    }
}
