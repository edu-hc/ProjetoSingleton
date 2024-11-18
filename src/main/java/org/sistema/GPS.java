package org.sistema;


public class GPS {
    private static GPS instanciaUnica;


    private String coordenadas;


    private GPS() {
        this.coordenadas = "Lat: 0.0000, Lon: 0.0000";
    }


    public static GPS getInstancia() {
        if (instanciaUnica == null) {
            synchronized (GPS.class) {
                if (instanciaUnica == null) {
                    instanciaUnica = new GPS();
                }
            }
        }
        return instanciaUnica;
    }

    // Método para simular a consulta de localização
    public String consultarLocalizacao() {

        coordenadas = "Lat: " + Math.random() * 180 + ", Lon: " + Math.random() * 360;
        return coordenadas;
    }


    public void resetarCoordenadas() {
        this.coordenadas = "Lat: 0.0000, Lon: 0.0000";
    }
}
