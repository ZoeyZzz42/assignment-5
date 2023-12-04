public class Thread1 extends Thread {
    public void run() {
        FilePlayer fp = new FilePlayer();
        String[] paths = {"do.wav", "mi.wav", "sol.wav", "si.wav", "do-octave.wav"};
        for (String path : paths) {
            fp.play(path);
        }
    }
};
