package application;

import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class GamePageController {
//	ArrayList<Integer> sequence = new ArrayList<Integer>();
//	ArrayList<Integer> sequence2 = new ArrayList<Integer>();
	int sequencePivot = 0;
	
	// Components
	@FXML
    private Rectangle counterBox;
	
	@FXML
    private Button btnA;

    @FXML
    private Button btnS;

    @FXML
    private Button btnD;

    @FXML
    private Button btnF;

    @FXML
    private Button btnJ;

    @FXML
    private Button btnK;

    @FXML
    private Button btnL;

    @FXML
    private Button btn8;
    @FXML
    private Text p1Name;
    @FXML
    private Text p1Score;
    @FXML
    private Text p2Name;
    @FXML
    private Text p2Score;
    @FXML
    private Text countDownTimer;
    @FXML
    private Text nameTurn;
    @FXML
    private TextField messageType;
    @FXML
    private Button sendBtn;
    @FXML
    private Text displayMessage;
    @FXML
    private Text lastPattern;
    @FXML
    private Text yourPattern;
    @FXML
    private Text wordCount;

    @FXML
    private Text slash;

    @FXML
    private Text wordMax;
    
	
    Timeline timeline;
    

    String text ;
    Integer timeSeconds,timeSeconds2 ;
    Boolean keyboardOff = true;
    Boolean secondTurn = false;
    
    int nword;
    int outOf;
    
    int score1;
    int score2;
    
    // Adding Sound
    void playSound(String fileName) {
     String musicFile = fileName;
     Media sound = new Media(new File(musicFile).toURI().toString());
     MediaPlayer mediaPlayer = new MediaPlayer(sound);
     mediaPlayer.play();
    }
    
    
	// Creating Sequence
	public void addToSequence(int sequenceValue) {
		
		if(DupMeClient.myPattern.size()==nword-1)keyboardOff=true;
		
		DupMeClient.myPattern.add(sequenceValue);
	}

	// Add to sequence using keyboard
	  @FXML
	    void addToSequencePress(KeyEvent event) throws InterruptedException{
		  if(!messageType.isFocused() && !keyboardOff) {
		  int value;
		  String input = event.getCode().toString();
		  
		  if(input == ("DIGIT1")) {
			  value = 1;
			  addToSequence(value);
			  clearButton();
			  btnA.setStyle("-fx-background-color:#FF9090; -fx-text-fill:#FFFFFF"); 
			  wordCount.setText(Integer.toString(++outOf));
			  playSound("pianoC3.mp3");
			  
			  
			  String sequenceText = "" ;
				for (int i = 0; i < DupMeClient.myPattern.size(); i++) {
					sequenceText = sequenceText + Integer.toString(DupMeClient.myPattern.get(i));
					System.out.print(DupMeClient.myPattern.get(i));
				}
				displayMessage.setText(sequenceText);
				System.out.println("\nEnd of Array");
				
				if(secondTurn == true && DupMeClient.myPattern.get(sequencePivot) == DupMeClient.opponentPattern.get(sequencePivot)) {
					score2+=3000;
					p2Score.setText(Integer.toString(score2));
					sequencePivot++;
				} else if (secondTurn == true) {
					sequencePivot++;
				}
				
		  }
		  else if(input == ("DIGIT2")) {
			  value = 2;
			  addToSequence(value);
			  clearButton();
			  btnS.setStyle("-fx-background-color:#FF9090; -fx-text-fill:#FFFFFF");
			  wordCount.setText(Integer.toString(++outOf));
			  playSound("pianoD3.mp3");
			  
			  
			  String sequenceText = "" ;
				for (int i = 0; i < DupMeClient.myPattern.size(); i++) {
					sequenceText = sequenceText + Integer.toString(DupMeClient.myPattern.get(i));
					System.out.print(DupMeClient.myPattern.get(i));
				}
				displayMessage.setText(sequenceText);
				System.out.println("\nEnd of Array");
				
				if(secondTurn == true && DupMeClient.myPattern.get(sequencePivot) == DupMeClient.opponentPattern.get(sequencePivot)) {
					score2+=3000;
					p2Score.setText(Integer.toString(score2));
					sequencePivot++;
				} else if (secondTurn == true) {
					sequencePivot++;
				}
				
		  }
		  else if(input == ("DIGIT3")) {
			  value = 3;
			  addToSequence(value);
			  clearButton();
			  btnD.setStyle("-fx-background-color:#FF9090; -fx-text-fill:#FFFFFF");
			  wordCount.setText(Integer.toString(++outOf));
			  playSound("pianoE3.mp3");
			  
			  String sequenceText = "" ;
				for (int i = 0; i < DupMeClient.myPattern.size(); i++) {
					sequenceText = sequenceText + Integer.toString(DupMeClient.myPattern.get(i));
					System.out.print(DupMeClient.myPattern.get(i));
				}
				displayMessage.setText(sequenceText);
				System.out.println("\nEnd of Array");
				
				if(secondTurn == true && DupMeClient.myPattern.get(sequencePivot) == DupMeClient.opponentPattern.get(sequencePivot)) {
					score2+=3000;
					p2Score.setText(Integer.toString(score2));
					sequencePivot++;
				} else if (secondTurn == true) {
					sequencePivot++;
				}
				
		  }
		  else if(input == ("DIGIT4")) {
			  value = 4;
			  addToSequence(value);
			  clearButton();
			  btnF.setStyle("-fx-background-color:#FF9090; -fx-text-fill:#FFFFFF");
			  wordCount.setText(Integer.toString(++outOf));
			  
			  
			  String sequenceText = "" ;
			  playSound("pianoF3.mp3");
				for (int i = 0; i < DupMeClient.myPattern.size(); i++) {
					sequenceText = sequenceText + Integer.toString(DupMeClient.myPattern.get(i));
					System.out.print(DupMeClient.myPattern.get(i));
				}
				displayMessage.setText(sequenceText);
				System.out.println("\nEnd of Array");
				
				if(secondTurn == true && DupMeClient.myPattern.get(sequencePivot) == DupMeClient.opponentPattern.get(sequencePivot)) {
					score2+=3000;
					p2Score.setText(Integer.toString(score2));
					sequencePivot++;
				} else if (secondTurn == true) {
					sequencePivot++;
				}
				
		  }
		  else if(input == ("DIGIT7")) {
			  value = 7;
			  addToSequence(value);
			  clearButton();
			  btnJ.setStyle("-fx-background-color:#FF9090; -fx-text-fill:#FFFFFF");
			  wordCount.setText(Integer.toString(++outOf));
			  
			
			  String sequenceText = "" ;
			  playSound("pianoG3.mp3");
				for (int i = 0; i < DupMeClient.myPattern.size(); i++) {
					sequenceText = sequenceText + Integer.toString(DupMeClient.myPattern.get(i));
					System.out.print(DupMeClient.myPattern.get(i));
				}
				displayMessage.setText(sequenceText);
				System.out.println("\nEnd of Array");
				
				if(secondTurn == true && DupMeClient.myPattern.get(sequencePivot) == DupMeClient.opponentPattern.get(sequencePivot)) {
					score2+=3000;
					p2Score.setText(Integer.toString(score2));
					sequencePivot++;
				} else if (secondTurn == true) {
					sequencePivot++;
				}
				
		  }
		  else if(input == ("DIGIT8")) {
			  value = 8;
			  addToSequence(value);
			  clearButton();
			  btnK.setStyle("-fx-background-color:#FF9090; -fx-text-fill:#FFFFFF");
			  wordCount.setText(Integer.toString(++outOf));
			  
			  
			  playSound("pianoA3.mp3");
			  String sequenceText = "" ;
				for (int i = 0; i < DupMeClient.myPattern.size(); i++) {
					sequenceText = sequenceText + Integer.toString(DupMeClient.myPattern.get(i));
					System.out.print(DupMeClient.myPattern.get(i));
				}
				displayMessage.setText(sequenceText);
				System.out.println("\nEnd of Array");
				
				
				if(secondTurn == true && DupMeClient.myPattern.get(sequencePivot) == DupMeClient.opponentPattern.get(sequencePivot)) {
					score2+=3000;
					p2Score.setText(Integer.toString(score2));
					sequencePivot++;
				} else if (secondTurn == true) {
					sequencePivot++;
				}
				
		  }
		  else if(input == ("DIGIT9")) {
			  value = 9;
			  addToSequence(value);
			  clearButton();
			  btnL.setStyle("-fx-background-color:#FF9090; -fx-text-fill:#FFFFFF");
			  wordCount.setText(Integer.toString(++outOf));
			  
			  
			  String sequenceText = "" ;
			  playSound("pianoB3.mp3");
				for (int i = 0; i < DupMeClient.myPattern.size(); i++) {
					sequenceText = sequenceText + Integer.toString(DupMeClient.myPattern.get(i));
					System.out.print(DupMeClient.myPattern.get(i));
				}
				displayMessage.setText(sequenceText);
				System.out.println("\nEnd of Array");
				
				
				if(secondTurn == true && DupMeClient.myPattern.get(sequencePivot) == DupMeClient.opponentPattern.get(sequencePivot)) {
					score2+=3000;
					p2Score.setText(Integer.toString(score2));
					sequencePivot++;
				} else if (secondTurn == true) {
					sequencePivot++;
				}
				
		  }
		  else if(input == ("DIGIT0")) {
			  value = 0;
			  addToSequence(value);
			  clearButton();
			  btn8.setStyle("-fx-background-color:#FF9090; -fx-text-fill:#FFFFFF");
			  wordCount.setText(Integer.toString(++outOf));
			  
			 
			  String sequenceText = "" ;
			  playSound("pianoC4.mp3");
				for (int i = 0; i < DupMeClient.myPattern.size(); i++) {
					sequenceText = sequenceText + Integer.toString(DupMeClient.myPattern.get(i));
					System.out.print(DupMeClient.myPattern.get(i));
				}
				displayMessage.setText(sequenceText);
				System.out.println("\nEnd of Array");
				
				
				if(secondTurn == true && DupMeClient.myPattern.get(sequencePivot) == DupMeClient.opponentPattern.get(sequencePivot)) {
					score2+=3000;
					p2Score.setText(Integer.toString(score2));
					sequencePivot++;
				} else if (secondTurn == true) {
					sequencePivot++;
				}
				
		  	}
		  
		  if(outOf==nword)clearButton();
		  
		  }
	  }
	  
	  
	
	// Sending Messages
	  @FXML
	    void sendMessage(MouseEvent event) {
		  //send to server
		  messageType.setText("");
	    }
	 
	    void clearButton() {
		  btnA.setStyle("-fx-background-color:#E5E5E5; -fx-text-fill:#757575");
		  btnS.setStyle("-fx-background-color:#E5E5E5; -fx-text-fill:#757575");
		  btnD.setStyle("-fx-background-color:#E5E5E5; -fx-text-fill:#757575");
		  btnF.setStyle("-fx-background-color:#E5E5E5; -fx-text-fill:#757575");
		  btnJ.setStyle("-fx-background-color:#E5E5E5; -fx-text-fill:#757575");
		  btnK.setStyle("-fx-background-color:#E5E5E5; -fx-text-fill:#757575");
		  btnL.setStyle("-fx-background-color:#E5E5E5; -fx-text-fill:#757575");
		  btn8.setStyle("-fx-background-color:#E5E5E5; -fx-text-fill:#757575");
	    }
	    
	  
	  
	  
//////////////////////////////////////////////START////////////////////////////////////////
	  
	  
	  public void initialize() {
		  
		  	//set up word count
		  	nameTurn.setText("Player 1's turn");
		  	p1Name.setText(DupMeClient.name);
		  	p2Name.setText(DupMeClient.opponentName);
		    nword = (int) Math.ceil(Math.random()*10)+10;
		    outOf = 0;
		    wordMax.setText(Integer.toString(nword));
		    wordCount.setText(Integer.toString(outOf));
		    
		    
			try {
				turn1Start();
				//GET READY! > 321 > GO!
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("getReadyMessage error");
			}
		}
	  
	  
	  void turn1Start() throws InterruptedException {
		  displayMessage.setText("Player's 1 turn");
		     timeSeconds2 = 1; //duration
		     
		     Timer clock2 = new Timer();
		        clock2.scheduleAtFixedRate(new TimerTask() {
		            public void run() {
		                if(timeSeconds2 >= 0)
		                {
		                    timeSeconds2--; 
		                }
		                else {
		                    clock2.cancel();
		                    
		                    try {
								getReadyMessage();
								
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		                    
		                    //do something here when 3 secs countdown start
		                    
		                }
		            }
		        }, 1000,1000);
 }

	  void getReadyMessage() throws InterruptedException {
		  displayMessage.setText("GET READY!");
		     timeSeconds2 = 1; //duration
		     
		     Timer clock2 = new Timer();
		        clock2.scheduleAtFixedRate(new TimerTask() {
		            public void run() {
		                if(timeSeconds2 >= 0)
		                {
		                    timeSeconds2--; 
		                }
		                else {
		                    clock2.cancel();
		                    
		                    try {
								countDownMessage();
								
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		                    
		                    //do something here when 3 secs countdown start
		                    
		                }
		            }
		        }, 1000,1000);
 }
	  
	  @FXML
	  void countDownMessage() throws InterruptedException {
		     //countDownTimer.setVisible(true); // "timer" is a Text Object on screen
		  	displayMessage.setText("3"); 
		  	text = displayMessage.getText();
		     timeSeconds = Integer.parseInt(text);
		     
		     Timer clock = new Timer();
		        clock.scheduleAtFixedRate(new TimerTask() {
		            public void run() {
		                if(timeSeconds >= 0)
		                {
		                	displayMessage.setText(Integer.toString(timeSeconds));
		                    timeSeconds--; 
		                }
		                else {
		                    clock.cancel();
		                    displayMessage.setText("GO!");
		                    try {
								countDown();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		                    
		                  //do something here after says GO!
		                    wordCount.setVisible(true);
		                    wordMax.setVisible(true);
		                    slash.setVisible(true);
		                    counterBox.setVisible(true);
		                }
		            }
		        }, 1000,1000);
 }
	
	  @FXML
	  void countDown() throws InterruptedException { //Turn 10 secs timer
			     countDownTimer.setVisible(true); // "timer" is a Text Object on screen
			     text = countDownTimer.getText();
			     timeSeconds = Integer.parseInt(text);
			     keyboardOff = false;
			     
			     Timer clock = new Timer();
			        clock.scheduleAtFixedRate(new TimerTask() {
			            public void run() {
			                if(timeSeconds >= 0)
			                {
			                    countDownTimer.setText(Integer.toString(timeSeconds));
			                    timeSeconds--; 
			                    
			                    if(timeSeconds==0) keyboardOff=true;
			                }
			                else {
			                    clock.cancel();
			                    try {
									turn2Start();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
			                    
			                }
			            }
			        }, 1000,1000);
	    }
	  
	
	  ////////////////////////////////// second turn //////////////////////////////////////////////////////
	  
	  void turn2Start() throws InterruptedException {
		  
		  secondTurn = true;
		  
		  displayMessage.setText("TIME'S UP!");
		     timeSeconds2 = 1; //duration
		     
		     Timer clock2 = new Timer();
		        clock2.scheduleAtFixedRate(new TimerTask() {
		            public void run() {
		                if(timeSeconds2 >= 0)
		                {
		                    timeSeconds2--; 
		                }
		                else {
		                    clock2.cancel();
		                    
		                    try {
								getReadyMessage2();
								
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}  
		                    
		                    ////////////////////////////////reset everything///////////////////
		                    wordCount.setVisible(false);
		                    wordMax.setVisible(false);
		                    slash.setVisible(false);
		                    counterBox.setVisible(false);
		                    countDownTimer.setVisible(false);
		                    countDownTimer.setText("20");
		                    outOf=0;
		                    wordCount.setText(Integer.toString(outOf));
		                    
		                    String sequenceText = "" ;
		    				for (int i = 0; i < DupMeClient.myPattern.size(); i++) {
		    					sequenceText = sequenceText + Integer.toString(DupMeClient.myPattern.get(i));
		    				}
		    				lastPattern.setText(sequenceText);
		    				
		                    DupMeClient.opponentPattern = DupMeClient.myPattern;
		                    DupMeClient.myPattern = new ArrayList<Integer>();
		                    
		                
		                }
		            }
		        }, 1000,1000);
 }
	  
	  void getReadyMessage2() throws InterruptedException {
		  displayMessage.setText("Player 2 GET READY!");
		     timeSeconds2 = 1; //duration
		     
		     Timer clock2 = new Timer();
		        clock2.scheduleAtFixedRate(new TimerTask() {
		            public void run() {
		                if(timeSeconds2 >= 0)
		                {
		                    timeSeconds2--; 
		                }
		                else {
		                    clock2.cancel();
		                    
		                    try {
								countDownMessage2();
								
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		                    
		                    //do something here when 3 secs countdown start
		                    
		                }
		            }
		        }, 1000,1000);
 }
	  
	  @FXML
	  void countDownMessage2() throws InterruptedException {
		     //countDownTimer.setVisible(true); // "timer" is a Text Object on screen
		  	displayMessage.setText("3"); 
		  	text = displayMessage.getText();
		     timeSeconds = Integer.parseInt(text);
		     
		     Timer clock = new Timer();
		        clock.scheduleAtFixedRate(new TimerTask() {
		            public void run() {
		                if(timeSeconds >= 0)
		                {
		                	displayMessage.setText(Integer.toString(timeSeconds));
		                    timeSeconds--; 
		                }
		                else {
		                    clock.cancel();
		                    displayMessage.setText("DupMe!");
		                    try {
								countDown2();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		                    
		                  //do something here after says GO!
		                    wordCount.setVisible(true);
		                    wordMax.setVisible(true);
		                    slash.setVisible(true);
		                    counterBox.setVisible(true);
		                    yourPattern.setVisible(true);
		                    lastPattern.setVisible(true);
		                }
		            }
		        }, 1000,1000);
 }
	
	  @FXML
	  void countDown2() throws InterruptedException { //Turn 10 secs timer
			     countDownTimer.setVisible(true); // "timer" is a Text Object on screen
			     text = countDownTimer.getText();
			     timeSeconds = Integer.parseInt(text);
			     keyboardOff = false;
			     
			     Timer clock = new Timer();
			        clock.scheduleAtFixedRate(new TimerTask() {
			            public void run() {
			                if(timeSeconds >= 0)
			                {
			                    countDownTimer.setText(Integer.toString(timeSeconds));
			                    timeSeconds--; 
			                    
			                    if(timeSeconds==0) keyboardOff=true;
			                }
			                else {
			                    clock.cancel();
			                    displayMessage.setText("TIME'S UP!");
			                    DupMeClient.myPattern = new ArrayList<Integer>();
								DupMeClient.opponentPattern = new ArrayList<Integer>();
								outOf=0;
								sequencePivot=0;
								secondTurn=false;
								
								initialize();
			                }
			            }
			        }, 1000,1000);
	    }
}	  
	  
	///////////////////////////////OFFLINE/////////////////////////////////////////////////////////////////
	
	
//	  void turn3Start() throws InterruptedException {
//		  displayMessage.setText("Player's 2 turn");
//		     timeSeconds2 = 1; //duration
//		     
//		     Timer clock2 = new Timer();
//		        clock2.scheduleAtFixedRate(new TimerTask() {
//		            public void run() {
//		                if(timeSeconds2 >= 0)
//		                {
//		                    timeSeconds2--; 
//		                }
//		                else {
//		                    clock2.cancel();
//		                    
//		                    try {
//								getReadyMessage3();
//								
//								
//							} catch (InterruptedException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//		                    
//		                    //do something here when 3 secs countdown start
//		                    
//		                }
//		            }
//		        }, 1000,1000);
// }
//
//	  void getReadyMessage3() throws InterruptedException {
//		  displayMessage.setText("GET READY!");
//		     timeSeconds2 = 1; //duration
//		     
//		     Timer clock2 = new Timer();
//		        clock2.scheduleAtFixedRate(new TimerTask() {
//		            public void run() {
//		                if(timeSeconds2 >= 0)
//		                {
//		                    timeSeconds2--; 
//		                }
//		                else {
//		                    clock2.cancel();
//		                    
//		                    try {
//								countDownMessage3();
//								
//								
//							} catch (InterruptedException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//		                    
//		                    //do something here when 3 secs countdown start
//		                    
//		                }
//		            }
//		        }, 1000,1000);
// }
//	  
//	  @FXML
//	  void countDownMessage3() throws InterruptedException {
//		     //countDownTimer.setVisible(true); // "timer" is a Text Object on screen
//		  	displayMessage.setText("3"); 
//		  	text = displayMessage.getText();
//		     timeSeconds = Integer.parseInt(text);
//		     
//		     Timer clock = new Timer();
//		        clock.scheduleAtFixedRate(new TimerTask() {
//		            public void run() {
//		                if(timeSeconds >= 0)
//		                {
//		                	displayMessage.setText(Integer.toString(timeSeconds));
//		                    timeSeconds--; 
//		                }
//		                else {
//		                    clock.cancel();
//		                    displayMessage.setText("GO!");
//		                    try {
//								countDown3();
//							} catch (InterruptedException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//		                    
//		                  //do something here after says GO!
//		                    wordCount.setVisible(true);
//		                    wordMax.setVisible(true);
//		                    slash.setVisible(true);
//		                    counterBox.setVisible(true);
//		                }
//		            }
//		        }, 1000,1000);
// }
//	
//	  @FXML
//	  void countDown3() throws InterruptedException { //Turn 10 secs timer
//			     countDownTimer.setVisible(true); // "timer" is a Text Object on screen
//			     text = countDownTimer.getText();
//			     timeSeconds = Integer.parseInt(text);
//			     keyboardOff = false;
//			     
//			     Timer clock = new Timer();
//			        clock.scheduleAtFixedRate(new TimerTask() {
//			            public void run() {
//			                if(timeSeconds >= 0)
//			                {
//			                    countDownTimer.setText(Integer.toString(timeSeconds));
//			                    timeSeconds--; 
//			                    
//			                    if(timeSeconds==0) keyboardOff=true;
//			                }
//			                else {
//			                    clock.cancel();
//			                    try {
//									turn4Start();
//								} catch (InterruptedException e) {
//									// TODO Auto-generated catch block
//									e.printStackTrace();
//								}
//			                    
//			                }
//			            }
//			        }, 1000,1000);
//	    }
//	  
//	
//	  ////////////////////////////////// second turn //////////////////////////////////////////////////////
//	  
//	  void turn4Start() throws InterruptedException {
//		  
//		  secondTurn = true;
//		  
//		  displayMessage.setText("TIME'S UP!");
//		     timeSeconds2 = 1; //duration
//		     
//		     Timer clock2 = new Timer();
//		        clock2.scheduleAtFixedRate(new TimerTask() {
//		            public void run() {
//		                if(timeSeconds2 >= 0)
//		                {
//		                    timeSeconds2--; 
//		                }
//		                else {
//		                    clock2.cancel();
//		                    
//		                    try {
//								getReadyMessage4();
//								
//								
//							} catch (InterruptedException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}  
//		                    
//		                    ////////////////////////////////reset everything///////////////////
//		                    wordCount.setVisible(false);
//		                    wordMax.setVisible(false);
//		                    slash.setVisible(false);
//		                    counterBox.setVisible(false);
//		                    countDownTimer.setVisible(false);
//		                    countDownTimer.setText("20");
//		                    outOf=0;
//		                    wordCount.setText(Integer.toString(outOf));
//		                    
//		                    String sequenceText = "" ;
//		    				for (int i = 0; i < DupMeClient.myPattern.size(); i++) {
//		    					sequenceText = sequenceText + Integer.toString(DupMeClient.myPattern.get(i));
//		    				}
//		    				lastPattern.setText(sequenceText);
//		    				
//		                    DupMeClient.opponentPattern = DupMeClient.myPattern;
//		                    DupMeClient.myPattern = new ArrayList<Integer>();
//		                    
//		                
//		                }
//		            }
//		        }, 1000,1000);
// }
//	  
//	  void getReadyMessage4() throws InterruptedException {
//		  displayMessage.setText("Player 2 GET READY!");
//		     timeSeconds2 = 1; //duration
//		     
//		     Timer clock2 = new Timer();
//		        clock2.scheduleAtFixedRate(new TimerTask() {
//		            public void run() {
//		                if(timeSeconds2 >= 0)
//		                {
//		                    timeSeconds2--; 
//		                }
//		                else {
//		                    clock2.cancel();
//		                    
//		                    try {
//								countDownMessage4();
//								
//								
//							} catch (InterruptedException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//		                    
//		                    //do something here when 3 secs countdown start
//		                    
//		                }
//		            }
//		        }, 1000,1000);
// }
//	  
//	  @FXML
//	  void countDownMessage4() throws InterruptedException {
//		     //countDownTimer.setVisible(true); // "timer" is a Text Object on screen
//		  	displayMessage.setText("3"); 
//		  	text = displayMessage.getText();
//		     timeSeconds = Integer.parseInt(text);
//		     
//		     Timer clock = new Timer();
//		        clock.scheduleAtFixedRate(new TimerTask() {
//		            public void run() {
//		                if(timeSeconds >= 0)
//		                {
//		                	displayMessage.setText(Integer.toString(timeSeconds));
//		                    timeSeconds--; 
//		                }
//		                else {
//		                    clock.cancel();
//		                    displayMessage.setText("DupMe!");
//		                    try {
//								countDown4();
//							} catch (InterruptedException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//		                    
//		                  //do something here after says GO!
//		                    wordCount.setVisible(true);
//		                    wordMax.setVisible(true);
//		                    slash.setVisible(true);
//		                    counterBox.setVisible(true);
//		                    yourPattern.setVisible(true);
//		                    lastPattern.setVisible(true);
//		                }
//		            }
//		        }, 1000,1000);
// }
//	
//	  @FXML
//	  void countDown4() throws InterruptedException { //Turn 10 secs timer
//			     countDownTimer.setVisible(true); // "timer" is a Text Object on screen
//			     text = countDownTimer.getText();
//			     timeSeconds = Integer.parseInt(text);
//			     keyboardOff = false;
//			     
//			     Timer clock = new Timer();
//			        clock.scheduleAtFixedRate(new TimerTask() {
//			            public void run() {
//			                if(timeSeconds >= 0)
//			                {
//			                    countDownTimer.setText(Integer.toString(timeSeconds));
//			                    timeSeconds--; 
//			                    
//			                    if(timeSeconds==0) keyboardOff=true;
//			                }
//			                else {
//			                    clock.cancel();
//			                    displayMessage.setText("TIME'S UP!");
//			                }
//			            }
//			        }, 1000,1000);
//	    }
//	  
//	  
//	///////////////////////////////OFFLINE/////////////////////////////////////////////////////////////////
//	
//	
//	
//	
//	
//	  
//	
//	
//}
