public class Radio {
    public int currentVolume;
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
            return;
        }
        if (newRadioStation > 9) {
            return;
        }
        radioStation = newRadioStation;
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
