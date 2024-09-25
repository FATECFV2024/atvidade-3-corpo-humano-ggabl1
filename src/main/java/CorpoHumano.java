package main.java;

public class CorpoHumano {
private Double massa;
private Double volume;
private Double densidade;

public corpoHumano(Double massa, Double volume, Double densidade) {
    this.massa = massa;
    this.volume = volume;
    this.densidade = densidade;
}

public Double getMassa() {
    return massa;
}

public void setMassa(Double massa) {
    this.massa = massa;
}

public Double getVolume() {
    return volume;
}

public void setVolume(Double volume) {
    this.volume = volume;
}

public Double getDensidade() {
    return densidade;
}

public void setDensidade(Double densidade) {
    this.densidade = densidade;
}


}
