import java.util.ArrayList;

public class Data{



    public static float computeAvg(ArrayList<Measurable> listM){
        //code to read an ArrayList of Measurable objects and divide by the number of objects(list.size())
        //to get the average
        float avg = 0;
        float total = 0;
        for(int i = 0; i < listM.size(); i++){
            total = total + listM.get(i).getMeasure();
        }

        avg = total / listM.size();

        return avg; //the int variable that holds the average.
    }
}
