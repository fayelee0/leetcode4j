package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode1189 {
    @Test
    public void maxNumberOfBalloons() {
        assertThat(Code1189.maxNumberOfBalloons("nlaebolko"), is(1));
        assertThat(Code1189.maxNumberOfBalloons("loonbalxballpoon"), is(2));
        assertThat(Code1189.maxNumberOfBalloons("leetcode"), is(0));
        assertThat(Code1189.maxNumberOfBalloons("balon"), is(0));
    }

    @Test
    public void maxNumberOfBalloons2() {
        assertThat(Code1189.maxNumberOfBalloons2("nlaebolko"), is(1));
        assertThat(Code1189.maxNumberOfBalloons2("loonbalxballpoon"), is(2));
        assertThat(Code1189.maxNumberOfBalloons2("leetcode"), is(0));
        assertThat(Code1189.maxNumberOfBalloons2("balon"), is(0));
        assertThat(Code1189.maxNumberOfBalloons2("krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw"), is(10));
    }
}
