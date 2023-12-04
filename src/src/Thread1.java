public class Thread1 extends Thread {
    public void run() {
        FilePlayer fp = new FilePlayer();
        String[] paths = {"src/src/do.wav", "src/src/mi.wav", "src/src/sol.wav", "src/src/si.wav", "src/src/do-octave.wav"};
        for (String path : paths) {
            fp.play(path);
        }
    }
};
