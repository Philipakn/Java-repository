public class SearchAlgorithm implements Runnable {

    private Thread thread;
    String[] miniArray;
    String inputString;

    public SearchAlgorithm(String[] miniArray, String inputString) {
        this.miniArray = miniArray;
        this.inputString = inputString;
    }

    @Override
    public void run() {

        System.out.println("Started -> " + thread.getName());

        for (String element : miniArray) {

            if (element != null) {
                if (element.equals(inputString)) {
                    System.out.println(element + " <-> " + inputString);
                    System.out.println("Element found in Thread -> " + thread.getName());
                    UserGUI.showRunTime();
                }
            }
        }
        System.out.println(thread.getName() + " Ended");
    }

    public void startthread() {
        thread = new Thread(this);
        thread.start();

    }
}
