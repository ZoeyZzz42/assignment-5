package TwinkleTwinkleLittleStar;

public class Thread2 extends Thread {
    public void run() {
        FilePlayer fp = new FilePlayer();
        String[] paths = {"src/src/do.wav", "src/src/do.wav", "src/src/sol.wav", "src/src/sol.wav", "src/src/la.wav", "src/src/la.wav", "src/src/sol.wav", "src/src/fa.wav", "src/src/fa.wav", "src/src/mi.wav", "src/src/mi.wav", "src/src/re.wav", "src/src/re.wav", "src/src/do.wav"};
        for (String path : paths) {
            fp.play(path);
        }
    }
}
