public class Radio {
    private int currentVolume;
    private int radioStation;
    private int quantityRadioStation;

    public Radio() {
        this.quantityRadioStation = 10;
    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public void next() {
        radioStation = radioStation + 1;
        if (radioStation > this.quantityRadioStation - 1) {
            radioStation = 0;
        }
    }

    public void prev() {
        radioStation = radioStation - 1;
        if (radioStation < 0) {
            radioStation = this.quantityRadioStation - 1;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            radioStation = 0;
            return;
        }
        if (newRadioStation > this.quantityRadioStation - 1) {
            radioStation = this.quantityRadioStation - 1;
            return;
        }
        radioStation = newRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
