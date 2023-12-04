package TwinkleTwinkleLittleStar;

public class Thread2 extends Thread {
    public void run() {
        FilePlayer fp = new FilePlayer();
        String[] paths = {"do.wav", "do.wav", "sol.wav", "sol.wav", "la.wav", "la.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "re.wav", "do.wav"};
        for (String path : paths) {
            fp.play(path);
        }
    }
}
