public class TemperaturGraphTest {
    public static void main(String[] args) {
        TemperaturGraph temperaturGraph = new TemperaturGraph(2004);

        temperaturGraph.addTemperatur(1,15);
        temperaturGraph.addTemperatur(2,14);
        temperaturGraph.addTemperatur(3,13);
        temperaturGraph.addTemperatur(4,15);
        temperaturGraph.addTemperatur(5,11);
        temperaturGraph.addTemperatur(6,11);
        temperaturGraph.addTemperatur(7,12);
        temperaturGraph.addTemperatur(8,13);
        temperaturGraph.addTemperatur(9,11);
        temperaturGraph.addTemperatur(10,12);
        temperaturGraph.addTemperatur(11,11);
        temperaturGraph.addTemperatur(12,11);

        temperaturGraph.plotGraph();


    }
}
