import arrays.*;
import loading.*;
import figuras.*;

public class App {
    public static void main(String[] args) throws Exception {
        Arrays arrays = new Arrays(5);
        arrays.g4_crearArrays();
        Loading loading = new Loading();
        loading.g4_createLoading();
        Figuras figuras = new Figuras(5);
        figuras.g4_drawFigures();

    }
}
