import static java.lang.System.out;
import static java.lang.System.in;

void main() throws Exception {
  String[] cmd = {
      "/bin/sh",
      "-c",
      "stty raw -echo </dev/tty"
  };
  Runtime.getRuntime()
      .exec(cmd)
      .waitFor();

  int c;
  while ((c = in.read()) != 'x') {
    out.print("." + (char) c);
  }

}
