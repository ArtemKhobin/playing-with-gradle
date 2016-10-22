import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class MySimpleTest {
  @Test
  public void bitwiseAndWithPaddings() throws Exception {
    String left = "11110101";
    String right = "1111";

    assertThat(BitwiseCalc.and(left, right), is("0000" + "0101"));
  }

  @Test
  public void bitwiseAndWithPaddings2() throws Exception {
    String left = "1111";
    String right = "10101010";

    assertThat(BitwiseCalc.and(left, right), is("0000" + "1010"));
  }
}
