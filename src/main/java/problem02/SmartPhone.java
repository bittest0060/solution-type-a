package problem02;


public class SmartPhone extends MusicPhone {
	
	
	@Override
	public void execute(String function) {
		if (function.equals("통화하기")) {
			System.out.println(playMusic());
			
			
		}if(function.equals("앱실행")) {
			
		}
		super.execute(function);
		System.out.println(runApp());	
		//System.out.println(runApp());	
	}

	@Override
	public String playMusic() {
		return "스트리밍";
	}
	
	public String runApp() {
		String Function = "앱실행";
		return Function;
	}

	
}