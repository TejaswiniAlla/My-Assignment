package week1.day2;

public class browser {

	public void launchbrowser(String browsername) {
		// TODO Auto-generated method stub
		
			System.out.println("Browser launched successfully");
		}
		public void loadurl() {
			System.out.println("Application url loaded successfully");
		}
		public static void main(String[] args) {
			browser br = new browser();
			br.launchbrowser("chrome");
			br.loadurl();
			}

	}


