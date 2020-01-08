package com.pursuetao.fayelee0.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestMaximumNumberOfBalloons {
    @Test
    public void maxNumberOfBalloons() {
        assertThat(MaximumNumberOfBalloons.maxNumberOfBalloons("nlaebolko"), is(1));
        assertThat(MaximumNumberOfBalloons.maxNumberOfBalloons("loonbalxballpoon"), is(2));
        assertThat(MaximumNumberOfBalloons.maxNumberOfBalloons("leetcode"), is(0));
        assertThat(MaximumNumberOfBalloons.maxNumberOfBalloons("balon"), is(0));
    }

    @Test
    public void maxNumberOfBalloons2() {
        assertThat(MaximumNumberOfBalloons.maxNumberOfBalloons2("nlaebolko"), is(1));
        assertThat(MaximumNumberOfBalloons.maxNumberOfBalloons2("loonbalxballpoon"), is(2));
        assertThat(MaximumNumberOfBalloons.maxNumberOfBalloons2("leetcode"), is(0));
        assertThat(MaximumNumberOfBalloons.maxNumberOfBalloons2("balon"), is(0));
        assertThat(MaximumNumberOfBalloons.maxNumberOfBalloons2("krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw"), is(10));
    }
}
