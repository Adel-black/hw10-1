public class RadioService {
    public int currentVolume;
    public int currentNumberStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation < 0) {
            return;
        }
        if (currentNumberStation > 9) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void increaseVolume(int newCurrentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void nextNumberStation() {
        if (currentNumberStation < 9) {
            currentNumberStation = currentNumberStation + 1;
        } else {
            currentNumberStation = 0;
        }
    }

    public void prevNumberStation() {
        if (currentNumberStation > 0) {
            currentNumberStation = currentNumberStation - 1;
        } else {
            currentNumberStation = 9;
        }
    }
}


