
 

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
 
public class BasicOpsTest extends Application {
	
	public static Color col1;
	public static Color col2;
	public static Color col3;
	
	public static Color col4;
	public static Color col5;
	public static Color col6;
	public static Color col7;
	
	public static String colorString = "-fx-background-color: black;";
	public static Color background1 = Color.BLACK;
	public static Color background2 = Color.GRAY;
	public static Color background3 = Color.WHITE;
	
	public static boolean squareBoolean = false;
	public static int squareNum1 = 8;
	public static int squareNum2 = 16;
	public static int squareNum3 = 25;
	public static int squareNum4 = 32;
	public static int squareNumContaner = 8;
	
	public static boolean tg1 = false;
	public static boolean tg2 = false;
	public static boolean tg3 = false;
	public static boolean tg4 = false;
	public static boolean tg5 = false;
	public static boolean tg6 = false;
	public static boolean tg7 = false;
		
	public static String strt1 = "";
	public static String strtt1 = "";
	public static String strt2 = "";
	public static String strtt2 = "";
	public static String strt3 = "";
	public static String strtt3 = "";
	public static String strt4 = "";
	public static String strtt4 = "";
	public static String strt5 = "";
	public static String strtt5 = "";
	public static String strt6 = "";
	public static String strtt6 = "";
	public static String strt7 = "";
	public static String strtt7 = "";
	
	
	public static int number1;
	public static int number2;
	public static int number3;
	public static int k=1;
	
	//tn
	public static boolean colorBoolean1 = false;
	public static boolean colorBoolean2 = false;
	public static boolean colorBoolean3 = false;
	public static boolean colorBoolean4 = false;
	public static boolean colorBoolean5 = false;
	public static boolean colorBoolean6 = false;
	public static boolean colorBoolean7 = false;
	
	public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        primaryStage.setFullScreen(false);
        primaryStage.centerOnScreen();
        
        //instancate components
        Group root = new Group();
        Pane p1 = new Pane();
       // System.out.println(Color.parseColor(BasicOpsTest.background));
        p1.setStyle(BasicOpsTest.colorString);
       // p1.setStyle("-fx-background-color: linear-gradient(gray, seashell, lightblue, gray);");
        HBox hb = new HBox();
        VBox v1 = new VBox();
        Pane p2 = new Pane();
        Pane p3 = new Pane();
        p1.getChildren().add(hb);
        hb.getChildren().add(p2);
        hb.getChildren().add(p3);
       
        p2.setMaxWidth(200);
        p2.setPrefHeight(700);
        
        p3.setMaxWidth(1000);
        p3.setPrefHeight(700);
       
        Button b1 = new Button("ENTER NUMBERS");
        //b1.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        b1.setMinHeight(30);
        b1.setMaxWidth(200);
        
        TextField t1 =new TextField();
        t1.setMinWidth(155);
        t1.setMinHeight(30);
        TextField t2 =new TextField();
        t2.setMinWidth(155);
        t2.setMinHeight(30);
        TextField t3 =new TextField();
        t3.setMinWidth(155);
        t3.setMinHeight(30);
        
        ColorPicker cl1 = new ColorPicker();
        //cl1.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
       //cl1.setStyle("-fx-background-color: linear-gradient(gray, seashell, lightblue, gray)");//-fx-background-color: transparent;
        cl1.setValue(Color.BLUEVIOLET);
       // cl1.setMinWidth(150);
        cl1.setMinHeight(30);
        BasicOpsTest.col1 = cl1.getValue();
        
        ColorPicker cl2 = new ColorPicker();
        //cl2.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        cl2.setValue(Color.BLUE);
       // cl2.setMinWidth(150);
        cl2.setMinHeight(30);
        BasicOpsTest.col2 = cl2.getValue();
        
        ColorPicker cl3 = new ColorPicker();
        //cl3.setStyle("-fx-background-color: -fx-transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        cl3.setValue(Color.CYAN);
        //cl3.setMinWidth(150);
        cl3.setMinHeight(30);
        BasicOpsTest.col3 = cl3.getValue();
        
        
        ColorPicker cl4 = new ColorPicker();
       // cl4.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        cl4.setValue(Color.LAWNGREEN);
        cl4.setMinWidth(150);
        cl4.setMinHeight(30);
        BasicOpsTest.col4 = cl4.getValue();
        ColorPicker cl5 = new ColorPicker();
       // cl5.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        cl5.setValue(Color.YELLOW);
        cl5.setMinWidth(150);
        cl5.setMinHeight(30);
        BasicOpsTest.col5 = cl5.getValue();
        ColorPicker cl6 = new ColorPicker();
       // cl6.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        cl6.setValue(Color.ORANGE);
        cl6.setMinWidth(150);
        cl6.setMinHeight(30);
        BasicOpsTest.col6 = cl6.getValue();
        ColorPicker cl7 = new ColorPicker();
      //  cl7.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        cl7.setValue(Color.RED);
        cl7.setMinWidth(150);
        cl7.setMinHeight(30);
        BasicOpsTest.col7 = cl7.getValue();
        
        Label l1 = new Label("	Number 1 & 2");
        l1.setStyle("-fx-background-color: gainsboro;");
        l1.setMinWidth(200);
        l1.setMinHeight(30);
       
        Label l2 = new Label("	Number 1 & 3");
        l2.setStyle("-fx-background-color:  gainsboro;");
        l2.setMinWidth(200);
        l2.setMinHeight(30);
        Label l3 = new Label("	Number 2 & 3");
        l3.setStyle("-fx-background-color: gainsboro;");
        l3.setMinWidth(200);
        l3.setMinHeight(30);
        Label l4 = new Label("	Number 1 & 2 & 3");
        l4.setStyle("-fx-background-color: gainsboro;");
        l4.setMinWidth(200);
        l4.setMinHeight(30);
        
        HBox thb1 = new HBox();
        HBox thb2 = new HBox();
        HBox thb3 = new HBox();
        Button up1 = new Button("\u2191");
        //up1.setMinWidth(10);
        up1.setMinHeight(30);
        Button up2 = new Button("\u2191");
       // up2.setMinWidth(10);
        up2.setMinHeight(30);
        Button up3 = new Button("\u2191");
       // up3.setMinWidth(10);
        up3.setMinHeight(30);
        
        Button down1 = new Button("\u2193");
       // down1.setMinWidth(10);
        down1.setMinHeight(30);
        Button down2 = new Button("\u2193");
        //down2.setMinWidth(10);
        down2.setMinHeight(30);
        Button down3 = new Button("\u2193");
       // down3.setMinWidth(10);
        down3.setMinHeight(30);
        
        //clear toggel
        
        Button clear1 = new Button("C");
        clear1.setMinHeight(30);
        Button clear2 = new Button("C");
        clear2.setMinHeight(30);
        Button clear3 = new Button("C");
        clear3.setMinHeight(30);
    
        ToggleButton tn1 = new ToggleButton("T");
        tn1.setMinHeight(30);
        ToggleButton tn2 = new ToggleButton("T");
        tn2.setMinHeight(30);
        ToggleButton tn3 = new ToggleButton("T");
        tn3.setMinHeight(30);
        ToggleButton tn4 = new ToggleButton("T");
        tn4.setMinHeight(30);
        ToggleButton tn5 = new ToggleButton("T");
        tn5.setMinHeight(30);
        ToggleButton tn6 = new ToggleButton("T");
        tn6.setMinHeight(30);
        ToggleButton tn7 = new ToggleButton("T");
        tn7.setMinHeight(30);
        
        HBox topHB = new HBox();
        Button top1 = new Button("Color 1");
        top1.setStyle("-fx-background-color: BLACK");
        top1.setMinWidth(66.6);
        top1.setMinHeight(30);
        Button top2 = new Button("Color 2");
        top2.setStyle("-fx-background-color: GRAY");
        top2.setMinWidth(66.6);
        top2.setMinHeight(30);
        Button top3 = new Button("Color 3");
        top3.setStyle("-fx-background-color: WHITE");
        top3.setMinWidth(66.6);
        top3.setMinHeight(30);
        
        HBox suqareHB = new HBox();
        Button square = new Button("Square");
        square.setMinWidth(100);
        square.setMinHeight(30);
        Button squareSize1 = new Button("1");
        squareSize1.setMinWidth(25);
        squareSize1.setMinHeight(30);
        Button squareSize2 = new Button("2");
        squareSize2.setMinWidth(25);
        squareSize2.setMinHeight(30);
        Button squareSize3 = new Button("3");
        squareSize3.setMinWidth(25);
        squareSize3.setMinHeight(30);
        Button squareSize4 = new Button("4");
        squareSize4.setMinWidth(25);
        squareSize4.setMinHeight(30);
     

       //Add and order
        //p2.setStyle("-fx-background-color: BLACK");
        p2.getChildren().add(v1);
        v1.getChildren().add(topHB);
        topHB.getChildren().add(top1);
        topHB.getChildren().add(top2);
        topHB.getChildren().add(top3);
        v1.getChildren().add(b1);
        
        v1.getChildren().add(thb1);
        thb1.getChildren().add(up1);
        thb1.getChildren().add(down1);
        thb1.getChildren().add(t1);
       
        
        HBox h1 = new HBox();
        ToggleButton bc1 = new ToggleButton ("( )");
     ///   bc1.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        //bc1.setMinWidth(50);
        bc1.setMinHeight(30);
        v1.getChildren().add(h1);
        h1.getChildren().add(cl1);
        h1.getChildren().add(clear1);
        h1.getChildren().add(tn1);
        h1.getChildren().add(bc1);
        
        v1.getChildren().add(thb2);
        thb2.getChildren().add(up2);
        thb2.getChildren().add(down2);
        thb2.getChildren().add(t2);
    
        
        HBox h2 = new HBox();
        ToggleButton bc2 = new ToggleButton ("( )");
       // bc2.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        //bc2.setMinWidth(50);
        bc2.setMinHeight(30);
        v1.getChildren().add(h2);
        h2.getChildren().add(cl2);
        h2.getChildren().add(clear2);
        h2.getChildren().add(tn2);
        h2.getChildren().add(bc2);
        
        v1.getChildren().add(thb3);
        thb3.getChildren().add(up3);
        thb3.getChildren().add(down3);
        thb3.getChildren().add(t3);
       
        
        
        HBox h3 = new HBox();
        ToggleButton bc3 = new ToggleButton ("( )");
      //  bc3.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        //bc3.setMinWidth(50);
        bc3.setMinHeight(30);
        v1.getChildren().add(h3);
        h3.getChildren().add(cl3);
        h3.getChildren().add(clear3);
        h3.getChildren().add(tn3);
        h3.getChildren().add(bc3);
        
        v1.getChildren().add(l1);
        
        HBox h4 = new HBox();
        ToggleButton bc4 = new ToggleButton("( )");
      //  bc4.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        //bc4.setMinWidth(50);
        bc4.setMinHeight(30);
        v1.getChildren().add(h4);
        h4.getChildren().add(cl4);
        h4.getChildren().add(tn4);
        h4.getChildren().add(bc4);
        
        v1.getChildren().add(l2);
        
        HBox h5 = new HBox();
        ToggleButton bc5 = new ToggleButton("( )");
      //  bc5.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
       // bc5.setMinWidth(50);
        bc5.setMinHeight(30);
        v1.getChildren().add(h5);
        h5.getChildren().add(cl5);
        h5.getChildren().add(tn5);
        h5.getChildren().add(bc5);
        
        v1.getChildren().add(l3);
        
        HBox h6 = new HBox();
        ToggleButton bc6 = new ToggleButton("( )");
      //  bc6.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
        //bc6.setMinWidth(50);
        bc6.setMinHeight(30);
        v1.getChildren().add(h6);
        h6.getChildren().add(cl6);
        h6.getChildren().add(tn6);
        h6.getChildren().add(bc6);
        
        v1.getChildren().add(l4);
        
        HBox h7 = new HBox();
        ToggleButton bc7 = new ToggleButton("( )");
    //    bc7.setStyle("-fx-background-color: transparent; -fx-border-radius: 2; -fx-border-width: 2; -fx-border-style: solid; -fx-border-color: gray gray black black;");
       // bc7.setMinWidth(50);
        bc7.setMinHeight(30);
        v1.getChildren().add(h7);
        h7.getChildren().add(cl7);
        h7.getChildren().add(tn7);
        h7.getChildren().add(bc7);
        
        v1.getChildren().add(suqareHB);
        suqareHB.getChildren().add(square);
        suqareHB.getChildren().add(squareSize1);
        suqareHB.getChildren().add(squareSize2);
        suqareHB.getChildren().add(squareSize3);
        suqareHB.getChildren().add(squareSize4);
        
        
       
        //p3.setStyle("-fx-background-color: linear-gradient(gray, black, lightblue, gray)");//-fx-background-color: BLACK
      
        Canvas canvas = new Canvas(800, 700);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        
        p3.getChildren().add(canvas);
        root.getChildren().add(p1);
  
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
      
        
        // toggle switches
        bc1.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.tg1 = oldValue){
        		BasicOpsTest.tg1 = false;
        	}else{BasicOpsTest.tg1 = true;}
        	 drawShapes(gc);
        	
        }));
        bc2.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.tg2 = oldValue){
        		BasicOpsTest.tg2 = false;
        	}else{BasicOpsTest.tg2 = true;}
        	 drawShapes(gc);
        	
        }));
        bc3.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.tg3 = oldValue){
        		BasicOpsTest.tg3 = false;
        	}else{BasicOpsTest.tg3 = true;}
        	 drawShapes(gc);
        }));
        bc4.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.tg4 = oldValue){
        		BasicOpsTest.tg4 = false;
        	}else{BasicOpsTest.tg4 = true;}
        	 drawShapes(gc);
        }));
        bc5.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.tg5 = oldValue){
        		BasicOpsTest.tg5 = false;
        	}else{BasicOpsTest.tg5 = true;}
        	 drawShapes(gc);
        }));
        bc6.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.tg6 = oldValue){
        		BasicOpsTest.tg6 = false;
        	}else{BasicOpsTest.tg6 = true;}
        	 drawShapes(gc);
        }));
        bc7.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.tg7 = oldValue){
        		BasicOpsTest.tg7 = false;
        	}else{BasicOpsTest.tg7 = true;}
        	 drawShapes(gc);
        }));
        
   
        
        
        
        
        cl1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				BasicOpsTest.col1 = cl1.getValue();
				 drawShapes(gc);
			}
		});
        cl2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				BasicOpsTest.col2 = cl2.getValue();
				 drawShapes(gc);
			}
		});
        cl3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				BasicOpsTest.col3 = cl3.getValue();
				 drawShapes(gc);
			}
		});
        
  cl4.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				BasicOpsTest.col4 = cl4.getValue();
				 drawShapes(gc);
			}
		});
  cl5.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent arg0) {
			BasicOpsTest.col5 = cl5.getValue();
			 drawShapes(gc);
		}
	});
  cl6.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent arg0) {
			BasicOpsTest.col6 = cl6.getValue();
			 drawShapes(gc);
		}
	});
  cl7.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent arg0) {
			BasicOpsTest.col7 = cl7.getValue();
			 drawShapes(gc);
		}
	});
        
        canvas.setOnMouseClicked((event) -> {
        	
        	System.out.println();
        });
  
        b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				if(t1.getText().trim().equals("[^0-9]") || t1.getText().trim().isEmpty()){
					BasicOpsTest.number1 = 0; 
					}else{ 
					BasicOpsTest.number1 = Integer.parseInt(t1.getText()); }
				
				if(t2.getText().trim().equals("[^0-9]") || t2.getText().trim().isEmpty()){ 
					BasicOpsTest.number2 = 0; 
					}else{
					BasicOpsTest.number2 = Integer.parseInt(t2.getText()); }
				
				if(t3.getText().trim().equals("[^0-9]") || t3.getText().trim().isEmpty()){ 
					BasicOpsTest.number3 = 0;
					}else{
					BasicOpsTest.number3 = Integer.parseInt(t3.getText()); }
				
			
				System.out.println(BasicOpsTest.number1+", "+BasicOpsTest.number2+", "+BasicOpsTest.number3+",");
				
				 drawShapes(gc);
				
			}
		});
        //up down
        up1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(javafx.event.ActionEvent event) {
				
				++BasicOpsTest.number1;
				t1.clear();
				t1.setText(String.valueOf(BasicOpsTest.number1));
				drawShapes(gc);
			}
		});
        down1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(javafx.event.ActionEvent event) {
				if(BasicOpsTest.number1 > 0){
					--BasicOpsTest.number1;
					t1.clear();
					t1.setText(String.valueOf(BasicOpsTest.number1));
					drawShapes(gc);
				}else{
					BasicOpsTest.number1 = 0;
					drawShapes(gc);
				}
				
			}
		});
        up2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(javafx.event.ActionEvent event) {
				
				++BasicOpsTest.number2;
				t2.clear();
				t2.setText(String.valueOf(BasicOpsTest.number2));
				drawShapes(gc);
			}
		});
        down2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(javafx.event.ActionEvent event) {
				if(BasicOpsTest.number2 > 0){
					--BasicOpsTest.number2;
					t2.clear();
					t2.setText(String.valueOf(BasicOpsTest.number2));
					drawShapes(gc);
				}else{
					BasicOpsTest.number2 = 0;
					drawShapes(gc);
				}
				
			}
		});
        up3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(javafx.event.ActionEvent event) {
				
				++BasicOpsTest.number3;
				t3.clear();
				t3.setText(String.valueOf(BasicOpsTest.number3));
				drawShapes(gc);
			}
		});
        down3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(javafx.event.ActionEvent event) {
				if(BasicOpsTest.number3 > 0){
					--BasicOpsTest.number3;
					t3.clear();
					t3.setText(String.valueOf(BasicOpsTest.number3));
					drawShapes(gc);
				}else{
					BasicOpsTest.number3 = 0;
					drawShapes(gc);
				}
				
			}
		});
        //clear toggel
        clear1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(javafx.event.ActionEvent event) {
				BasicOpsTest.number1 = 0;
				t1.setText(String.valueOf(BasicOpsTest.number1));
				drawShapes(gc);
			}
		});
        clear2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(javafx.event.ActionEvent event) {
				BasicOpsTest.number2 = 0;
				t2.setText(String.valueOf(BasicOpsTest.number2));
				drawShapes(gc);
			}
		});
        clear3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(javafx.event.ActionEvent event) {
				BasicOpsTest.number3 = 0;
				t3.setText(String.valueOf(BasicOpsTest.number3));
				drawShapes(gc);
			}
		});
        tn1.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	
        	if(BasicOpsTest.colorBoolean1 == false){
        	    if(BasicOpsTest.colorString == "-fx-background-color: black;"){
                	BasicOpsTest.col1 = Color.BLACK;
                }else if(BasicOpsTest.colorString == "-fx-background-color: gray;"){
                	BasicOpsTest.col1 = Color.GRAY;
                }else if(BasicOpsTest.colorString == "-fx-background-color: white;"){
                	BasicOpsTest.col1 = Color.WHITE;
                }
        	   
        		BasicOpsTest.colorBoolean1 = true;
        		drawShapes(gc);
        		}else{
            	BasicOpsTest.col1 = cl1.getValue();
            	BasicOpsTest.colorBoolean1 = false;
            	drawShapes(gc);
            	}
        		}));
        
    
        tn2.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.colorBoolean2 == false){
        	    if(BasicOpsTest.colorString == "-fx-background-color: black;"){
                	BasicOpsTest.col2 = Color.BLACK;
                }else if(BasicOpsTest.colorString == "-fx-background-color: gray;"){
                	BasicOpsTest.col2 = Color.GRAY;
                }else if(BasicOpsTest.colorString == "-fx-background-color: white;"){
                	BasicOpsTest.col2 = Color.WHITE;
                }
        		BasicOpsTest.colorBoolean2 = true;
        		drawShapes(gc);
        		}else{
            	BasicOpsTest.col2 = cl2.getValue();
            	BasicOpsTest.colorBoolean2 = false;
            	drawShapes(gc);
            	}
        		}));
        tn3.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.colorBoolean3 == false){
        	    if(BasicOpsTest.colorString == "-fx-background-color: black;"){
                	BasicOpsTest.col3 = Color.BLACK;
                }else if(BasicOpsTest.colorString == "-fx-background-color: gray;"){
                	BasicOpsTest.col3 = Color.GRAY;
                }else if(BasicOpsTest.colorString == "-fx-background-color: white;"){
                	BasicOpsTest.col3 = Color.WHITE;
                }
        		BasicOpsTest.colorBoolean3 = true;
        		drawShapes(gc);
        		}else{
            	BasicOpsTest.col3 = cl3.getValue();
            	BasicOpsTest.colorBoolean3 = false;
            	drawShapes(gc);
            	}
        		}));
        tn4.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.colorBoolean4 == false){
        	    if(BasicOpsTest.colorString == "-fx-background-color: black;"){
                	BasicOpsTest.col4 = BasicOpsTest.background1;
                }else if(BasicOpsTest.colorString == "-fx-background-color: gray;"){
                	BasicOpsTest.col4 = BasicOpsTest.background2;
                }else if(BasicOpsTest.colorString == "-fx-background-color: white;"){
                	BasicOpsTest.col4 = BasicOpsTest.background3;
                }
        		BasicOpsTest.colorBoolean4 = true;
        		drawShapes(gc);
        		}else{
            	BasicOpsTest.col4 = cl4.getValue();
            	BasicOpsTest.colorBoolean4 = false;
            	drawShapes(gc);
            	}
        		}));
        tn5.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.colorBoolean5 == false){
        	    if(BasicOpsTest.colorString == "-fx-background-color: black;"){
                	BasicOpsTest.col5 = BasicOpsTest.background1;
                }else if(BasicOpsTest.colorString == "-fx-background-color: gray;"){
                	BasicOpsTest.col5 = BasicOpsTest.background2;
                }else if(BasicOpsTest.colorString == "-fx-background-color: white;"){
                	BasicOpsTest.col5 = BasicOpsTest.background3;
                }
        		BasicOpsTest.colorBoolean5 = true;
        		drawShapes(gc);
        		}else{
            	BasicOpsTest.col5 = cl5.getValue();
            	BasicOpsTest.colorBoolean5 = false;
            	drawShapes(gc);
            	}
        		}));
        tn6.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.colorBoolean6 == false){
        	    if(BasicOpsTest.colorString == "-fx-background-color: black;"){
                	BasicOpsTest.col6 = BasicOpsTest.background1;
                }else if(BasicOpsTest.colorString == "-fx-background-color: gray;"){
                	BasicOpsTest.col6 = BasicOpsTest.background2;
                }else if(BasicOpsTest.colorString == "-fx-background-color: white;"){
                	BasicOpsTest.col6 = BasicOpsTest.background3;
                }
        		BasicOpsTest.colorBoolean6 = true;
        		drawShapes(gc);
        		}else{
            	BasicOpsTest.col6 = cl6.getValue();
            	BasicOpsTest.colorBoolean6 = false;
            	drawShapes(gc);
            	}
        		}));
        tn7.selectedProperty().addListener(((observable, oldValue, newValue) -> {
        	if(BasicOpsTest.colorBoolean7 == false){
        	    if(BasicOpsTest.colorString == "-fx-background-color: black;"){
                	BasicOpsTest.col7 = BasicOpsTest.background1;
                }else if(BasicOpsTest.colorString == "-fx-background-color: gray;"){
                	BasicOpsTest.col7 = BasicOpsTest.background2;
                }else if(BasicOpsTest.colorString == "-fx-background-color: white;"){
                	BasicOpsTest.col7 = BasicOpsTest.background3;
                }
        		BasicOpsTest.colorBoolean7 = true;
        		drawShapes(gc);
        		}else{
            	BasicOpsTest.col7 = cl7.getValue();
            	BasicOpsTest.colorBoolean7 = false;
            	drawShapes(gc);
            	}
        		}));
        
        //color buttons
        top1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				BasicOpsTest.colorString = "-fx-background-color: black;";
				p1.setStyle(BasicOpsTest.colorString);
				
				  if(BasicOpsTest.col1 == Color.GRAY){
	                	BasicOpsTest.col1 = Color.BLACK;
	                }else if(BasicOpsTest.col1 == Color.WHITE){
	                	BasicOpsTest.col1 = Color.BLACK;
	                }
				 if(BasicOpsTest.col2 == Color.GRAY){
	                	BasicOpsTest.col2 = Color.BLACK;
	                }else if(BasicOpsTest.col2 == Color.WHITE){
	                	BasicOpsTest.col2 = Color.BLACK;
	                }
				 if(BasicOpsTest.col3 == Color.GRAY){
	                	BasicOpsTest.col3 = Color.BLACK;
	                }else if(BasicOpsTest.col3 == Color.WHITE){
	                	BasicOpsTest.col3 = Color.BLACK;
	                }
				 if(BasicOpsTest.col4 == Color.GRAY){
	                	BasicOpsTest.col4 = Color.BLACK;
	                }else if(BasicOpsTest.col4 == Color.WHITE){
	                	BasicOpsTest.col4 = Color.BLACK;
	                }
				 if(BasicOpsTest.col5 == Color.GRAY){
	                	BasicOpsTest.col5 = Color.BLACK;
	                }else if(BasicOpsTest.col5 == Color.WHITE){
	                	BasicOpsTest.col5 = Color.BLACK;
	                }
				 if(BasicOpsTest.col6 == Color.GRAY){
	                	BasicOpsTest.col6 = Color.BLACK;
	                }else if(BasicOpsTest.col6 == Color.WHITE){
	                	BasicOpsTest.col6 = Color.BLACK;
	                }
				 if(BasicOpsTest.col7 == Color.GRAY){
	                	BasicOpsTest.col7 = Color.BLACK;
	                }else if(BasicOpsTest.col7 == Color.WHITE){
	                	BasicOpsTest.col7 = Color.BLACK;
	                }
				
				drawShapes(gc);
			}
		});
        top2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				BasicOpsTest.colorString = "-fx-background-color: gray;";
				p1.setStyle(BasicOpsTest.colorString);
				
				if(BasicOpsTest.col1 == Color.BLACK){
                	BasicOpsTest.col1 = Color.GRAY;
                }else if(BasicOpsTest.col1 == Color.WHITE){
                	BasicOpsTest.col1 = Color.GRAY;
                }
			 if(BasicOpsTest.col2 == Color.BLACK){
                	BasicOpsTest.col2 = Color.GRAY;
                }else if(BasicOpsTest.col2 == Color.WHITE){
                	BasicOpsTest.col2 = Color.GRAY;
                }
			 if(BasicOpsTest.col3 == Color.BLACK){
                	BasicOpsTest.col3 = Color.GRAY;
                }else if(BasicOpsTest.col3 == Color.WHITE){
                	BasicOpsTest.col3 = Color.GRAY;
                }
			 if(BasicOpsTest.col4 == Color.BLACK){
                	BasicOpsTest.col4 = Color.GRAY;
                }else if(BasicOpsTest.col4 == Color.WHITE){
                	BasicOpsTest.col4 = Color.GRAY;
                }
			 if(BasicOpsTest.col5 == Color.BLACK){
                	BasicOpsTest.col5 = Color.GRAY;
                }else if(BasicOpsTest.col5 == Color.WHITE){
                	BasicOpsTest.col5 = Color.GRAY;
                }
			 if(BasicOpsTest.col6 == Color.BLACK){
                	BasicOpsTest.col6 = Color.GRAY;
                }else if(BasicOpsTest.col6 == Color.WHITE){
                	BasicOpsTest.col6 = Color.GRAY;
                }
			 if(BasicOpsTest.col7 == Color.BLACK){
                	BasicOpsTest.col7 = Color.GRAY;
                }else if(BasicOpsTest.col7 == Color.WHITE){
                	BasicOpsTest.col7 = Color.GRAY;
                }
				
				drawShapes(gc);				
			}
		});
        top3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				BasicOpsTest.colorString = "-fx-background-color: white;";
				p1.setStyle(BasicOpsTest.colorString);
				
				if(BasicOpsTest.col1 == Color.BLACK){
                	BasicOpsTest.col1 = Color.WHITE;
                }else if(BasicOpsTest.col1 == Color.GRAY){
                	BasicOpsTest.col1 = Color.WHITE;
                }
			 if(BasicOpsTest.col2 == Color.BLACK){
                	BasicOpsTest.col2 = Color.WHITE;
                }else if(BasicOpsTest.col2 == Color.GRAY){
                	BasicOpsTest.col2 = Color.WHITE;
                }
			 if(BasicOpsTest.col3 == Color.BLACK){
                	BasicOpsTest.col3 = Color.WHITE;
                }else if(BasicOpsTest.col3 == Color.GRAY){
                	BasicOpsTest.col3 = Color.WHITE;
                }
			 if(BasicOpsTest.col4 == Color.BLACK){
                	BasicOpsTest.col4 = Color.WHITE;
                }else if(BasicOpsTest.col4 == Color.GRAY){
                	BasicOpsTest.col4 = Color.WHITE;
                }
			 if(BasicOpsTest.col5 == Color.BLACK){
                	BasicOpsTest.col5 = Color.WHITE;
                }else if(BasicOpsTest.col5 == Color.GRAY){
                	BasicOpsTest.col5 = Color.WHITE;
                }
			 if(BasicOpsTest.col6 == Color.BLACK){
                	BasicOpsTest.col6 = Color.WHITE;
                }else if(BasicOpsTest.col6 == Color.GRAY){
                	BasicOpsTest.col6 = Color.WHITE;
                }
			 if(BasicOpsTest.col7 == Color.BLACK){
                	BasicOpsTest.col7 = Color.WHITE;
                }else if(BasicOpsTest.col7 == Color.GRAY){
                	BasicOpsTest.col7 = Color.WHITE;
                }
				
				drawShapes(gc);
			}
		});
        
        //square
        square.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if(BasicOpsTest.squareBoolean == false){
					BasicOpsTest.squareBoolean = true;
					drawShapes(gc);
				}else{
					BasicOpsTest.squareBoolean = false;
					drawShapes(gc);}
				
			}
		});
        squareSize1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				BasicOpsTest.squareNumContaner = BasicOpsTest.squareNum1; 
				drawShapes(gc);
			}
		});
        squareSize2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				BasicOpsTest.squareNumContaner = BasicOpsTest.squareNum2; 
				drawShapes(gc);
			}
		});
        squareSize3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				BasicOpsTest.squareNumContaner = BasicOpsTest.squareNum3; 
				drawShapes(gc);
			}
		});
        squareSize4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				BasicOpsTest.squareNumContaner = BasicOpsTest.squareNum4; 
				drawShapes(gc);
			}
		});
        
    }
   
  
  
 

	private void drawShapes(GraphicsContext gc) {
		
		gc.clearRect(0, 0, 800, 700);
	
		int number1;
		int number2;
		int number3;
		
		 number1 = BasicOpsTest.number1;
		 number2 = BasicOpsTest.number2;
		 number3 = BasicOpsTest.number3;
				 
			if(BasicOpsTest.tg1 == false){
				BasicOpsTest.strt1 = " ";
				BasicOpsTest.strtt1 = " ";

			}else if(BasicOpsTest.tg1 == true){
				BasicOpsTest.strt1 = "(";
				BasicOpsTest.strtt1 = ")";
			}
			if(BasicOpsTest.tg2 == false){
				BasicOpsTest.strt2 = " ";
				BasicOpsTest.strtt2 = " ";

			}else if(BasicOpsTest.tg2 == true){
				BasicOpsTest.strt2 = "(";
				BasicOpsTest.strtt2 = ")";
			}
			if(BasicOpsTest.tg3 == false){
				BasicOpsTest.strt3 = " ";
				BasicOpsTest.strtt3 = " ";

			}else if(BasicOpsTest.tg3 == true){
				BasicOpsTest.strt3 = "(";
				BasicOpsTest.strtt3 = ")";
			}
			if(BasicOpsTest.tg4 == false){
				BasicOpsTest.strt4 = " ";
				BasicOpsTest.strtt4 = " ";

			}else if(BasicOpsTest.tg4 == true){
				BasicOpsTest.strt4 = "(";
				BasicOpsTest.strtt4 = ")";
			}
			if(BasicOpsTest.tg5 == false){
				BasicOpsTest.strt5 = " ";
				BasicOpsTest.strtt5 = " ";

			}else if(BasicOpsTest.tg5 == true){
				BasicOpsTest.strt5 = "(";
				BasicOpsTest.strtt5 = ")";
			}
			if(BasicOpsTest.tg6 == false){
				BasicOpsTest.strt6 = " ";
				BasicOpsTest.strtt6 = " ";

			}else if(BasicOpsTest.tg6 == true){
				BasicOpsTest.strt6 = "(";
				BasicOpsTest.strtt6 = ")";
			}
			if(BasicOpsTest.tg7 == false){
				BasicOpsTest.strt7 = " ";
				BasicOpsTest.strtt7 = " ";

			}else if(BasicOpsTest.tg7 == true){
				BasicOpsTest.strt7 = "(";
				BasicOpsTest.strtt7 = ")";
			}
			
	
		
		double x = 40;
		double y = 40;
		int k = BasicOpsTest.k;
		for(int i=0;i<20;i++){
			k=k-1;
			y=y+30;
			x = 100;
			k++;
		for(int j=0;j<20;j++){
			
			if(number1 == 0 && number2 == 0 && number3 == 0){
				if(k%1==0){
				    if(BasicOpsTest.colorString == "-fx-background-color: black;"){
				    	gc.setFill(Color.BLACK);
	                }else if(BasicOpsTest.colorString == "-fx-background-color: gray;"){
	                	gc.setFill(Color.GRAY);
	                }else if(BasicOpsTest.colorString == "-fx-background-color: white;"){
	                	gc.setFill(Color.WHITE);
	                }
					
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
				}
			}else if(number1 > 0 && number2 == 0 && number3 == 0){
				if(k%number1==0){
					gc.setFill(BasicOpsTest.col1);
					gc.fillText(""+BasicOpsTest.strt1+k+BasicOpsTest.strtt1+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					//1
					
				}
			}else if(number1 == 0 && number2 > 0 && number3 == 0){
				if(k%number2==0){
					gc.setFill(BasicOpsTest.col2);
					gc.fillText(""+BasicOpsTest.strt2+k+BasicOpsTest.strtt2+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					//2
				}
			}else if(number1 == 0 && number2 == 0 && number3 > 0){
				if(k%number3==0){
					gc.setFill(BasicOpsTest.col3);
					gc.fillText(""+BasicOpsTest.strt3+k+BasicOpsTest.strtt3+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					//3
				}
			}else if(number1 > 0 && number2 > 0 && number3 == 0){
				if(((k%number1)==0) && !((k%number2)==0)){
					gc.setFill(BasicOpsTest.col1);
					gc.fillText(""+BasicOpsTest.strt1+k+BasicOpsTest.strtt1+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//1
				
				if(!((k%number1)==0) && ((k%number2)==0)){
					gc.setFill(BasicOpsTest.col2);
					gc.fillText(""+BasicOpsTest.strt2+k+BasicOpsTest.strtt2+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//2
				
				if((k%number1)==0 && (k%number2)==0){
					gc.setFill(BasicOpsTest.col4);
					gc.fillText(""+BasicOpsTest.strt4+k+BasicOpsTest.strtt4+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					//1 - 2
					
				}
			}else if(number1 > 0 && number2 == 0 && number3 > 0){
				
				if(((k%number1)==0) && !((k%number3)==0)){
					gc.setFill(BasicOpsTest.col1);
					gc.fillText(""+BasicOpsTest.strt1+k+BasicOpsTest.strtt1+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//1
				
				if(!((k%number1)==0) && ((k%number3)==0)){
					gc.setFill(BasicOpsTest.col3);
					gc.fillText(""+BasicOpsTest.strt3+k+BasicOpsTest.strtt3+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//3
				
				if(((k%number1)==0) && ((k%number3)==0)){
					gc.setFill(BasicOpsTest.col5);
					gc.fillText(""+BasicOpsTest.strt5+k+BasicOpsTest.strtt5+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					//1 - 3
				}
				
			}else if(number1 == 0 && number2 > 0 && number3 > 0){
				
				if(!((k%number2)==0) && ((k%number3)==0)){
					gc.setFill(BasicOpsTest.col3);
					gc.fillText(""+BasicOpsTest.strt3+k+BasicOpsTest.strtt3+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//3
				
				if(((k%number2)==0) && !((k%number3)==0)){
					gc.setFill(BasicOpsTest.col2);
					gc.fillText(""+BasicOpsTest.strt2+k+BasicOpsTest.strtt2+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//2
				
				if((k%number2)==0 && (k%number3)==0){
					gc.setFill(BasicOpsTest.col6);
					gc.fillText(""+BasicOpsTest.strt6+k+BasicOpsTest.strtt6+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					//2 - 3
				}
				
			}else if(number1 > 0 && number2 > 0 && number3 > 0){
				
				if(!((k%number1)==0) && !((k%number2)==0) && !((k%number3)==0)){		//0
					
				    if(BasicOpsTest.colorString == "-fx-background-color: black;"){
				    	gc.setFill(Color.BLACK);
	                }else if(BasicOpsTest.colorString == "-fx-background-color: gray;"){
	                	gc.setFill(Color.GRAY);
	                }else if(BasicOpsTest.colorString == "-fx-background-color: white;"){
	                	gc.setFill(Color.WHITE);
	                }
				
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}
			
				if(((k%number1)==0) && !((k%number2)==0) && !((k%number3)==0)){
					gc.setFill(BasicOpsTest.col1);
					gc.fillText(""+BasicOpsTest.strt1+k+BasicOpsTest.strtt1+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//1
				
				if(((k%number2)==0) && !((k%number1)==0) && !((k%number3)==0)){
					gc.setFill(BasicOpsTest.col2);
					gc.fillText(""+BasicOpsTest.strt2+k+BasicOpsTest.strtt2+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//2
				 
				if(((k%number3)==0) && !((k%number1)==0) && !((k%number2)==0)){
					gc.setFill(BasicOpsTest.col3);
					gc.fillText(""+BasicOpsTest.strt3+k+BasicOpsTest.strtt3+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//3
				 
				if(((k%number1)==0) && ((k%number2)==0) && !((k%number3)==0)){
					gc.setFill(BasicOpsTest.col4);
					gc.fillText(""+BasicOpsTest.strt4+k+BasicOpsTest.strtt4+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//1 + 2
				
				if(((k%number1)==0) && !((k%number2)==0) && ((k%number3)==0)){
					gc.setFill(BasicOpsTest.col5);
					gc.fillText(""+BasicOpsTest.strt5+k+BasicOpsTest.strtt5+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//1 + 3
				
				if(!((k%number1)==0) && ((k%number2)==0) && ((k%number3)==0)){
					gc.setFill(BasicOpsTest.col6);
					gc.fillText(""+BasicOpsTest.strt6+k+BasicOpsTest.strtt6+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//2 + 3
				 
				if(((k%number1)==0) && ((k%number2)==0) && ((k%number3)==0)){
					gc.setFill(BasicOpsTest.col7);
					gc.fillText(""+BasicOpsTest.strt7+k+BasicOpsTest.strtt7+"",  x, y);
					if(BasicOpsTest.squareBoolean == true){gc.fillRect(x, y, BasicOpsTest.squareNumContaner, BasicOpsTest.squareNumContaner);}
					}//1 + 2 + 3
				
			}	
				
				
				x=x+30;
				k++;
			}
		}

	}
}
