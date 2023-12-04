public class Thread2 extends Thread {
    public void run() {
        FilePlayer fp = new FilePlayer();
        String[] paths = {"src/src/re.wav", "src/src/fa.wav", "src/src/la.wav", "src/src/do-octave.wav"};
        for (String path : paths) {
            fp.play(path);
        }
    }
}
