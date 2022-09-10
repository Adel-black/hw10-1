public class RadioService {
    public int currentVolume;
    public int currentNumberStation;
    public int maxStation;

    public RadioService() {
        maxStation = 9;

    }

    public RadioService(int countStations) {
        maxStation = countStations -1;

    }

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
        if (currentNumberStation > maxStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public int increaseVolume(int newCurrentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return newCurrentVolume;
    }

    public void nextNumberStation() {
        if (currentNumberStation < maxStation) {
            currentNumberStation = currentNumberStation + 1;
        } else {
            currentNumberStation = 0;
        }
    }

    public void prevNumberStation() {
        if (currentNumberStation > 0) {
            currentNumberStation = currentNumberStation - 1;
        } else {
            currentNumberStation = maxStation;
        }
    }

}


