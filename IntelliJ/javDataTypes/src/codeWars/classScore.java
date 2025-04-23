package codeWars;

public class classScore {
    public static void main(String[] args) {
        System.out.println(points(new int[]{100,90},11));

    }
    public static boolean points(int[]classPoints, int yourPoints){
        int sum = 0;
        int avg = 0;
        int sumWithMyPoints = 0;
        for (int score:classPoints){
            sum+=score;
        }
        sumWithMyPoints = sum + yourPoints;
        avg = sumWithMyPoints / (classPoints.length + 1);

        if (yourPoints > avg){
            return true;
        } else {
            return false;
        }
    }
}

