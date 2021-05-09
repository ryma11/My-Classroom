package VoiceRecog;

import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import mainpage.Events;

public class VoiceR {
	SpeechResult sr;
	LiveSpeechRecognizer recognize;
	Configuration conf;
	Events e ;
	String work= null;
	JTextField tt;
	public VoiceR(JTextField t) throws IOException {
		tt=t;
		JOptionPane.showMessageDialog(null,"You can speak rghit now");
	conf =new Configuration();
	conf.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
	conf.setDictionaryPath("/Users/Rim/eclipse-workspace/Myclassroom/src/VoiceRecog/1563.dic");
	conf.setLanguageModelPath("/Users/Rim/eclipse-workspace/Myclassroom/src/VoiceRecog/1563.lm");
	
	recognize = new LiveSpeechRecognizer(conf);
	recognize.startRecognition(true);
	 while ((sr=recognize.getResult())!=null) {
		 
		 String command =sr.getHypothesis();
		 System.out.println("output command is: "+command);
		 if (command.equalsIgnoreCase("What we have today")) {
			work= "open";
		 }
		 
		 if(work!=null) {
			 recognize.stopRecognition();
			  e =new Events(tt);
		 }
		 
	 }
	
	}

}
