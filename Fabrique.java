import java.util.ArrayList;

public class Fabrique {
	
	private ArrayList<Point> listePoint;
	//Test
	public void creerCarre (){
		Point posinit = new Point();
		listePoint.add(posinit);	//Ajout du point posinit dans l'ArrayList listePoint;
		double posx = posinit.getX();
		double posy = posinit.getY();
		Point pos1 = new Point(posx+1,posy);
		listePoint.add(pos1);
		Point pos2 = new Point(posx+2,posy);
		listePoint.add(pos2);
		Point pos3 = new Point(posx,posy+1);
		listePoint.add(pos3);
		Point pos4 = new Point(posx+1,posy+1);
		listePoint.add(pos4);
		Point pos5 = new Point(posx+2,posy+1);
		listePoint.add(pos5);
		Point pos6 = new Point(posx,posy+2);
		listePoint.add(pos6);
		Point pos7 = new Point(posx+1,posy+2);
		listePoint.add(pos7);
		Point pos8 = new Point(posx+2,posy+2);
		listePoint.add(pos8);
	}
}
