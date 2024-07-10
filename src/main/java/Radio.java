public class Radio {
    private int currentVolume;
    private int radioStation;

    public void next() {
        radioStation = radioStation + 1;
        if (radioStation > 9) {
            radioStation = 0;
        }
    }

    public void prev() {
        radioStation = radioStation - 1;
        if (radioStation < 0) {
            radioStation = 9;
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
        if (newRadioStation > 9) {
            radioStation = 9;
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
