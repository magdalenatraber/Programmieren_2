package Block5.Figures;

public class FigureManagerDemo {
    public static void main(String[] args) {
        FigureManager figureManager = new FigureManager();
        figureManager.addFigure(new Rectangle(40,50));
        figureManager.addFigure(new Rectangle(40,50));
        figureManager.addFigure(new Rectangle(40,50));
        figureManager.addFigure(new Rectangle(40,50));
        figureManager.addFigure(new Circle(15));
        figureManager.addFigure(new Circle(200));
        figureManager.addFigure(new Rectangle(40,50));
    }
}
