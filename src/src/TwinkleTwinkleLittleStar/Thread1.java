package TwinkleTwinkleLittleStar;

public class Thread1 extends Thread {
    public void run() {
        FilePlayer fp = new FilePlayer();
        String[] paths = {"do.wav", "do.wav", "sol.wav", "sol.wav", "la.wav", "la.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "re.wav", "do.wav",
                "sol.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "sol.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav"};
        for (String path : paths) {
            fp.play(path);
        }
    }
}
