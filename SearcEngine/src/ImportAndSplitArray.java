import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ImportAndSplitArray {

    public static String[] importArray() {

        Scanner importString;
        ArrayList<String> importedArrayList = new ArrayList<>();
        String[] importedArray;

        try {

            importString = new Scanner(new FileReader("C:\\Users\\Phili\\Desktop\\Task\\Document.txt")).useDelimiter(", ");

            while (importString.hasNext()) {

                importedArrayList.add(importString.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

        Collections.shuffle(importedArrayList);
        importedArray = new String[importedArrayList.size()];
        importedArray = importedArrayList.toArray(importedArray);
        return importedArray;
    }


    public static ArrayList<String[]> splitArray(int noOfCores, String[] importedArray) {

        int noOfElements = importedArray.length / noOfCores;
        System.out.println("Number of Elements per miniArray: " + noOfElements);
        int splitIndex = 1;
        ArrayList<String[]> splitList = new ArrayList<String[]>();
        String[] miniArray = new String[noOfElements];
        int miniArrayIndex = 0;

        for (int index = 0; index <= importedArray.length - 1; index++) {

            int splitPoint = ((importedArray.length * splitIndex) / noOfCores) - 1;

            if (splitPoint == index) {
                System.out.println(index + " <-> " + splitIndex);
                splitList.add(miniArray);
                miniArray = new String[noOfElements];
                miniArrayIndex = 0;
                splitIndex++;
            }

            if (splitPoint > index) {

                String element = importedArray[index];
                miniArray[miniArrayIndex++] = element;
            }
        }
        return splitList;
    }

    public static void isolateArray(int noOfCores, String[] importedArray, String inputString) {

        ArrayList<String[]> splitList = ImportAndSplitArray.splitArray(noOfCores, importedArray);

        for (String[] miniarray : splitList) {
            SearchAlgorithm task = new SearchAlgorithm(miniarray, inputString);
            task.startthread();
        }
    }
}
