public class MainController {
    private double warmValue;
    private double temperatureValue;

    public static void main(String[] args) {
        MainController mainController=new MainController();
        WarmingController warmingController=new WarmingController();
        TemperatureController temperatureController=new TemperatureController();

        mainController.warmValue=warmingController.getWarmValue();
        mainController.temperatureValue=temperatureController.getTemperatureValue();


        System.out.println("Current warm: "+mainController.warmValue);
        System.out.println("Current temperature: "+ mainController.temperatureValue);

        warmingController.setWarmValue(56.23);
        mainController.warmValue=warmingController.getWarmValue();
        System.out.println("Current warm (new): "+mainController.warmValue);

        temperatureController.setTemperatureValue(14.21);
        mainController.temperatureValue=temperatureController.getTemperatureValue();
        System.out.println("Current temperature (new): "+ mainController.temperatureValue);
    }
}
