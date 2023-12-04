public class Thread2 {
    public void run() {
        FilePlayer fp = new FilePlayer();
        String[] paths = {"re.wav", "fa.wav", "la.wav", "do-octave.wav"};
        for (String path : paths) {
            fp.play(path);
        }
    }
}
