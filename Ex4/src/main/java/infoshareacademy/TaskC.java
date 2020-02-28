package infoshareacademy;

public class TaskC {
    public boolean checkIfLettersRepeat(String name){

        char[] letterArray =new char[name.length()];
        String newName = name.toLowerCase();
        for (int i = 0; i <letterArray.length ; i++) {
            letterArray[i] = newName.charAt(i);
        }
        boolean check = false;
        for (int i = 0; i < letterArray.length ; i++) {
            char checking = letterArray[i];
            for (int j = i+1; j < letterArray.length ; j++) {
                if (checking == letterArray[j]) check = true;
            }

        }
        return check;
    }

}
