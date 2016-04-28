//U10416003
import javafx.animation.*;
import javafx.util.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.input.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import java.util.*;
import java.security.SecureRandom;



public class BeanGame extends Application{
	private int ballNumber = 0;
	private double[] Y = {50,99,129,159,189,219,249,279,290,360};
	private ArrayList<double[]> X = new ArrayList<>();
	private ArrayList<Polyline> MoveBall = new ArrayList<>();
	Pane pane = new Pane();
	@Override
	public void start(Stage primaryStage){
		//Create a Scene
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Beangame");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//set ball move button
		pane.requestFocus();
		pane.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.SPACE){ 
				MoveBall();
			}
		});
		//Create a Polyline
		Polyline polyline = new Polyline();
		for(int i = 0;i <=500;i++){
			X.add(new double[10]);
			(X.get(i))[0] = 230;
			(X.get(i))[1] = 230;
		}
	
		polyline.getPoints().addAll(210d,50d,210d,90d,110d,300d,110d,360d,350d,360d,350d,300d,250d,90d,250d,50d);
		pane.getChildren().add(polyline);
	

		//Create Line and location Line
		Line lineTOP1 = new Line(140,300,140,360);
		lineTOP1.setStrokeWidth(5);
		lineTOP1.setStroke(Color.RED);
		pane.getChildren().add(lineTOP1);
			
		Line lineTOP2 = new Line(170,300,170,360);
		lineTOP2.setStrokeWidth(5);
		lineTOP2.setStroke(Color.RED);
		pane.getChildren().add(lineTOP2);
			
		Line lineTOP3 = new Line(200,300,200,360);
		lineTOP3.setStrokeWidth(5);
		lineTOP3.setStroke(Color.RED);
		pane.getChildren().add(lineTOP3);
			
		Line lineTOP4 = new Line(230,300,230,360);
		lineTOP4.setStrokeWidth(5);
		lineTOP4.setStroke(Color.RED);
		pane.getChildren().add(lineTOP4);
			
		Line lineDown1 = new Line(260,300,260,360);
		lineDown1.setStrokeWidth(5);
		lineDown1.setStroke(Color.RED);
		pane.getChildren().add(lineDown1);
			
		Line lineDown2 = new Line(290,300,290,360);
		lineDown2.setStrokeWidth(5);
		lineDown2.setStroke(Color.RED);
		pane.getChildren().add(lineDown2);
			
		Line lineDown3 = new Line(320,300,320,360);
		lineDown3.setStrokeWidth(5);
		lineDown3.setStroke(Color.RED);
		pane.getChildren().add(lineDown3);
			
	
			
		//BeanGame point

		Circle dot1 = new Circle();
		dot1.setCenterX(140);
		dot1.setCenterY(290);
		dot1.setRadius(4);
		dot1.setStrokeWidth(8);
		dot1.setStroke(Color.BLUE);
		pane.getChildren().add(dot1);

		Circle dot2 = new Circle();
		dot2.setCenterX(170);
		dot2.setCenterY(290);
		dot2.setRadius(4);
		dot2.setStrokeWidth(8);
		dot2.setStroke(Color.BLUE);
		pane.getChildren().add(dot2);

		Circle dot3 = new Circle();
		dot3.setCenterX(200);
		dot3.setCenterY(290);
		dot3.setRadius(4);
		dot3.setStrokeWidth(8);
		dot3.setStroke(Color.BLUE);
		pane.getChildren().add(dot3);
			
		Circle dot4 = new Circle();
		dot4.setCenterX(230);
		dot4.setCenterY(290);
		dot4.setRadius(4);
		dot4.setStrokeWidth(8);
		dot4.setStroke(Color.BLUE);
		pane.getChildren().add(dot4);
			
		Circle dot5 = new Circle();
		dot5.setCenterX(260);
		dot5.setCenterY(290);
		dot5.setRadius(4);
		dot5.setStrokeWidth(8);
		dot5.setStroke(Color.BLUE);
		pane.getChildren().add(dot5);
			
		Circle dot6 = new Circle();
		dot6.setCenterX(290);
		dot6.setCenterY(290);
		dot6.setRadius(4);
		dot6.setStrokeWidth(8);
		dot6.setStroke(Color.BLUE);
		pane.getChildren().add(dot6);

		Circle dot7 = new Circle();
		dot7.setCenterX(320);
		dot7.setCenterY(290);
		dot7.setRadius(4);
		dot7.setStrokeWidth(8);
		dot7.setStroke(Color.BLUE);
		pane.getChildren().add(dot7);
			
		Circle dot8 = new Circle();
		dot8.setCenterX(155);
		dot8.setCenterY(260);
		dot8.setRadius(4);
		dot8.setStrokeWidth(8);
		dot8.setStroke(Color.BLUE);
		pane.getChildren().add(dot8);
			
		Circle dot9 = new Circle();
		dot9.setCenterX(185);
		dot9.setCenterY(260);
		dot9.setRadius(4);
		dot9.setStrokeWidth(8);
		dot9.setStroke(Color.BLUE);
		pane.getChildren().add(dot9);
			
		Circle dot10 = new Circle();
		dot10.setCenterX(215);
		dot10.setCenterY(260);
		dot10.setRadius(4);
		dot10.setStrokeWidth(8);
		dot10.setStroke(Color.BLUE);
		pane.getChildren().add(dot10);

		Circle dot11 = new Circle();
		dot11.setCenterX(245);
		dot11.setCenterY(260);
		dot11.setRadius(4);
		dot11.setStrokeWidth(8);
		dot11.setStroke(Color.BLUE);
		pane.getChildren().add(dot11);
			
		Circle dot12 = new Circle();
		dot12.setCenterX(275);
		dot12.setCenterY(260);
		dot12.setRadius(4);
		dot12.setStrokeWidth(8);
		dot12.setStroke(Color.BLUE);
		pane.getChildren().add(dot12);
		
		Circle dot13 = new Circle();
		dot13.setCenterX(305);
		dot13.setCenterY(260);
		dot13.setRadius(4);
		dot13.setStrokeWidth(8);
		dot13.setStroke(Color.BLUE);
		pane.getChildren().add(dot13);
			
		Circle dot14 = new Circle();
		dot14.setCenterX(170);
		dot14.setCenterY(230);
		dot14.setRadius(4);
		dot14.setStrokeWidth(8);
		dot14.setStroke(Color.BLUE);
		pane.getChildren().add(dot14);
			
		Circle dot15 = new Circle();
		dot15.setCenterX(200);
		dot15.setCenterY(230);
		dot15.setRadius(4);
		dot15.setStrokeWidth(8);
		dot15.setStroke(Color.BLUE);
		pane.getChildren().add(dot15);
	
		Circle dot16 = new Circle();
		dot16.setCenterX(230);
		dot16.setCenterY(230);
		dot16.setRadius(4);
		dot16.setStrokeWidth(8);
		dot16.setStroke(Color.BLUE);
		pane.getChildren().add(dot16);
			
		Circle dot17 = new Circle();
		dot17.setCenterX(260);
		dot17.setCenterY(230);
		dot17.setRadius(4);
		dot17.setStrokeWidth(8);
		dot17.setStroke(Color.BLUE);
		pane.getChildren().add(dot17);
			
		Circle dot18 = new Circle();
		dot18.setCenterX(290);
		dot18.setCenterY(230);
		dot18.setRadius(4);
		dot18.setStrokeWidth(8);
		dot18.setStroke(Color.BLUE);
		pane.getChildren().add(dot18);
			
		Circle dot19 = new Circle();
		dot19.setCenterX(185);
		dot19.setCenterY(200);
		dot19.setRadius(4);
		dot19.setStrokeWidth(8);
		dot19.setStroke(Color.BLUE);
		pane.getChildren().add(dot19);
			
		Circle dot20 = new Circle();
		dot20.setCenterX(215);
		dot20.setCenterY(200);
		dot20.setRadius(4);
		dot20.setStrokeWidth(8);
		dot20.setStroke(Color.BLUE);
		pane.getChildren().add(dot20);
			
		Circle dot21 = new Circle();
		dot21.setCenterX(245);
		dot21.setCenterY(200);
		dot21.setRadius(4);
		dot21.setStrokeWidth(8);
		dot21.setStroke(Color.BLUE);
		pane.getChildren().add(dot21);

		Circle dot22 = new Circle();
		dot22.setCenterX(275);
		dot22.setCenterY(200);
		dot22.setRadius(4);
		dot22.setStrokeWidth(8);
		dot22.setStroke(Color.BLUE);
		pane.getChildren().add(dot22);
			
		Circle dot23 = new Circle();
		dot23.setCenterX(200);
		dot23.setCenterY(170);
		dot23.setRadius(4);
		dot23.setStrokeWidth(8);
		dot23.setStroke(Color.BLUE);
		pane.getChildren().add(dot23);
			
		Circle dot24 = new Circle();
		dot24.setCenterX(230);
		dot24.setCenterY(170);
		dot24.setRadius(4);
		dot24.setStrokeWidth(8);
		dot24.setStroke(Color.BLUE);
		pane.getChildren().add(dot24);
			
		Circle dot25 = new Circle();
		dot25.setCenterX(260);
		dot25.setCenterY(170);
		dot25.setRadius(4);
		dot25.setStrokeWidth(8);
		dot25.setStroke(Color.BLUE);
		pane.getChildren().add(dot25);
		
		Circle dot26 = new Circle();
		dot26.setCenterX(215);
		dot26.setCenterY(140);
		dot26.setRadius(4);
		dot26.setStrokeWidth(8);
		dot26.setStroke(Color.BLUE);
		pane.getChildren().add(dot26);
		
		Circle dot27 = new Circle();
		dot27.setCenterX(245);
		dot27.setCenterY(140);
		dot27.setRadius(4);
		dot27.setStrokeWidth(8);
		dot27.setStroke(Color.BLUE);
		pane.getChildren().add(dot27);
			
		Circle dot28 = new Circle();
		dot28.setCenterX(230);
		dot28.setCenterY(110);
		dot28.setRadius(4);
		dot28.setStrokeWidth(8);
		dot28.setStroke(Color.BLUE);
		pane.getChildren().add(dot28);
		
	}
	//set ball move 
	public void MoveBall(){
		Circle ball =new Circle(155,300,6);
		pane.getChildren().add(ball);
		
		SecureRandom random =new SecureRandom();
		//set balls color in random
		ball.setFill(new Color(random.nextDouble(), random.nextDouble(), random.nextDouble(), 1.0));
		//choose the way which the balls move 
		for(int i = 2;i<9;i++){
			if(random.nextInt(2)==1){
				X.get(ballNumber)[i] += X.get(ballNumber)[i-1] + 15;
			}
			else{
				X.get(ballNumber)[i] += X.get(ballNumber)[i-1] - 15; 
			}
		}
		//Let the ball fall straight into the bottom
		X.get(ballNumber)[9] = X.get(ballNumber)[8];
		MoveBall.add(new Polyline());
		for(int i = 0; i <9; i++){
			((MoveBall.get(ballNumber)).getPoints()).addAll(X.get(ballNumber)[i], Y[i]);
		}
		((MoveBall.get(ballNumber)).getPoints()).addAll(X.get(ballNumber)[9], Y[9]-5.0);
		//controll falling time,routine,ball
		PathTransition pt =new PathTransition(Duration.millis(2000),MoveBall.get(ballNumber),ball);
		pt.play();
		ballNumber++;
	}
	
	public static void main(String[] args) {
		launch(args);
    }
	
	
}