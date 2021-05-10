package Block5.Figures;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    ArrayList<Figure> figuren;

    FigureManager(){
        figuren = new ArrayList<>();
    }

    public void addFigure(Figure f){
        figuren.add(f);
    }

    public double getMaxPerimeter(){
        double maxPerimeter =0;
        for (Figure figure : figuren) {
           if (figure.getPerimeter() > maxPerimeter)
               maxPerimeter = figure.getPerimeter();
        }
        return maxPerimeter;
    }

    public double getAverageAreaSize(){
        double avg =0;
        for (Figure figure : figuren) {
               avg = figure.getAreal();
        }
        avg /= figuren.size();
        return avg;
    }

    public HashMap<String,Double> getAreaBySizeCategories(){
        HashMap<String,Double> areaBySizeCategories = new HashMap<>();
        for (Figure figure : figuren) {
            if (figure.getAreal() < 1000)
                areaBySizeCategories.put("klein", areaBySizeCategories.get("klein") + figure.getAreal());
            else if (figure.getAreal() >= 1000 && figure.getAreal() <= 4900)
                areaBySizeCategories.put("mittel", areaBySizeCategories.get("mittel") + figure.getAreal());
            else if (figure.getAreal() >= 5000)
                areaBySizeCategories.put("groß", areaBySizeCategories.get("groß") + figure.getAreal());
        }
        return areaBySizeCategories;
    }
    }
