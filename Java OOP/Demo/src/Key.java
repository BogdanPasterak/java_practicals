
public class Key {

	public static void main(String[] args) {
		// 
        java.io.InputStreamReader reader = new java.io.InputStreamReader(System.in);
        boolean b = false;
        while(!b)
        {
            try 
            {
                int key = System.in.read();
                // read a character and process it 
                System.out.println("key pressed");
                b = true;
             } catch (java.io.IOException ioex) {
                System.out.println("IO Exception");
             }

            System.out.println("I em");
             try {
                Thread.sleep(50);
                System.out.println("nop yet");
             } catch (InterruptedException ex) {
                // can't do much about it can we? Ignoring 
                System.out.println("Interrupted Exception");
             }
        }

	}

}
