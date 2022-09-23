package praticaIntegrada1;

public class Main {
    public static String[] CreateCityArray(){
        String cities[] = new String[10];

        cities[0] = "Londres";
        cities[1] = "Madrid";
        cities[2] = "Nueva York";
        cities[3] = "Buenos Aires";
        cities[4] = "Asuncion";
        cities[5] = "Säo Paulo";
        cities[6] = "Lima";
        cities[7] = "Santiago do Chile";
        cities[8] = "Lisboa";
        cities[9] = "Tokio";

        return cities;
    }

    public static int[][] CreateTemperatureArray(){
        int temperatures[][] = new int[10][2];

        temperatures[0][0] = -2;
        temperatures[1][0] = -3;
        temperatures[2][0] = -8;
        temperatures[3][0] = 4;
        temperatures[4][0] = 6;
        temperatures[5][0] = 5;
        temperatures[6][0] = 0;
        temperatures[7][0] = -7;
        temperatures[8][0] = -1;
        temperatures[9][0] = -10;

        temperatures[0][1] = 33;
        temperatures[1][1] = 32;
        temperatures[2][1] = 27;
        temperatures[3][1] = 37;
        temperatures[4][1] = 42;
        temperatures[5][1] = 43;
        temperatures[6][1] = 39;
        temperatures[7][1] = 26;
        temperatures[8][1] = 31;
        temperatures[9][1] = 35;

        return temperatures;
    }

    public static void main(String[] args) {
        String cities[] = CreateCityArray();
        int temperatures[][] = CreateTemperatureArray();

        int result[][] = new int[2][2];

        for (int i=0; i<2; i++){
            result[1][i] = 0;
            for (int j=0; j<10; j++){
                if (i==0 && temperatures[j][i] < result[1][i]){
                    result[0][i] = j;
                    result[1][i] = temperatures[j][i];
                }
                if (i==1 && temperatures[j][i] > result[1][i]){
                    result[0][i] = j;
                    result[1][i] = temperatures[j][i];
                }
            }
        }

        System.out.println("Temperatura mais baixa é " + result[1][0] + " da cidade " + cities[result[0][0]]);
        System.out.println("Temperatura mais Alta é " + result[1][1] + " da cidade " + cities[result[0][1]]);
    }
}